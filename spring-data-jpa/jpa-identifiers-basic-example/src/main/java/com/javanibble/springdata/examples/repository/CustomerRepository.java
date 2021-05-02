package com.javanibble.springdata.examples.repository;

import com.javanibble.springdata.examples.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}