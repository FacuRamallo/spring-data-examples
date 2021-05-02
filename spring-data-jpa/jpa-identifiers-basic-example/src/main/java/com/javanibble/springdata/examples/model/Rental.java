package com.javanibble.springdata.examples.model;

import com.javanibble.springdata.examples.identifier.composite.InventoryPK;
import com.javanibble.springdata.examples.identifier.composite.RentalPK;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@IdClass(RentalPK.class)
public class Rental {

    @Id
    private Long rental_id;

    @Id
    private Long secondary_id;

    private String name;
}
