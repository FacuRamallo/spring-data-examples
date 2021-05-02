package com.javanibble.springdata.examples.repository;

import com.javanibble.springdata.examples.identifier.composite.InventoryPK;
import com.javanibble.springdata.examples.identifier.composite.RentalPK;
import com.javanibble.springdata.examples.model.Inventory;
import com.javanibble.springdata.examples.model.Rental;
import org.springframework.data.repository.CrudRepository;

public interface RentalRepository extends CrudRepository<Rental, RentalPK> {
}