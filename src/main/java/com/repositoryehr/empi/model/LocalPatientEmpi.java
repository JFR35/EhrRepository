package com.repositoryehr.empi.model;

import jakarta.persistence.*;
import jdk.jfr.Name;
import org.ehrbase.openehr.sdk.generator.commons.annotations.Entity;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.time.LocalDateTime;

@Entity
@Table(name = "local_patient_empi")
public class LocalPatientEmpi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Name("internal_patient_id")
    private Long patientId;

    @Column(name = "national_id", unique = true, nullable = false)
    private String nationalId;

    @Column(unique = true)
    private String ehrId; // ID del EHR en EHRbase

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }

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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
