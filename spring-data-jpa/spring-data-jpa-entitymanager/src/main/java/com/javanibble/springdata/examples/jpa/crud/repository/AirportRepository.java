package com.javanibble.springdata.examples.jpa.crud.repository;

import com.javanibble.springdata.examples.jpa.crud.model.Airport;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class AirportRepository {


    @PersistenceContext
    EntityManager entityManager;


    public List<Airport> findAllAirports() {
        TypedQuery<Airport> typedQuery = entityManager.createNamedQuery("FindAllAirports", Airport.class);
        return typedQuery.getResultList();
    }


    public List<Airport> findAllAirportsOrderNameAsc() {
        TypedQuery<Airport> typedQuery = entityManager.createNamedQuery("FindAllAirportsOrderByNameAsc", Airport.class);
        return typedQuery.getResultList();
    }


    public Airport findAirportById(int id) {
        return entityManager.find(Airport.class, id);
    }


    public Airport insertAirport(Airport airport) {
        entityManager.persist(airport);
        return airport;
    }



    public Airport updateAirport(Airport airport) {
        return entityManager.merge(airport);
    }


    public int deleteAirportById(int id) {
        Airport airport = findAirportById(id);
        entityManager.remove(airport);
        return id;
    }
}
