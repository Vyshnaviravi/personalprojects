package com.jsp.movie.service;

import com.jsp.movie.entity.Movie;
import com.jsp.movie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAllMovies() {
        return movieRepository.findAllByOrderByTitleAsc();
    }

    public Optional<Movie> getMovieById(Integer id) {
        return movieRepository.findById(id);
    }

    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public void deleteMovie(Integer id) {
        movieRepository.deleteById(id);
    }

    public List<Movie> searchByTitle(String title) {
        return movieRepository.findByTitleContainingIgnoreCase(title);
    }

    public List<Movie> filterByGenre(Integer genreId) {
        return movieRepository.findByGenreId(genreId);
    }

    public List<Movie> filterByMinRating(Double minRating) {
        return movieRepository.findByRatingGreaterThanEqual(minRating);
    }

    public long getTotalCount() {
        return movieRepository.count();
    }
}
