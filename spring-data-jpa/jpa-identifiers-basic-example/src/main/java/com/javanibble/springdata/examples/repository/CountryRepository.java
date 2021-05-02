package com.javanibble.springdata.examples.repository;

import com.javanibble.springdata.examples.model.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country, Long> {
}