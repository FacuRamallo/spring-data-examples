package com.javanibble.springdata.examples.springdatajdbccrud;

import com.javanibble.springdata.examples.springdatajdbccrud.model.Airport;
import com.javanibble.springdata.examples.springdatajdbccrud.repository.AirportDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJdbcCrudApplication implements CommandLineRunner {


	private Logger logger = LoggerFactory.getLogger(this.getClass());


	@Autowired
	private AirportDAO airportDAO;


	public static void main(String[] args) {
		SpringApplication.run(SpringDataJdbcCrudApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		logger.info("\n 1. Retrieve All Airports -> {}", airportDAO.findAllAirports());
		logger.info("\n 2. Retrieve Airport with ID: 1 -> {}", airportDAO.findAirportById(1));

		logger.info("\n 3. Delete Airport with ID: 1 -> {}", airportDAO.deleteAirportById(1));
		logger.info("\n 4. Retrieve All Airports -> {}", airportDAO.findAllAirports());

		logger.info("\n 5. Insert Airport -> {}", airportDAO.insertAirport(new Airport(1, "Aachen/Merzbruck","AAH", "EDKA", 50.75, 6.133333, 3247449, "Europe/Berlin", "1", "+3185558444", "Germany", "DE", "AAH")));
		logger.info("\n 6. Retrieve Airport with ID: 1 -> {}", airportDAO.findAirportById(1));

		logger.info("\n 7. Update Airport with ID 1 -> {}", airportDAO.updateAirport(new Airport(1, "Aachen/Merzbruck","AAH", "EDKA", 50.75, 6.133333, 3247449, "Europe/Berlin", "1", "+3185558444", "Netherlands", "DE", "AAH")));
		logger.info("\n 8. Retrieve Airport with ID: 1 -> {}", airportDAO.findAirportById(1));
	}

}
