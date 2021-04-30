package com.javanibble.springdata.examples.repository;

import com.javanibble.springdata.examples.model.Film;
import org.springframework.data.repository.CrudRepository;

public interface FilmRepository extends CrudRepository<Film, Integer> {
}
