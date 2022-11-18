package com.example.mes_protokol.service;

import com.example.mes_protokol.dao.ProtokolRepository;
import com.example.mes_protokol.entity.Protokol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProtokolService {

    @Autowired
    private ProtokolRepository protokolRepository;

    public List<Protokol> getAllProtocol() {
        return this.protokolRepository.findAll();
    }

    public void saveProtocol(Protokol protokol) {
        this.protokolRepository.save(protokol);
    }

}
