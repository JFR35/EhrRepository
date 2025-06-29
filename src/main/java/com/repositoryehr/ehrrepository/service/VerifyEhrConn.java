package com.repositoryehr.ehrrepository.service;

import com.repositoryehr.ehrrepository.service.exception.EhrbaseConnectionException;

public interface VerifyEhrConn {

    boolean verifyEhrconn() throws EhrbaseConnectionException;
}
