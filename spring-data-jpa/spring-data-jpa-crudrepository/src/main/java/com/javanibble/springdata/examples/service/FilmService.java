package com.javanibble.springdata.examples.service;

import com.javanibble.springdata.examples.model.Film;
import com.javanibble.springdata.examples.repository.FilmRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Slf4j
@Service
public class FilmService {

    @Autowired
    private FilmRepository filmRepository;


    /**
     * Returns the number of entities available.
     */
    public long filmCount() {
        return filmRepository.count();
    }

    /**
     * Deletes a given entity.
     */
    public void deleteFilm(Film film) {
        filmRepository.delete(film);
    }

    /**
     * Deletes all entities managed by the repository.
     */
    public void deleteAllFilms() {
        filmRepository.deleteAll();
    }

    /**
     * Deletes the given entities.
     */
    public void deleteListOfFilms(Iterable<Film> filmList) {
        filmRepository.deleteAll(filmList);
    }

    /**
     * Deletes all instances of the type T with the given IDs.
     */
    public void deleteAllFilmsById(Iterable<Integer> ids) {
        filmRepository.deleteAllById(ids);
    }

    /**
     * Deletes the entity with the given id.
     */
    public void deleteFilmById(Integer id){
        filmRepository.deleteById(id);
    }

    /**
     * Returns whether an entity with the given id exists.
     */
    public void filmExistById(Integer id) {
        filmRepository.existsById(id);
    }

    /**
     * Returns all instances of the type Film
     */
    public Iterable<Film> findAllFilms() {
        return filmRepository.findAll();
    }

    /**
     * Returns all instances of the type Film with the given IDs.
     */
    public Iterable<Film> findAllFilmsById(Iterable<Integer> ids) {
        return filmRepository.findAllById(ids);
    }

    /**
     * Returns all instances of the type Film
     */
    public Optional<Film> findFilmById(Integer id) {
        return filmRepository.findById(id);
    }

    /**
     * Save the Film entity.
     */
    public Film saveFilm(Film film) {
        return filmRepository.save(film);
    }

    /**
     * Save the lust of Film entities.
     */
    public Iterable<Film> saveListOfFilms(Iterable<Film> listOfFilms) {
        return filmRepository.saveAll(listOfFilms);
    }

}
