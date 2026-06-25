package com.jsp.movie.repository;

import com.jsp.movie.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {

    List<Movie> findByTitleContainingIgnoreCase(String title);

    List<Movie> findByGenreId(Integer genreId);

    List<Movie> findByDirectorId(Integer directorId);

    @Query("SELECT m FROM Movie m WHERE m.rating >= :minRating ORDER BY m.rating DESC")
    List<Movie> findByRatingGreaterThanEqual(@Param("minRating") Double minRating);

    List<Movie> findAllByOrderByTitleAsc();
}
