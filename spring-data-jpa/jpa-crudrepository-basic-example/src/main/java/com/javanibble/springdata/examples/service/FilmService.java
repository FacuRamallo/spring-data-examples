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


    public long filmCount() {
        return filmRepository.count();
    }


    public void deleteFilm(Film film) {
        filmRepository.delete(film);
    }


    public void deleteAllFilms() {
        filmRepository.deleteAll();
    }


    public void deleteListOfFilms(Iterable<Film> filmList) {
        filmRepository.deleteAll(filmList);
    }


    public void deleteFilmById(Integer id){
        filmRepository.deleteById(id);
    }


    public boolean filmExistById(Integer id) {
        return filmRepository.existsById(id);
    }


    public Iterable<Film> findAllFilms() {
        return filmRepository.findAll();
    }


    public Iterable<Film> findAllFilmsById(Iterable<Integer> ids) {
        return filmRepository.findAllById(ids);
    }


    public Optional<Film> findFilmById(Integer id) {
        return filmRepository.findById(id);
    }


    public Film saveFilm(Film film) {
        return filmRepository.save(film);
    }


    public Iterable<Film> saveListOfFilms(Iterable<Film> listOfFilms) {
        return filmRepository.saveAll(listOfFilms);
    }

}
