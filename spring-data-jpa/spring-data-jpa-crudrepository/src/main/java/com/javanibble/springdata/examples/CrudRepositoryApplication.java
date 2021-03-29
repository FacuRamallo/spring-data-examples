package com.javanibble.springdata.examples;


import com.javanibble.springdata.examples.model.Film;
import com.javanibble.springdata.examples.model.Rating;
import com.javanibble.springdata.examples.repository.FilmRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Timestamp;


@SpringBootApplication
public class CrudRepositoryApplication implements CommandLineRunner {


	private Logger logger = LoggerFactory.getLogger(this.getClass());


	@Autowired
	private FilmRepository filmRepository;


	public static void main(String[] args) {
		SpringApplication.run(CrudRepositoryApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		logger.info("\n 1. Retrieve All Films -> {}", filmRepository.findAll());
		logger.info("\n 2. Retrieve Film with ID: 1 -> {}", filmRepository.findById(1));

		logger.info("\n 3. Delete Film with ID: 1 ");
		filmRepository.deleteById(1);

		logger.info("\n 4. Retrieve All Film -> {}", filmRepository.findAll());

		logger.info("\n 5. Insert Film -> {}", filmRepository.save(new Film(1,"MY DINOSAUR","...",2006,6,0.99,86,20.99, Rating.PG, "Deleted Scenes,Behind the Scenes",new Timestamp(System.currentTimeMillis()))));

		logger.info("\n 6. Retrieve Film with ID: 1 -> {}", filmRepository.findById(1));

		logger.info("\n 7. Update Film with ID 1 -> {}", filmRepository.save(new Film(1,"ACADEMY DINOSAUR","A Epic Drama of a Feminist And a Mad Scientist who must Battle a Teacher in The Canadian Rockies",2006,6,0.99,86,20.99, Rating.PG, "Deleted Scenes,Behind the Scenes",new Timestamp(System.currentTimeMillis()))));
		logger.info("\n 8. Retrieve Film with ID: 1 -> {}", filmRepository.findById(1));

	}

}
