package com.example.mes_protokol.dao;

import com.example.mes_protokol.entity.Protokol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProtokolRepository extends JpaRepository<Protokol, Long> {
 Optional<Protokol> findByName(String protokolName);
}
