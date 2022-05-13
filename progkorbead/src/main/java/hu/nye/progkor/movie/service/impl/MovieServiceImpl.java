package hu.nye.progkor.movie.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import hu.nye.progkor.movie.model.Genre;
import hu.nye.progkor.movie.model.Movie;
import hu.nye.progkor.movie.model.exception.NotFoundException;
import hu.nye.progkor.movie.service.MovieService;
import org.springframework.stereotype.Service;

/**
 * Service impl.
 */
@Service
public class MovieServiceImpl implements MovieService {

    private static final List<Movie> DATABASE = new ArrayList<>();

    static {
        DATABASE.add(new Movie(1,  "The Godfather", 1972, Genre.drama));
        DATABASE.add(new Movie(2, "The Dark Knight", 2008, Genre.action));
        DATABASE.add(new Movie(3, "Lord of the Rings: Return of the King", 2003, Genre.fantasy));
        DATABASE.add(new Movie(4, "Lion King", 1994, Genre.animated));
    }

    @Override
    public List<Movie> getAllMovie() {
        return Collections.unmodifiableList(DATABASE);
    }

}
