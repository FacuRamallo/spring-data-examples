package com.javanibble.springdata.examples.springjdbccrud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Airport {

    private int airportId;
    private String nameAirport;
    private String codeIataAirport;
    private String codeIcaoAirport;
    private double latitudeAirport;
    private double longitudeAirport;
    private int geonameId;
    private String timezone;
    private String GMT;
    private String phone;
    private String nameCountry;
    private String codeIso2Country;
    private String codeIataCity;

}

