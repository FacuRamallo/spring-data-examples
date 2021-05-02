package com.javanibble.springdata.examples.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Address {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="steet_name")
    private String streetName;

    @Column(name="steet_number")
    private String streetNumber;
    private String city;
    private String country;
    private String postalCode;

}
