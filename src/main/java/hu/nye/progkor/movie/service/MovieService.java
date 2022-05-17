package hu.nye.progkor.movie.service;

import hu.nye.progkor.movie.model.Movie;

import java.util.List;

/**
 * Service interface.
 */
public interface MovieService {

  List<Movie> getAllMovie();

  Movie getMovie(int id);

  void addMovie(int id);

  void deleteMovie(int id);

  List<Movie> getAllMovieProfile();
}
