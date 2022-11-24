package com.example.mes_protokol.controller;

import com.example.mes_protokol.dto.CharacteriscticsModel;
import com.example.mes_protokol.entity.Charahterictics;
import com.example.mes_protokol.entity.Protokol;
import com.example.mes_protokol.enums.Phases;
import com.example.mes_protokol.service.CharacteristicsService;
import com.example.mes_protokol.service.ProtokolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CharacteristicsController {

    @Autowired
    private CharacteristicsService characteristicsService;

    @Autowired
    private ProtokolService protokolService;

    @PostMapping(value = "/save-characteristicsAB")
    public String saveCharacteristicsPhaseAB(@ModelAttribute(name = "charahterictics") CharacteriscticsModel charahtericticsModel) {
        Protokol protokol = protokolService.getByProtokolName(charahtericticsModel.getProtokolName());

        Charahterictics charahterictics = new Charahterictics();
        charahterictics.setProtokol(protokol);
        charahterictics.setPhases(Phases.A_B);
        charahterictics.setHighVoltageI(charahtericticsModel.getHighVoltageI());
        charahterictics.setHighVoltageII(charahtericticsModel.getHighVoltageII());
        charahterictics.setHighVoltageIII(charahtericticsModel.getHighVoltageIII());
        charahterictics.setHighVoltageIV(charahtericticsModel.getHighVoltageIV());
        charahterictics.setHighVoltageV(charahtericticsModel.getHighVoltageV());
        charahterictics.setLowVoltage(charahtericticsModel.getLowVoltage());
        this.characteristicsService.saveCharacterictics(charahterictics);
        return "characteristicsPhaseBC";
    }

    @PostMapping(value = "/save-characteristicsBC")
    public String saveCharacteristicsPhaseBC(@ModelAttribute(name = "charahterictics") CharacteriscticsModel charahtericticsModel) {
        Protokol protokol = protokolService.getByProtokolName(charahtericticsModel.getProtokolName());

        Charahterictics charahterictics = new Charahterictics();
        charahterictics.setProtokol(protokol);
        charahterictics.setPhases(Phases.B_C);
        charahterictics.setHighVoltageI(charahtericticsModel.getHighVoltageI());
        charahterictics.setHighVoltageII(charahtericticsModel.getHighVoltageII());
        charahterictics.setHighVoltageIII(charahtericticsModel.getHighVoltageIII());
        charahterictics.setHighVoltageIV(charahtericticsModel.getHighVoltageIV());
        charahterictics.setHighVoltageV(charahtericticsModel.getHighVoltageV());
        charahterictics.setLowVoltage(charahtericticsModel.getLowVoltage());
        this.characteristicsService.saveCharacterictics(charahterictics);
        return "characteristicsPhaseCA";
    }

    @PostMapping(value = "/save-characteristicsCA")
    public String saveCharacteristicsPhaseCA(@ModelAttribute(name = "charahterictics") CharacteriscticsModel charahtericticsModel) {
        Protokol protokol = protokolService.getByProtokolName(charahtericticsModel.getProtokolName());

        Charahterictics charahterictics = new Charahterictics();
        charahterictics.setProtokol(protokol);
        charahterictics.setPhases(Phases.C_A);
        charahterictics.setHighVoltageI(charahtericticsModel.getHighVoltageI());
        charahterictics.setHighVoltageII(charahtericticsModel.getHighVoltageII());
        charahterictics.setHighVoltageIII(charahtericticsModel.getHighVoltageIII());
        charahterictics.setHighVoltageIV(charahtericticsModel.getHighVoltageIV());
        charahterictics.setHighVoltageV(charahtericticsModel.getHighVoltageV());
        charahterictics.setLowVoltage(charahtericticsModel.getLowVoltage());
        this.characteristicsService.saveCharacterictics(charahterictics);
        return "mainPage";
    }
}
