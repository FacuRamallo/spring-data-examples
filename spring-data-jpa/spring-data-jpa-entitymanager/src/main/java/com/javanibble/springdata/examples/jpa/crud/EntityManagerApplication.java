package com.javanibble.springdata.examples.jpa.crud;

import com.javanibble.springdata.examples.jpa.crud.model.Airport;
import com.javanibble.springdata.examples.jpa.crud.repository.AirportRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EntityManagerApplication implements CommandLineRunner {


	private Logger logger = LoggerFactory.getLogger(this.getClass());


	@Autowired
	private AirportRepository airportRepository;


	public static void main(String[] args) {
		SpringApplication.run(EntityManagerApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		logger.info("\n 1. Retrieve All Airports Ordered -> {}", airportRepository.findAllAirportsOrderNameAsc());
		logger.info("\n 2. Retrieve Airport with ID: 1 -> {}", airportRepository.findAirportById(1));

		logger.info("\n 3. Delete Airport with ID: 2 -> {}", airportRepository.deleteAirportById(2));
		logger.info("\n 4. Retrieve All Airport -> {}", airportRepository.findAllAirports());

		logger.info("\n 5. Insert Airport -> {}", airportRepository.insertAirport(new Airport(2, "Anaa", "AAA", "NTGA", "French Polynesia", "PF", "AAA", "", -17.05, -145.41667, 6947726, "Pacific/Tahiti", "-10")));
		logger.info("\n 6. Retrieve Airport with ID: 1 -> {}", airportRepository.findAirportById(2));

		logger.info("\n 7. Update Airport with ID 1 -> {}", airportRepository.updateAirport(new Airport(2, "Anaa", "AAA", "NTGA", "French Polynesia", "PF", "AAA", "+3155555555", -17.05, -145.41667, 6947726, "Pacific/Tahiti", "-10")));
		logger.info("\n 8. Retrieve Airport with ID: 1 -> {}", airportRepository.findAirportById(1));

	}

}
