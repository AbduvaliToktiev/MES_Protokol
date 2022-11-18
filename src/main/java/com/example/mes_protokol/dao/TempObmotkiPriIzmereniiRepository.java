package com.example.mes_protokol.dao;

import com.example.mes_protokol.entity.TempObmotkiPriIzmerenii;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TempObmotkiPriIzmereniiRepository extends JpaRepository<TempObmotkiPriIzmerenii, Long> {
}
