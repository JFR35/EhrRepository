package com.repositoryehr.ehrrepository.service.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.repositoryehr.ehrrepository.service.CreateEhrIdService;
import org.ehrbase.openehr.sdk.client.openehrclient.OpenEhrClient;
import org.ehrbase.openehr.sdk.generator.commons.aql.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.*;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class CreateEhrIdServiceImpl implements CreateEhrIdService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private final OpenEhrClient openEhrClient;
    private final RestTemplate restTemplate;

    @Value("${ehrbase.url}")
    private String ehrBaseUrl;

    public CreateEhrIdServiceImpl(OpenEhrClient openEhrClient, RestTemplate restTemplate) {
        this.openEhrClient = openEhrClient;
        this.restTemplate = restTemplate;
    }

    @Override
    public String createPatientEhr(String subjectId, String namespace) {
        try {
            UUID ehrId = openEhrClient.ehrEndpoint().createEhr();
            logger.info("EHR creado exitosamente. ID: {}", ehrId);
            return ehrId.toString();
        } catch (Exception e) {
            logger.error("Error creando EHR", e);
            throw new RuntimeException("Error al crear EHR: " + e.getMessage());
        }
    }

    @Override
    public String getEhrDetails(String ehrId) {
        try {
            String url = String.format("%s/ehr/%s", ehrBaseUrl, ehrId);
            return restTemplate.getForObject(url, String.class);
        } catch (Exception e) {
            logger.warn("Error al obtener EHR con ID: {}", ehrId, e);
            throw new RuntimeException("Error obteniendo EHR: " + e.getMessage());
        }
    }

    @Override
    public List<String> getAllEhrIds() {
        try {
            // Envolvér la query AQL en un objeto JSON
            ObjectMapper mapper = new ObjectMapper();
            ObjectNode jsonQuery = mapper.createObjectNode();
            jsonQuery.put("q", "SELECT e/ehr_id/value FROM EHR e");

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.setAccept(List.of(MediaType.APPLICATION_JSON));
            HttpEntity<String> request = new HttpEntity<>(mapper.writeValueAsString(jsonQuery), headers);

            ResponseEntity<String> response = restTemplate.exchange(
                    ehrBaseUrl + "/query/aql",
                    HttpMethod.POST,
                    request,
                    String.class
            );

            String responseBody = response.getBody();
            logger.debug("Respuesta bruta del servidor EHRbase:\n{}", responseBody);
            JsonNode root = mapper.readTree(response.getBody());

            List<String> ehrIds = new ArrayList<>();
            for (JsonNode row : root.path("rows")) {
                ehrIds.add(row.get(0).asText());
            }

            return ehrIds;

        } catch (Exception e) {
            logger.error("Error ejecutando query de EHRs", e);
            return Collections.emptyList();
        }
    }

}