package com.repositoryehr.empi.service;

import com.repositoryehr.empi.model.PatientLocalEmpiResponseDto;

public interface LocalPatientService {

    PatientLocalEmpiResponseDto registerNewPatient(String nationalId);
    PatientLocalEmpiResponseDto getPatientByEhrId(String ehrId);
}
