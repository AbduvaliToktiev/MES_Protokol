package com.example.mes_protokol.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WindingModel {
    private String checkMethod;
    private String constantCurrency;
    private String factoryNumber;
    private String temperature;
    private String protokolName;
}
