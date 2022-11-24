package com.example.mes_protokol.service;

import com.example.mes_protokol.dao.CharactericticsRepository;
import com.example.mes_protokol.entity.Charahterictics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CharacteristicsService {

    @Autowired
    private CharactericticsRepository charactericticsRepository;

    public void saveCharacterictics(Charahterictics charahterictics) {
        this.charactericticsRepository.save(charahterictics);
    }
}
