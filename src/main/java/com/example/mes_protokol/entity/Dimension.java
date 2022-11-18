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
@Entity(name = "DIMENSION")
public class Dimension {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "dimension_method")
    private String dimensionMethod;

    @Column(name = "type")
    private String type;

    @Column(name = "factory_number")
    private String factoryNumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "protokol_id", referencedColumnName = "id")
    private Protokol protokol;
}
