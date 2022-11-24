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
@Entity
@Table(name = TempObmotkiPriIzmerenii.TABLE_NAME)
public class TempObmotkiPriIzmerenii {

    public static final String TABLE_NAME = "TEMP_OBMOTKI_PRI_IZMERENII";
    public static final String SEQ_NAME = TABLE_NAME + "_SEQ";

    @Id
    @SequenceGenerator(name = SEQ_NAME, sequenceName = SEQ_NAME, allocationSize = 1)
    @GeneratedValue(generator = SEQ_NAME)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "schema_izmerenii")
    private SchemaIzmerenii schemaIzmerenii;

    @Column(name = "temperature")
    private String temperature;

    @Column(name = "VN_bak_NN")
    private Integer VN_bak_NN;

    @Column(name = "NN_bak_VN")
    private Integer NN_bak_VN;

    @Column(name = "VN_NN_bak")
    private Integer VN_NN_bak;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Protokol protokol;
}
