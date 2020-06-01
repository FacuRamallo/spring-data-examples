package com.javanibble.springdata.examples.mongodb.crud;

import com.javanibble.springdata.examples.mongodb.crud.model.Airport;
import com.javanibble.springdata.examples.mongodb.crud.repository.AirportRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataMongoDBCrudApplication implements CommandLineRunner {


	private Logger logger = LoggerFactory.getLogger(this.getClass());


	@Autowired
	private AirportRepository airportRepository;

	// docker run --name api -p 127.0.0.1:27017:27017 -p 127.0.0.1:28017:28017 -d mongo
	public static void main(String[] args) {
		SpringApplication.run(SpringDataMongoDBCrudApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		logger.info("\n 1. Retrieve All Airports -> {}", airportRepository.findAll());
		logger.info("\n 2. Insert Airport -> {}", airportRepository.insert(new Airport(1, "Aachen/Merzbruck","AAH", "EDKA", 50.75, 6.133333, 3247449, "Europe/Berlin", "1", "+3185558444", "Germany", "DE", "AAH")));

		logger.info("\n 3. Retrieve All Airports -> {}", airportRepository.findAll());
		logger.info("\n 4. Retrieve Airport with ID: 1 -> {}", airportRepository.findByAirportId(1));

		logger.info("\n 5. Update Airport with ID 1 -> {}", airportRepository.save(new Airport(1, "Aachen/Merzbruck","AAH", "EDKA", 50.75, 6.133333, 3247449, "Europe/Berlin", "1", "+3185558444", "Netherlands", "DE", "AAH")));
		logger.info("\n 6. Retrieve Airport with ID: 1 -> {}", airportRepository.findByAirportId(1));

	}

}
