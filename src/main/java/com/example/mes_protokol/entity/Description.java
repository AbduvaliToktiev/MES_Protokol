package com.example.mes_protokol.entity;

import com.example.mes_protokol.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "DESCRIPTION")
public class Description {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "note")
    private String note;

    @Column(name = "conclusion")
    private String conclusion;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;

    @Column(name = "fio")
    private String fio;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "protokol_id", referencedColumnName = "id")
    private Protokol protokol;
}
