package com.example.mes_protokol.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = Winding.TABLE_NAME)
public class Winding {

    public static final String TABLE_NAME = "WINDINGS";
    public static final String SEQ_NAME = TABLE_NAME + "_SEQ";

    @Id
    @SequenceGenerator(name = SEQ_NAME, sequenceName = SEQ_NAME, allocationSize = 1)
    @GeneratedValue(generator = SEQ_NAME)
    private Long id;

    @Column(name = "check_method")
    private String checkMethod = "Увлажненность обомток проверена методом абсорбции. Измеренный кэф-т 3≥1";

    @Column(name = "constant_currency")
    private String constantCurrency = "Сопротивление обмоток постоянному току измерено Р4833";

    @Column(name = "factory_number")
    private String factoryNumber = "№ 14388";

    @Column(name = "temperature")
    private String temperature;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "protokol_id", referencedColumnName = "id")
    private Protokol protokol;
}
