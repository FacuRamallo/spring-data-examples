package com.javanibble.springdata.examples.repository;

import com.javanibble.springdata.examples.identifier.composite.InventoryPK;
import com.javanibble.springdata.examples.model.Inventory;
import org.springframework.data.repository.CrudRepository;

public interface InventoryRepository extends CrudRepository<Inventory, InventoryPK> {
}