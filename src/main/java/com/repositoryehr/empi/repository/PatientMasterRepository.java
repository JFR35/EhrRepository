package com.repositoryehr.empi.repository;

import com.repositoryehr.empi.model.LocalPatientEmpi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PatientMasterRepository extends JpaRepository<LocalPatientEmpi, Long> {

    Optional<LocalPatientEmpi> findByNationalId(String nationalId);
    // List<PatientMasterIndex> findByAssignedPractitionerFhirId(String fhirId);
    Optional<LocalPatientEmpi> findByEhrId(String ehrId);
}