package com.example.mes_protokol.entity;

import com.example.mes_protokol.enums.Phases;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "CHARAHTERICTICS")
public class Charahterictics {

    @Id
    @GeneratedValue
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "phase")
    private Phases phases;

    @Column(name = "high_voltage_I")
    private BigDecimal highVoltageI;

    @Column(name = "high_voltage_II")
    private BigDecimal highVoltageII;

    @Column(name = "high_voltage_III")
    private BigDecimal highVoltageIII;

    @Column(name = "high_voltage_IV")
    private BigDecimal highVoltageIV;

    @Column(name = "high_voltage_V")
    private BigDecimal highVoltageV;

    @Column(name = "low_voltage")
    private BigDecimal lowVoltage;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Protokol protokol;


}
