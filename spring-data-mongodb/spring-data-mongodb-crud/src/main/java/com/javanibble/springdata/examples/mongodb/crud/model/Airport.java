package com.javanibble.springdata.examples.mongodb.crud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Airport {

    @Id
    private int airportId;
    private String airportName;
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

