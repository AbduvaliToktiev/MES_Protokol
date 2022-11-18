package com.example.mes_protokol.dao;

import com.example.mes_protokol.entity.Charahterictics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharactericticsRepository extends JpaRepository<Charahterictics, Long> {
}
