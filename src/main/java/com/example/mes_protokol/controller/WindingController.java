package com.example.mes_protokol.controller;

import com.example.mes_protokol.entity.Winding;
import com.example.mes_protokol.service.WindingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WindingController {

    @Autowired
    private WindingService windingService;

    @PostMapping(value = "/save-winding")
    public String addWinding(@ModelAttribute(name = "winding") Winding winding) {
        this.windingService.saveWinding(winding);
        return "mainPage";
    }
}
