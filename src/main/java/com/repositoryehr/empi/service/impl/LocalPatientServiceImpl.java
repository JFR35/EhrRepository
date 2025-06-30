package com.repositoryehr.empi.service.impl;

import com.repositoryehr.empi.model.LocalPatientEmpi;
import com.repositoryehr.empi.model.PatientLocalEmpiResponseDto;
import com.repositoryehr.empi.repository.PatientMasterRepository;
import com.repositoryehr.empi.service.LocalPatientService;
import org.springframework.stereotype.Service;

@Service
public class LocalPatientServiceImpl implements LocalPatientService {

    private final PatientMasterRepository patientMasterRepository;

    public LocalPatientServiceImpl(PatientMasterRepository patientMasterRepository) {
        this.patientMasterRepository = patientMasterRepository;
    }

    @Override
    public PatientLocalEmpiResponseDto registerNewPatient(String nationalId) {
        // Comprobamos si ya existe
        return patientMasterRepository.findByNationalId(nationalId)
                .map(this::toDto)
                .orElseGet(() -> {
                    LocalPatientEmpi newPatient = new LocalPatientEmpi();
                    newPatient.setNationalId(nationalId);
                    // Aquí luego se le puede asociar un ehrId si se crea vía REST
                    LocalPatientEmpi saved = patientMasterRepository.save(newPatient);
                    return toDto(saved);
                });
    }

    @Override
    public PatientLocalEmpiResponseDto getPatientByEhrId(String ehrId) {
        return patientMasterRepository.findByEhrId(ehrId)
                .map(this::toDto)
                .orElseThrow(() -> new RuntimeException("Paciente no encontrado con ehrId: " + ehrId));
    }

    private PatientLocalEmpiResponseDto toDto(LocalPatientEmpi entity) {
        PatientLocalEmpiResponseDto dto = new PatientLocalEmpiResponseDto();
        dto.setPatientId(entity.getPatientId());
        dto.setNationalId(entity.getNationalId());
        dto.setEhrId(entity.getEhrId());
        return dto;
    }
}
