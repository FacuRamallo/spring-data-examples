package com.javanibble.springdata.examples.jpa.crud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@NamedQueries (value= {
        @NamedQuery(name="FindAllAirports", query="select a from Airport a"),
        @NamedQuery(name="FindAllAirportsOrderByNameAsc", query="select a from Airport a ORDER BY a.name ASC")})
public class Airport {

    @Id
    private int id;
    private String name;

    @Column(name="iata_airport_code")
    private String iataAirportCode;

    @Column(name="icao_airport_code")
    private String icaoAirportCode;

    @Column(name="country_name")
    private String countryName;

    @Column(name="_iso2_country_code")
    private String iso2CountryCode;

    @Column(name="iata_city_code")
    private String iataCityCode;
    private String phone;
    private double latitude;
    private double longitude;

    @Column(name="geoname_id")
    private int geonameId;
    private String timezone;
    private String gmt;
}

