package com.repositoryehr.ehrrepository.controller;

import com.repositoryehr.ehrrepository.service.impl.ShowTemplatesServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/templates")
public class GetTemplateByAppController {

    private final ShowTemplatesServiceImpl showTemplatesService;

    public GetTemplateByAppController(ShowTemplatesServiceImpl showTemplatesService) {
        this.showTemplatesService = showTemplatesService;
    }

    @GetMapping()
    public Optional<List> getAllTemplates() {
        return showTemplatesService.getAllTemplates();
    }

}
