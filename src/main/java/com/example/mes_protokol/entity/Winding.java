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
@Entity(name = "WINDINGS")
public class Winding {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "check_method")
    private String checkMethod;

    @Column(name = "constant_currency")
    private String constantCurrency;

    @Column(name = "factory_number")
    private String factoryNumber;

    @Column(name = "temperature")
    private String temperature;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "protokol_id", referencedColumnName = "id")
    private Protokol protokol;
}
