package com.javanibble.springdata.examples.repository;

import com.javanibble.springdata.examples.model.City;
import org.springframework.data.repository.CrudRepository;

public interface CityRepository extends CrudRepository<City, Long> {
}