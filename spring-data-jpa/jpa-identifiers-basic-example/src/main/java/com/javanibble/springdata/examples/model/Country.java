package com.javanibble.springdata.examples.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Country {

    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private Long population;
    private String currency;


}
