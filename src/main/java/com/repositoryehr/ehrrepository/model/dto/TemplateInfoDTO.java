package com.repositoryehr.ehrrepository.model.dto;

public class TemplateInfoDTO {
    private String templateId;
    private String concept;
    private String createdTimestamp;

    public TemplateInfoDTO(String templateId, String concept, String createdTimestamp) {
        this.templateId = templateId;
        this.concept = concept;
        this.createdTimestamp = createdTimestamp;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public String getCreatedTimestamp() {
        return createdTimestamp;
    }

    public void setCreatedTimestamp(String createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }
}
