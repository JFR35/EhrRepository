package com.repositoryehr.ehrrepository.service;

import com.repositoryehr.ehrrepository.model.dto.EhrTemplateSummaryDTO;

import java.util.List;

public interface ShowEhrIdWithTemplatesService {
    List<EhrTemplateSummaryDTO> getAllEhrWithTemplates();
}
