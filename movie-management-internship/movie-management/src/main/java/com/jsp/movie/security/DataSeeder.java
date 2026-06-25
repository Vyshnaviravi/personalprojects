package com.jsp.movie.security;

import com.jsp.movie.entity.*;
import com.jsp.movie.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataSeeder implements CommandLineRunner {

    @Autowired private UserRepository userRepository;
    @Autowired private GenreRepository genreRepository;
    @Autowired private DirectorRepository directorRepository;
    @Autowired private MovieRepository movieRepository;
    @Autowired private PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) {

        // Create default admin user
        if (!userRepository.existsByUsername("admin")) {
            User admin = new User();
            admin.setUsername("admin");
            admin.setPassword(passwordEncoder.encode("admin123"));
            admin.setRole("ROLE_ADMIN");
            admin.setEnabled(true);
            userRepository.save(admin);
        }

        // Create default regular user
        if (!userRepository.existsByUsername("user")) {
            User user = new User();
            user.setUsername("user");
            user.setPassword(passwordEncoder.encode("user123"));
            user.setRole("ROLE_USER");
            user.setEnabled(true);
            userRepository.save(user);
        }

        // Seed genres
        if (genreRepository.count() == 0) {
            genreRepository.save(new Genre(null, "Action", null));
            genreRepository.save(new Genre(null, "Drama", null));
            genreRepository.save(new Genre(null, "Comedy", null));
            genreRepository.save(new Genre(null, "Thriller", null));
            genreRepository.save(new Genre(null, "Sci-Fi", null));
        }

        // Seed directors
        if (directorRepository.count() == 0) {
            directorRepository.save(new Director(null, "Christopher Nolan", "British", null));
            directorRepository.save(new Director(null, "Steven Spielberg", "American", null));
            directorRepository.save(new Director(null, "Martin Scorsese", "American", null));
        }

        // Seed sample movies
        if (movieRepository.count() == 0) {
            Genre action = genreRepository.findAll().get(0);
            Genre scifi = genreRepository.findAll().get(4);
            Director nolan = directorRepository.findAll().get(0);

            movieRepository.save(new Movie(null, "Inception", 2010, 8.8, "A mind-bending thriller", scifi, nolan));
            movieRepository.save(new Movie(null, "The Dark Knight", 2008, 9.0, "Batman vs Joker", action, nolan));
            movieRepository.save(new Movie(null, "Interstellar", 2014, 8.6, "Space exploration story", scifi, nolan));
        }
    }
}
