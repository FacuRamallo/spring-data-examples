package com.javanibble.springdata.examples.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Film {

    @Id
    @Column(name="film_id")
    private int id;

    private String title;

    private String description;

    @Column(name="release_year")
    private int releaseYear;

    @Column(name="rental_duration")
    private int rentalDuration;

    @Column(name="rental_rate")
    private double rentalRate;

    private int length;

    @Column(name="replacement_cost")
    private double replacement_cost;

    @Enumerated(EnumType.STRING)
    private Rating rating;

    @Column(name="special_features")
    private String specialFeatures;

    @Column(name="last_update")
    private Timestamp lastUpdate;
}

