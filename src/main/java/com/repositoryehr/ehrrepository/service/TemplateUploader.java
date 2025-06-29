package com.repositoryehr.ehrrepository.service;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Service
public class TemplateUploader {

    private final RestTemplate restTemplate;
    @Value("${ehrbase.url}")
    private String ehrBaseUrl;

    @Value("${ehrbase.username}")
    private String ehrBaseUsername;

    @Value("${ehrbase.password}")
    private String ehrBasePassword;

    @Value("${ehrbase.template-upload-url}")
    private String templateUploadUrl;

    // Nombre de la plantilla (sin extensión)
    private static final String TEMPLATE_ID = "Patient_Visit"; // Exactamente como está en el .opt

    public TemplateUploader(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @PostConstruct
    public void init() {
        if (templateUploadUrl == null || templateUploadUrl.isBlank()) {
            throw new IllegalStateException("La URL de subida de plantillas no está configurada.");
        }

        try {
            if (!templateExists(TEMPLATE_ID)) {
                uploadTemplateFromResources("patient_visit.opt");
            } else {
                System.out.println("ℹ️ La plantilla " + TEMPLATE_ID + " ya existe en EHRbase, no se volverá a subir.");
            }
        } catch (Exception e) {
            System.err.println("⚠️ Error durante la inicialización de plantillas: " + e.getMessage());
            // No relanzamos la excepción para permitir que la aplicación continúe
        }
    }

    public void uploadTemplateFromResources(String templateName) {
        try {
            ClassPathResource resource = new ClassPathResource("templates/" + templateName);
            String xml = new String(resource.getInputStream().readAllBytes(), StandardCharsets.UTF_8);

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_XML);
            headers.setBasicAuth(ehrBaseUsername, ehrBasePassword);

            HttpEntity<String> request = new HttpEntity<>(xml, headers);

            ResponseEntity<String> response = restTemplate.postForEntity(
                    templateUploadUrl,
                    request,
                    String.class);

            if (response.getStatusCode().is2xxSuccessful()) {
                System.out.println("✅ Plantilla " + TEMPLATE_ID + " subida con éxito.");
            } else {
                System.err.println("⚠️ Código de respuesta inesperado al subir plantilla: " +
                        response.getStatusCode());
            }

        } catch (HttpClientErrorException.Conflict e) {
            System.out.println("ℹ️ La plantilla " + TEMPLATE_ID + " ya existe (confirmado durante subida)");
        } catch (IOException e) {
            throw new RuntimeException("❌ No se pudo leer la plantilla desde resources", e);
        }
    }

    private boolean templateExists(String templateId) {
        String checkUrl = ehrBaseUrl + "/rest/openehr/v1/definition/template/adl1.4/" + templateId;
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setBasicAuth(ehrBaseUsername, ehrBasePassword);

            ResponseEntity<String> response = restTemplate.exchange(
                    checkUrl,
                    HttpMethod.GET,
                    new HttpEntity<>(headers),
                    String.class);

            return response.getStatusCode().is2xxSuccessful();
        } catch (HttpClientErrorException.NotFound e) {
            return false;
        } catch (Exception e) {
            System.err.println("⚠️ Error verificando existencia de plantilla: " + e.getMessage());
            return false; // Asumimos que no existe si hay error
        }
    }
}