package com.repositoryehr.ehrrepository.controller;

import com.repositoryehr.ehrrepository.model.dto.EhrTemplateSummaryDTO;
import com.repositoryehr.ehrrepository.service.impl.ShowEhrIdWithTemplatesServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EhrIdSummaryController {

    private final ShowEhrIdWithTemplatesServiceImpl showEhrIdWithTemplatesService;

    public EhrIdSummaryController(ShowEhrIdWithTemplatesServiceImpl showEhrIdWithTemplatesService) {
        this.showEhrIdWithTemplatesService = showEhrIdWithTemplatesService;
    }

    @GetMapping("/ehr-summary")
    public List<EhrTemplateSummaryDTO> getEhrsWithTemplates() {
        return showEhrIdWithTemplatesService.getAllEhrWithTemplates();
    }

}
