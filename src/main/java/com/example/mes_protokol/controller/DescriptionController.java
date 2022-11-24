package com.example.mes_protokol.controller;

import com.example.mes_protokol.dto.DescriptionModel;
import com.example.mes_protokol.entity.Description;
import com.example.mes_protokol.entity.Protokol;
import com.example.mes_protokol.enums.Status;
import com.example.mes_protokol.service.DescriptionService;
import com.example.mes_protokol.service.ProtokolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DescriptionController {

    @Autowired
    private DescriptionService descriptionService;

    @Autowired
    private ProtokolService protokolService;

    @PostMapping(value = "/save-description")
    public String saveDescriptionProtokol(@ModelAttribute(name = "description") DescriptionModel descriptionModel) {
        Protokol protokol = protokolService.getByProtokolName(descriptionModel.getProtokolName());

        Description description = new Description();
        description.setProtokol(protokol);
        description.setNote(descriptionModel.getNote());
        description.setConclusion(descriptionModel.getConclusion());
        description.setStatus(Status.Проверил);
        description.setFio(descriptionModel.getFio());
        this.descriptionService.saveDescription(description);
        return "mainPage";
    }
}
