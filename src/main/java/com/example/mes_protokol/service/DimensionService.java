package com.example.mes_protokol.service;

import com.example.mes_protokol.dao.DimensionRepository;
import com.example.mes_protokol.entity.Dimension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DimensionService {

    @Autowired
    private DimensionRepository dimensionRepository;

    public void saveDimension(Dimension dimension) {
        this.dimensionRepository.save(dimension);
    }
}
