package com.example.mes_protokol.dto;

import com.example.mes_protokol.enums.Phases;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CharacteriscticsModel {
    private String nameObmotki;
    private String polozhPerekl;
    private Phases phases;
    private BigDecimal highVoltageI;
    private BigDecimal highVoltageII;
    private BigDecimal highVoltageIII;
    private BigDecimal highVoltageIV;
    private BigDecimal highVoltageV;
    private Double lowVoltage;
    private String protokolName;
}
