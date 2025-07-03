package com.repositoryehr.ehrrepository.service.impl;

import com.repositoryehr.ehrrepository.model.dto.TemplateInfoDTO;
import com.repositoryehr.ehrrepository.service.ShowTemplatesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ShowTemplatesServiceImpl implements ShowTemplatesService {

    private static final Logger logger = LoggerFactory.getLogger(ShowTemplatesServiceImpl.class);

    @Value("${ehrbase.url.templates}")
    private String getEhrBaseUrl;

    private final RestTemplate restTemplate;

    public ShowTemplatesServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Optional<List> getAllTemplates() {
        logger.info("Buscando plantillas...");
        try{
            TemplateInfoDTO[] templateInfoDTOS = restTemplate.getForObject(getEhrBaseUrl, TemplateInfoDTO[].class);
            return Optional.of(Arrays.asList(templateInfoDTOS));
        }catch (Exception e){
            return Optional.empty();
        }
    }
}
