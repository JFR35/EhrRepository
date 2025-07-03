package com.repositoryehr.ehrrepository.model.dto;

import java.util.List;

public class EhrTemplateSummaryDTO {
    private String ehrId;
    private List<String> templateIds;

    public EhrTemplateSummaryDTO(String ehrId, List<String> templateIds) {
        this.ehrId = ehrId;
        this.templateIds = templateIds;
    }

    public String getEhrId() {
        return ehrId;
    }

    public void setEhrId(String ehrId) {
        this.ehrId = ehrId;
    }

    public List<String> getTemplateIds() {
        return templateIds;
    }

    public void setTemplateIds(List<String> templateIds) {
        this.templateIds = templateIds;
    }
}

