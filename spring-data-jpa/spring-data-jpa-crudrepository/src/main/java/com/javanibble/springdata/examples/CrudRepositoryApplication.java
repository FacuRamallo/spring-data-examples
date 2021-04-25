package com.javanibble.springdata.examples;


import com.javanibble.springdata.examples.model.Film;
import com.javanibble.springdata.examples.model.Rating;
import com.javanibble.springdata.examples.repository.FilmRepository;
import com.javanibble.springdata.examples.service.FilmService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Timestamp;
import java.util.Optional;

@Slf4j
@SpringBootApplication
public class CrudRepositoryApplication implements CommandLineRunner {

	@Autowired
	private FilmService filmService;

	public static void main(String[] args) {
		SpringApplication.run(CrudRepositoryApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		Film myFirstFilm = new Film(11,"MY FIRST FILM","...",2010,3,0.99,96,21.99, Rating.PG, "Deleted Scenes,Behind the Scenes",new Timestamp(System.currentTimeMillis()));
		Film mySecondFilm = new Film(12,"MY SECOND FILM","...",2012,2,0.99,106,26.99, Rating.PG, "Deleted Scenes,Behind the Scenes",new Timestamp(System.currentTimeMillis()));


		log.info("\n 1. Number of Films -> {} ", filmService.filmCount());

		log.info("\n 2. Save Film -> {} ", filmService.saveFilm(myFirstFilm));
		log.info("\n 3. Delete Film By Id");
		filmService.deleteFilmById(Integer.valueOf(11));

		log.info("\n 4. Delete all films");
		filmService.deleteAllFilms();

		log.info("\n 5. Number of Films -> {} ", filmService.filmCount());






//		public void deleteFilm(Film film) {
//		public void deleteListOfFilms(Iterable<Film> filmList) {
//		public void deleteAllFilmsById(Iterable<Integer> ids) {
//		public void deleteFilmById(Integer id){
//		public void filmExistById(Integer id) {
//
//		public Iterable<Film> findAllFilms() {
//		public Iterable<Film> findAllFilmsById(Iterable<Integer> ids) {
//		public Optional<Film> findFilmById(Integer id) {
//		public Film (Film film) {
//		public Iterable<Film> saveListOfFilms(Iterable<Film> listOfFilms) {




	}

}
