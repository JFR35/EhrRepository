package com.repositoryehr.ehrrepository.service;

import com.repositoryehr.ehrrepository.service.exception.EhrbaseConnectionException;

public interface VerifyEhrConnectionService {

    boolean verifyEhrconn() throws EhrbaseConnectionException;
}
