package com.raecomm.ecomm.config;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RegionCode {
    IND("INDIA"),
    FR("FRANCE"),
    PL("POLAND");

    private final String country;
}
