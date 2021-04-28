package com.javanibble.springdata.examples;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@Slf4j
@SpringBootApplication
public class CrudRepositoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudRepositoryApplication.class, args);
	}





//
//		log.info("*********************************************************");
//		log.info("\n Scenario 4: Persist a list of Film entities.");
//		List<Film> myFilms = new ArrayList<Film>();
//		myFilms.add(myFirstFilm);
//		myFilms.add(mySecondFilm);
//		filmService.saveListOfFilms(myFilms);
//		Iterable<Film> listOfFilms= filmService.findAllFilms();
//		listOfFilms.forEach(e -> log.info(e.toString()));
//
//		log.info("\n Scenario 5: Delete a specific Film entity.");
//		filmService.deleteFilm(myFirstFilm);
//		filmService.deleteFilm(mySecondFilm);
//
//		log.info("\n Scenario 6: Delete a list of Film entities.");
//		filmService.saveListOfFilms(myFilms);
//		filmService.deleteListOfFilms(myFilms);
//
//		log.info("\n Scenario 7: Delete a list of Film Ids.");
//		List<Integer> myFilmIds = new ArrayList<Integer>();
//		myFilmIds.add(Integer.valueOf(9));
//		myFilmIds.add(Integer.valueOf(10));
//		filmService.deleteAllFilmsById(myFilmIds);
//
//		log.info("\n Scenario 8: Determine if Film exist by Id.");
//		boolean filmExist = filmService.filmExistById(Integer.valueOf(8));
//
//		log.info("\n Scenario 9: Delete a list of Film Ids.");
//		List<Integer> anotherFilmIds = new ArrayList<Integer>();
//		anotherFilmIds.add(Integer.valueOf(9));
//		anotherFilmIds.add(Integer.valueOf(10));
//		Iterable<Film> anotherSet = filmService.findAllFilmsById(anotherFilmIds);
//
//		log.info("\n Scenario 10: Delete a list of Film Ids.");
//		Optional<Film> myFilm = filmService.findFilmById(Integer.valueOf(9));
//
//		log.info("\n Scenario 11: Delete all films");
//		filmService.deleteAllFilms();


}
