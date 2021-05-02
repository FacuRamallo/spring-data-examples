package com.javanibble.springdata.examples.repository;

import com.javanibble.springdata.examples.model.Customer;
import com.javanibble.springdata.examples.model.Staff;
import org.springframework.data.repository.CrudRepository;

public interface StaffRepository extends CrudRepository<Staff, Long> {
}