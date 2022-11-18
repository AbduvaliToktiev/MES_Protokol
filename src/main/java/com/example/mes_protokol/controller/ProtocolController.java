package com.example.mes_protokol.controller;

import com.example.mes_protokol.entity.Dimension;
import com.example.mes_protokol.entity.Protokol;
import com.example.mes_protokol.entity.TempObmotkiPriIzmerenii;
import com.example.mes_protokol.enums.Cooling;
import com.example.mes_protokol.enums.SchemaIzmerenii;
import com.example.mes_protokol.service.DimensionService;
import com.example.mes_protokol.service.ProtokolService;
import com.example.mes_protokol.service.TempObmotkiPriIzmereniiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.parser.Parser;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Controller
public class ProtocolController {

    @Autowired
    private ProtokolService protokolService;

    @Autowired
    private DimensionService dimensionService;

    @Autowired
    private TempObmotkiPriIzmereniiService tempObmotkiPriIzmereniiService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String mainPage() {
        return "mainPage";
    }

    @GetMapping(value = "/create-protokol")
    public String create(Model model) {
        model.addAttribute("protokol", new Protokol());
        return "saveProtokol";
    }

    @PostMapping(value = "/save-protokol")
    public String addProtokol(@ModelAttribute(name = "protokol") Protokol protokol) {
        Dimension dimension = new Dimension();
        dimension.setDimensionMethod("Сопротивление изоляции обмоток относительно корпуса и между собой,\n" +
                "измеренное мегомметром 2500 В");
        dimension.setType("M4100/5");
        dimension.setFactoryNumber("№ 463232");
        dimension.setProtokol(protokol);

        TempObmotkiPriIzmerenii tempObmotkiPriIzmerenii = new TempObmotkiPriIzmerenii();
        tempObmotkiPriIzmerenii.setSchemaIzmerenii(SchemaIzmerenii.Сопротивл_е_R15Мом);
        tempObmotkiPriIzmerenii.setProtokol(protokol);
        tempObmotkiPriIzmerenii.setSchemaIzmerenii(SchemaIzmerenii.Сопротивл_е_R60Мом);
        tempObmotkiPriIzmerenii.getProtokol();

        protokol.setCooling(Cooling.ЕСТЕСТВЕННОЕ_МАСЛЯННОЕ);
        protokol.setCompany("ОСОО <<МЭС>>");
        this.protokolService.saveProtocol(protokol);
        this.dimensionService.saveDimension(dimension);
        this.tempObmotkiPriIzmereniiService.saveTempObmotki(tempObmotkiPriIzmerenii);
        return "mainPage";
    }

    @GetMapping(value = "/get-all-protokol")
    public String getAll(Model model) {
        List<Protokol> protokols = protokolService.getAllProtocol();
        model.addAttribute("protokols", protokols);
        return "protokol-list";
    }

    @RequestMapping(value = "/mainPage-protokol", method = RequestMethod.POST)
    public String mainPageReturn() {
        return "mainPage";
    }
}
