package com.example.mes_protokol.entity;

import com.example.mes_protokol.enums.SchemaIzmerenii;
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
@Entity(name = "TEMP_OBMOTKI_PRI_IZMINENII")
public class TempObmotkiPriIzmerenii {

    @Id
    @GeneratedValue
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "schema_izmerenii")
    private SchemaIzmerenii schemaIzmerenii;

    @Column(name = "temperatura")
    private String temperatura;

    @Column(name = "VN_bak_NN")
    private Integer VN_bak_NN;

    @Column(name = "NN_bak_VN")
    private Integer NN_bak_VN;

    @Column(name = "VN_NN_bak")
    private Integer VN_NN_bak;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Protokol protokol;
}
