package com.javanibble.springdata.examples.repository;

import com.javanibble.springdata.examples.model.Store;
import org.springframework.data.repository.CrudRepository;

public interface StoreRepository extends CrudRepository<Store, Long> {
}