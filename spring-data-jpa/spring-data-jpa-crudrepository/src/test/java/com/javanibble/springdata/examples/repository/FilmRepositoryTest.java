package com.javanibble.springdata.examples.repository;

import com.javanibble.springdata.examples.model.Film;
import com.javanibble.springdata.examples.model.Rating;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.sql.Timestamp;
import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@Slf4j
public class FilmRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private FilmRepository repository;


    @Test
    public void testFilmCount() {
        long numberOfExpectedRecords = 10;
        long numberOfRecords = repository.count();

        assertThat(numberOfExpectedRecords).isEqualTo(numberOfRecords);
    }


    @Test
    public void testDeleteFilm() {
        Optional<Film> filmOptional = repository.findById(Integer.valueOf(1));
        Film myFilm = filmOptional.get();

        repository.delete(myFilm);

        Optional<Film> result = repository.findById(Integer.valueOf(1));
        assertThat(result.isEmpty()).isTrue();
    }


    @Test
    public void testDeleteAllFilms() {
        repository.deleteAll();

        long numberOfExpectedRecords = 0;
        long numberOfRecords = repository.count();

        assertThat(numberOfExpectedRecords).isEqualTo(numberOfRecords);
    }


    @Test
    public void testDeleteListOfFilms() {
        long numberOfExpectedRecords = 0;
        long numberOfRecords = 0;

        Iterable<Film> listOfFilms = repository.findAll();
        repository.deleteAll(listOfFilms);
        numberOfRecords = repository.count();

        assertThat(numberOfExpectedRecords).isEqualTo(numberOfRecords);
    }


    @Test
    public void testDeleteAllFilmsById() {
        long numberOfExpectedRecords = 0;
        long numberOfRecords = 0;
        List<Integer> list = Collections.EMPTY_LIST;
        Collections.addAll(list = new ArrayList<Integer>(), 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        repository.deleteAllById(list);

        numberOfRecords = repository.count();
        assertThat(numberOfExpectedRecords).isEqualTo(numberOfRecords);
    }


    @Test
    public void testDeleteFilmById(){
        repository.deleteById(Integer.valueOf(1));

        Optional<Film> result = repository.findById(Integer.valueOf(1));
        assertThat(result.isEmpty()).isTrue();
    }


    @Test
    public void testFilmExistById() {
        boolean filmExists = repository.existsById(Integer.valueOf(1));
        assertThat(filmExists).isTrue();
    }


    @Test
    public void testFindAllFilms() {
        List<String> listOfFilmTitles = Arrays.asList("ACADEMY DINOSAUR", "ACE GOLDFINGER", "ADAPTATION HOLES", "AFFAIR PREJUDICE", "AFRICAN EGG", "AGENT TRUMAN", "AIRPLANE SIERRA", "AIRPORT POLLOCK", "ALABAMA DEVIL", "ALADDIN CALENDAR");

        Iterable<Film> listOfFilms = repository.findAll();
        for(Film film: listOfFilms) {
            assertThat(listOfFilmTitles).contains(film.getTitle());
        }
    }


    @Test
    public void testFindAllFilmsById() {
        List<Integer> listOfFilmIds = Collections.EMPTY_LIST;
        Collections.addAll(listOfFilmIds = new ArrayList<Integer>(), 1, 2);
        List<String> listOfFilmTitles = Arrays.asList("ACADEMY DINOSAUR", "ACE GOLDFINGER");

        Iterable<Film> listOfFilms = repository.findAllById(listOfFilmIds);
        for(Film film: listOfFilms) {
            assertThat(listOfFilmTitles).contains(film.getTitle());
        }
    }


    @Test
    public void testFindFilmById() {
        Optional<Film> result = repository.findById(Integer.valueOf(1));
        Film retrievedFilm = result.get();

        assertThat(retrievedFilm.getTitle()).isEqualTo("ACADEMY DINOSAUR");
    }


    @Test
    public void testPersistSingleFilmEntity() {
        Film myFirstFilm = Film.builder().id(11).title("MY FIRST FILM").description("...")
                .releaseYear(2010).rentalDuration(3).rentalRate(0.99).length(96).replacement_cost(21.99)
                .rating(Rating.PG).specialFeatures("Deleted Scenes,Behind the Scenes")
                .lastUpdate(new Timestamp(System.currentTimeMillis())).build();

        Film savedFilm = repository.save(myFirstFilm);
        assertThat(savedFilm.getTitle()).isEqualTo(myFirstFilm.getTitle());
    }


    @Test
    public void testPersistListOfFilms() {
        List<String> listOfFilmTitles = Arrays.asList("MY FIRST FILM", "MY Second FILM");

        Film myFirstFilm = Film.builder().id(11).title("MY FIRST FILM").description("...")
                .releaseYear(2010).rentalDuration(3).rentalRate(0.99).length(96).replacement_cost(21.99)
                .rating(Rating.PG).specialFeatures("Deleted Scenes,Behind the Scenes")
                .lastUpdate(new Timestamp(System.currentTimeMillis())).build();

        Film mySecondFilm = Film.builder().id(12).title("MY Second FILM").description("...")
                .releaseYear(2011).rentalDuration(2).rentalRate(0.78).length(102).replacement_cost(22.99)
                .rating(Rating.PG).specialFeatures("Deleted Scenes")
                .lastUpdate(new Timestamp(System.currentTimeMillis())).build();

        List<Film> listOfFilms = new ArrayList<Film>();
        listOfFilms.add(myFirstFilm);
        listOfFilms.add(mySecondFilm);

        Iterable<Film> persistedFilms = repository.saveAll(listOfFilms);

        for(Film film: persistedFilms) {
            assertThat(listOfFilmTitles).contains(film.getTitle());
        }
    }

}
