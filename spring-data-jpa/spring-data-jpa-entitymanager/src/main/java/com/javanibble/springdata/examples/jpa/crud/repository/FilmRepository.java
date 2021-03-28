package com.javanibble.springdata.examples.jpa.crud.repository;


import com.javanibble.springdata.examples.jpa.crud.model.Film;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;


@Repository
@Transactional
public class FilmRepository {


    @PersistenceContext
    EntityManager entityManager;


    public List<Film> findAllFilms() {
        TypedQuery<Film> typedQuery = entityManager.createNamedQuery("FindAllFilms", Film.class);
        return typedQuery.getResultList();
    }


    public List<Film> findAllFilmsOrderTitleAsc() {
        TypedQuery<Film> typedQuery = entityManager.createNamedQuery("FindAllFilmsOrderByTitleAsc", Film.class);
        return typedQuery.getResultList();
    }


    public Film findFilmById(int id) {
        return entityManager.find(Film.class, id);
    }


    public Film insertFilm(Film film) {
        entityManager.persist(film);
        return film;
    }



    public Film updateFilm(Film film) {
        return entityManager.merge(film);
    }


    public int deleteFilmById(int id) {
        Film airport = findFilmById(id);
        entityManager.remove(airport);
        return id;
    }
}
