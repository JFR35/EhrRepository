package com.repositoryehr.ehrrepository.controller;

import com.repositoryehr.ehrrepository.service.CreateEhrIdService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/ehr")
public class EhrController {

    private final CreateEhrIdService createEhrIdService;

    public EhrController(CreateEhrIdService createEhrIdService) {
        this.createEhrIdService = createEhrIdService;
    }
    /*
    @PostMapping
    public ResponseEntity<?> createEhr() {
        try {
            String ehrId = createEhrIdService.createPatientEhr(null, null);
            return ResponseEntity.ok(ehrId);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error creando EHR: " + e.getMessage());
        }
    }
     */

    @PostMapping
    public ResponseEntity<?> createEhr() {
        try {
            String ehrId = createEhrIdService.createPatientEhr(null, null);
            Map<String, String> response = Map.of("ehr_id", ehrId);
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(Map.of("error", "Error creando EHR", "details", e.getMessage()));
        }
    }

    @GetMapping("/{ehrId}")
    public ResponseEntity<?> getEhr(@PathVariable String ehrId) {
        try {
            String ehrDetails = createEhrIdService.getEhrDetails(ehrId);
            return ResponseEntity.ok(ehrDetails);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("EHR no encontrado: " + e.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<?> listAllEhrs() {
        try {
            List<String> ehrIds = createEhrIdService.getAllEhrIds();
            return ResponseEntity.ok(Map.of("ehrIds", ehrIds));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(Map.of("error", "Error al listar EHRs", "details", e.getMessage()));
        }
    }

}