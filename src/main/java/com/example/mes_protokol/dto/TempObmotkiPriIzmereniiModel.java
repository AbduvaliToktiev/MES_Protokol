package com.example.mes_protokol.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TempObmotkiPriIzmereniiModel {
    private String temperatura;

    private Integer VN_bak_NN;

    private Integer NN_bak_VN;

    private Integer VN_NN_bak;

    private String protokolName;
}
