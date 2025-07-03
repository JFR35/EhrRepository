package com.repositoryehr.ehrrepository.service.impl;

import com.repositoryehr.ehrrepository.model.dto.EhrTemplateSummaryDTO;
import com.repositoryehr.ehrrepository.service.ShowEhrIdWithTemplatesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ShowEhrIdWithTemplatesServiceImpl implements ShowEhrIdWithTemplatesService {

    private static final Logger logger = LoggerFactory.getLogger(ShowEhrIdWithTemplatesServiceImpl.class);

    private final RestTemplate restTemplate;

    public ShowEhrIdWithTemplatesServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<EhrTemplateSummaryDTO> getAllEhrWithTemplates() {
        return null;
    }
}
