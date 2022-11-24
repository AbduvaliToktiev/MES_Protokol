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
@Entity
@Table(name = Charahterictics.TABLE_NAME)
public class Charahterictics {

    public static final String TABLE_NAME = "CHARAHTETICTICS";
    public static final String SEQ_NAME = TABLE_NAME + "_SEQ";

    @Id
    @SequenceGenerator(name = SEQ_NAME, sequenceName = SEQ_NAME, allocationSize = 1)
    @GeneratedValue(generator = SEQ_NAME)
    private Long id;

    @Column(name = "name_obmotki")
    private String nameObmotki = "Наимнов.обмоток";

    @Column(name = "polozhPerekl")
    private String polozhPerekl = "Полож.перекл.";

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
    private Double lowVoltage;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Protokol protokol;


}
