package com.example.mes_protokol.controller;

import com.example.mes_protokol.entity.Protokol;
import com.example.mes_protokol.entity.TempObmotkiPriIzmerenii;
import com.example.mes_protokol.dto.TempObmotkiPriIzmereniiModel;
import com.example.mes_protokol.enums.SchemaIzmerenii;
import com.example.mes_protokol.service.ProtokolService;
import com.example.mes_protokol.service.TempObmotkiPriIzmereniiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class TempObmotkiPriIzmereniiController {

    @Autowired
    private ProtokolService protokolService;

    @Autowired
    private TempObmotkiPriIzmereniiService tempObmotkiPriIzmereniiService;

    @PostMapping(value = "/save-tempObmotki15")
    public String saveTempObmotki(@ModelAttribute(name = "tempObmotkiPriIzmerenii") TempObmotkiPriIzmereniiModel tempObmotkiPriIzmereniiModel) {
        Protokol protokol = protokolService.getByProtokolName(tempObmotkiPriIzmereniiModel.getProtokolName());

        TempObmotkiPriIzmerenii tempObmotkiPriIzmerenii = new TempObmotkiPriIzmerenii();
        tempObmotkiPriIzmerenii.setVN_bak_NN(tempObmotkiPriIzmereniiModel.getVN_bak_NN());
        tempObmotkiPriIzmerenii.setNN_bak_VN(tempObmotkiPriIzmereniiModel.getNN_bak_VN());
        tempObmotkiPriIzmerenii.setVN_NN_bak(tempObmotkiPriIzmereniiModel.getVN_NN_bak());
        tempObmotkiPriIzmerenii.setTemperature(tempObmotkiPriIzmereniiModel.getTemperature());
        tempObmotkiPriIzmerenii.setProtokol(protokol);
        tempObmotkiPriIzmerenii.setSchemaIzmerenii(SchemaIzmerenii.Сопротивл_е_R15Мом);

        this.tempObmotkiPriIzmereniiService.saveTempObmotki(tempObmotkiPriIzmerenii);
        return "SoprotivlenieR60";
    }

    @PostMapping(value = "/save-tempObmotki60")
    public String saveTempObmotki60(@ModelAttribute(name = "tempObmotkiPriIzmerenii") TempObmotkiPriIzmereniiModel tempObmotkiPriIzmereniiModel) {
        Protokol protokol = protokolService.getByProtokolName(tempObmotkiPriIzmereniiModel.getProtokolName());

        TempObmotkiPriIzmerenii tempObmotkiPriIzmerenii = new TempObmotkiPriIzmerenii();
        tempObmotkiPriIzmerenii.setVN_bak_NN(tempObmotkiPriIzmereniiModel.getVN_bak_NN());
        tempObmotkiPriIzmerenii.setNN_bak_VN(tempObmotkiPriIzmereniiModel.getNN_bak_VN());
        tempObmotkiPriIzmerenii.setVN_NN_bak(tempObmotkiPriIzmereniiModel.getVN_NN_bak());
        tempObmotkiPriIzmerenii.setTemperature(tempObmotkiPriIzmereniiModel.getTemperature());
        tempObmotkiPriIzmerenii.setSchemaIzmerenii(SchemaIzmerenii.Сопротивл_е_R60Мом);
        tempObmotkiPriIzmerenii.setProtokol(protokol);
        this.tempObmotkiPriIzmereniiService.saveTempObmotki(tempObmotkiPriIzmerenii);
        return "WindingTemp";
    }
}
