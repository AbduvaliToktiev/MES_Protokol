package com.example.mes_protokol.dto;

import com.example.mes_protokol.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DescriptionModel {
    private String note;
    private String conclusion;
    private Status status;
    private String fio;
    private String protokolName;
}
