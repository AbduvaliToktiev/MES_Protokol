package com.example.mes_protokol.service;

import com.example.mes_protokol.dao.WindingRepository;
import com.example.mes_protokol.entity.Winding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WindingService {

    @Autowired
    private WindingRepository windingRepository;

    public void saveWinding(Winding winding) {
        this.windingRepository.save(winding);
    }
}
