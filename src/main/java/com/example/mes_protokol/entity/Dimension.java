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
@Table(name = Dimension.TABLE_NAME)
public class Dimension {

    public static final String TABLE_NAME = "DIMENSIONS";
    public static final String SEQ_NAME = TABLE_NAME + "_SEQ";

    @Id
    @SequenceGenerator(name = SEQ_NAME, sequenceName = SEQ_NAME, allocationSize = 1)
    @GeneratedValue(generator = SEQ_NAME)
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
