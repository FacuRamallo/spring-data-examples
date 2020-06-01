package com.javanibble.springdata.examples.mongodb.crud.repository;

import com.javanibble.springdata.examples.mongodb.crud.model.Airport;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AirportRepository extends MongoRepository<Airport, String> {

    Airport findByAirportId(int airportId);

}
