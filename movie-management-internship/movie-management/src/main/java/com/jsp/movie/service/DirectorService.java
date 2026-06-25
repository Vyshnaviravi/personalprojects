package com.jsp.movie.service;

import com.jsp.movie.entity.Director;
import com.jsp.movie.repository.DirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DirectorService {

    @Autowired
    private DirectorRepository directorRepository;

    public List<Director> getAllDirectors() {
        return directorRepository.findAll();
    }

    public Optional<Director> getById(Integer id) {
        return directorRepository.findById(id);
    }

    public Director save(Director director) {
        return directorRepository.save(director);
    }

    public void delete(Integer id) {
        directorRepository.deleteById(id);
    }
}
