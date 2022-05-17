package hu.nye.progkor.movie.service.impl;

import hu.nye.progkor.movie.model.Genre;
import hu.nye.progkor.movie.model.Movie;
import hu.nye.progkor.movie.model.exception.NotFoundException;
import hu.nye.progkor.movie.service.MovieService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MovieServiceImplTest {

    private static final Movie GODFATHER = new Movie(1, "The Godfather", 1972, Genre.drama);
    private static final Movie THEDARKKNIGHT = new Movie(2, "The Dark Knight", 2008, Genre.action);
    private static final Movie LORDOFTHERINGS = new Movie(3, "Lord of the Rings: Return of the King", 2003, Genre.fantasy);
    private static final Movie LIONKING = new Movie(4, "Lion King", 1994, Genre.animated);
    private static final List<Movie> MOVIES = List.of(
            GODFATHER,
            THEDARKKNIGHT,
            LORDOFTHERINGS,
            LIONKING
    );
    private static final List<Movie> PROFILEMOVIES = List.of(

    );
    public static final int UNKNOWN_MOVIE_ID = -1;
    public static final String DARKKNIGHT = "Dark Knight";

    private MovieService underTest;

    @BeforeEach
    void setUp() {
        underTest = new MovieServiceImpl(MOVIES);
    }

    @Test
    void getAllMovieShouldReturnAllMovie() {
        // when
        final List<Movie> actual = underTest.getAllMovie();
        // then
        assertThat(actual).isEqualTo(MOVIES);
    }

    @Test
    void getMovieShouldReturnMovieWhenGivenIdOfExistingMovie() {
        // when
        final Movie actual = underTest.getMovie(GODFATHER.getId());
        // then
        assertThat(actual).isEqualTo(GODFATHER);
    }

    @Test
    void getMovieShouldThrowNotFoundExceptionWhenGivenIdOfNotExistingMovie() {
        // when then
        assertThrows(NotFoundException.class, () -> underTest.getMovie( UNKNOWN_MOVIE_ID));
    }


//    @Test
//    void addMovieShouldAddMovieWhenGivenIdOfMovie() {
//        // given
//        final List<Movie> expectedRolePlays = List.of(GODFATHER);
//        // when
//        underTest.deleteMovie(LIONKING.getId());
//        final List<Movie> actual = underTest.getAllMovieProfile();
//        // then
//        assertThat(actual).isEqualTo(expectedRolePlays);
//    }
//
//    @Test
//    void deleteRolePlayShouldDeleteRolePlayWhenGivenIdOfRolePlay() {
//        // given
//        final List<Movie> expectedRolePlays = List.of(GODFATHER);
//        // when
//        underTest.deleteMovie(LIONKING.getId());
//        final List<Movie> actual = underTest.getAllMovieProfile();
//        // then
//        assertThat(actual).isEqualTo(expectedRolePlays);
//    }

    @Test
    void getAllMovieProfileShouldReturnAllMovieFromProfile() {
        // when
        final List<Movie> actual = underTest.getAllMovieProfile();
        // then
        assertThat(actual).isEqualTo(PROFILEMOVIES);
    }

}
