package com.javanibble.springdata.examples.repository;

import com.javanibble.springdata.examples.model.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}