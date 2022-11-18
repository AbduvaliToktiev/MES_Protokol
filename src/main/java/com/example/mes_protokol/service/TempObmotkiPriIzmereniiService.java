package com.example.mes_protokol.service;

import com.example.mes_protokol.dao.TempObmotkiPriIzmereniiRepository;
import com.example.mes_protokol.entity.TempObmotkiPriIzmerenii;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TempObmotkiPriIzmereniiService {

    @Autowired
    TempObmotkiPriIzmereniiRepository tempObmotkiPriIzmereniiRepository;

    public void saveTempObmotki(TempObmotkiPriIzmerenii tempObmotkiPriIzmerenii) {
        this.tempObmotkiPriIzmereniiRepository.save(tempObmotkiPriIzmerenii);
    }
}
