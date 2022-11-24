package com.example.mes_protokol.controller;

import com.example.mes_protokol.dto.WindingModel;
import com.example.mes_protokol.entity.Protokol;
import com.example.mes_protokol.entity.Winding;
import com.example.mes_protokol.service.ProtokolService;
import com.example.mes_protokol.service.TempObmotkiPriIzmereniiService;
import com.example.mes_protokol.service.WindingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WindingController {

    @Autowired
    private WindingService windingService;

    @Autowired
    private ProtokolService protokolService;

    @PostMapping(value = "/save-winding")
    public String addWinding(@ModelAttribute(name = "winding") WindingModel windingModel) {
        Protokol protokol = protokolService.getByProtokolName(windingModel.getProtokolName());

        Winding winding = new Winding();
        winding.setTemperature(windingModel.getTemperature());
        winding.setProtokol(protokol);
        this.windingService.saveWinding(winding);
        return "characteristicsPhaseAB";
    }
}
