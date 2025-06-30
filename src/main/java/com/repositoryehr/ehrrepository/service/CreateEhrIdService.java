package com.repositoryehr.ehrrepository.service;

import java.util.List;

public interface CreateEhrIdService {
    String createPatientEhr(String subjectId, String namespace);
    String getEhrDetails(String ehrId);
    List<String> getAllEhrIds();

}