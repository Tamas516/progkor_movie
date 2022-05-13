package hu.nye.progkor.movie.controller;

import java.util.List;

import hu.nye.progkor.movie.model.Movie;
import hu.nye.progkor.movie.service.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller class.
 */
@Controller
@RequestMapping("/movie")
public class MovieController {

    private static final String MOVIE_LIST_TEMPLATE_NAME = "movie/list";
    private static final String MOVIE_EDIT_TEMPLATE_NAME = "movie/edit";
    private static final String MOVIE_ATTRIBUTE_NAME = "movie";

    private final MovieService movieService;

    public MovieController(final MovieService movieService) {
        this.movieService = movieService;
    }

    /**
     * Get all movie.
     */
    @GetMapping
    public String getAllMovie(final Model model) {
        final List<Movie> movies = movieService.getAllMovie();
        model.addAttribute("movies", movies);
        return MOVIE_LIST_TEMPLATE_NAME;
    }


}
