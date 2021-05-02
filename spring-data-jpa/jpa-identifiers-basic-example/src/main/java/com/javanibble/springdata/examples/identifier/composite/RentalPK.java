package com.javanibble.springdata.examples.identifier.composite;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RentalPK implements Serializable {

    private Long rental_id;
    private Long secondary_id;

}
