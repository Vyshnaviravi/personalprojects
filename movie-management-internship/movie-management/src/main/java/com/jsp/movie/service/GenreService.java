package com.jsp.movie.service;

import com.jsp.movie.entity.Genre;
import com.jsp.movie.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GenreService {

    @Autowired
    private GenreRepository genreRepository;

    public List<Genre> getAllGenres() {
        return genreRepository.findAll();
    }

    public Optional<Genre> getById(Integer id) {
        return genreRepository.findById(id);
    }

    public Genre save(Genre genre) {
        return genreRepository.save(genre);
    }

    public void delete(Integer id) {
        genreRepository.deleteById(id);
    }

    public boolean existsByName(String name) {
        return genreRepository.existsByName(name);
    }
}
