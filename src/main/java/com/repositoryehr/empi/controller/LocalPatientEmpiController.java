package com.repositoryehr.empi.controller;

import com.repositoryehr.empi.model.PatientLocalEmpiResponseDto;
import com.repositoryehr.empi.service.LocalPatientService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/local-patient")
public class LocalPatientEmpiController {

    private final LocalPatientService localPatientService;

    public LocalPatientEmpiController(LocalPatientService localPatientService) {
        this.localPatientService = localPatientService;
    }

    @PostMapping("/create")
    public PatientLocalEmpiResponseDto createNewPatient(@RequestParam String nationalId) {
        return localPatientService.registerNewPatient(nationalId);
    }

    @GetMapping("/{ehrId}")
    public PatientLocalEmpiResponseDto getPatientByEhrId(@PathVariable String ehrId) {
        return localPatientService.getPatientByEhrId(ehrId);
    }
}
