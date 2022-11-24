package com.example.mes_protokol.service;

import com.example.mes_protokol.dao.DescriptionRepository;
import com.example.mes_protokol.entity.Description;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DescriptionService {

    @Autowired
    private DescriptionRepository descriptionRepository;

    public void saveDescription(Description description) {
        this.descriptionRepository.save(description);
    }
}
