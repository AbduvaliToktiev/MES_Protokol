package com.example.mes_protokol.dao;

import com.example.mes_protokol.entity.Winding;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WindingRepository extends JpaRepository<Winding, Long> {
}
