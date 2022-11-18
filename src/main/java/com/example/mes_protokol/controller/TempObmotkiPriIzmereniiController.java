package com.example.mes_protokol.controller;

import com.example.mes_protokol.service.TempObmotkiPriIzmereniiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TempObmotkiPriIzmereniiController {

    @Autowired
    private TempObmotkiPriIzmereniiService tempObmotkiPriIzmereniiService;
}
