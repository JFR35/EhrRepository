package com.repositoryehr.empi.model;


import jakarta.persistence.Column;
import jdk.jfr.Name;

import java.time.LocalDateTime;

public class PatientLocalEmpiResponseDto {

    private Long patientId;
    private String nationalId;
    private String ehrId; // ID del EHR en EHRbase

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getEhrId() {
        return ehrId;
    }

    public void setEhrId(String ehrId) {
        this.ehrId = ehrId;
    }
}
