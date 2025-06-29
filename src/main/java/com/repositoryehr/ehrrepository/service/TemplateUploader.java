package com.repositoryehr.ehrrepository.service;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;

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

    public TemplateUploader(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @PostConstruct
    public void init() {
        if (templateUploadUrl == null || templateUploadUrl.isBlank()) {
            throw new IllegalStateException("La URL de subida de plantillas no está configurada.");
        }
        uploadTemplateFromResources("patient_visit.opt");
    }

    public void uploadTemplateFromResources(String templateName) {
        try {
            // Cargar desde classpath: resources/templates/
            ClassPathResource resource = new ClassPathResource("templates/" + templateName);

            String xml = new String(resource.getInputStream().readAllBytes(), StandardCharsets.UTF_8);

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_XML);
            headers.setBasicAuth(ehrBaseUsername, ehrBasePassword);

            HttpEntity<String> request = new HttpEntity<>(xml, headers);

            ResponseEntity<String> response = restTemplate
                    .postForEntity(templateUploadUrl, request, String.class);

            if (response.getStatusCode().is2xxSuccessful()) {
                System.out.println("✅ Plantilla subida con éxito.");
            } else {
                System.err.println("Falló al subir plantilla. Código: " + response.getStatusCode());
            }

        } catch (IOException e) {
            throw new RuntimeException("No se pudo leer la plantilla desde resources", e);
        }
    }
}
