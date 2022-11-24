package com.example.mes_protokol.entity;

import com.example.mes_protokol.enums.Cooling;
import com.example.mes_protokol.enums.TransformatorType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = Protokol.TABLE_NAME)
public class Protokol {

    public static final String TABLE_NAME = "PROTOKOLS";
    public static final String SEQ_NAME = TABLE_NAME + "_SEQ";

    @Id
    @SequenceGenerator(name = SEQ_NAME, sequenceName = SEQ_NAME, allocationSize = 1)
    @GeneratedValue(generator = SEQ_NAME)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "company")
    private String company;

    @Column(name = "object")
    private String object;

    @Column(name = "date")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date date;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private TransformatorType typeTransformator;

    @Column(name = "factoryNumber")
    private String factoryNumber;

    @Column(name = "power_kVA")
    private BigDecimal powerKVA;

    @Column(name = "power_kv")
    private String power;

    @Column(name = "tok_A")
    private String tokA;

    @Column(name = "Ek")
    private BigDecimal ek;

    @Column(name = "connection_group")
    private String connectionGroup;

    @Enumerated(EnumType.STRING)
    @Column(name = "cooling")
    private Cooling cooling;


}
