package com.jsp.movie.controller;

import com.jsp.movie.entity.Movie;
import com.jsp.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieApiController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable Integer id) {
        return movieService.getMovieById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/search")
    public List<Movie> searchMovies(@RequestParam String title) {
        return movieService.searchByTitle(title);
    }

    @GetMapping("/genre/{genreId}")
    public List<Movie> getByGenre(@PathVariable Integer genreId) {
        return movieService.filterByGenre(genreId);
    }

    @GetMapping("/rating")
    public List<Movie> getByMinRating(@RequestParam Double min) {
        return movieService.filterByMinRating(min);
    }
}
