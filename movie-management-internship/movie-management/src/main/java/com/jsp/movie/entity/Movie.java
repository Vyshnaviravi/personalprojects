package com.jsp.movie.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Table(name = "movies")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Movie title is required")
    @Column(nullable = false)
    private String title;

    @NotNull(message = "Release year is required")
    @Min(value = 1900, message = "Year must be after 1900")
    @Max(value = 2100, message = "Year must be realistic")
    private Integer releaseYear;

    @NotNull(message = "Rating is required")
    @DecimalMin(value = "0.0", message = "Rating must be at least 0")
    @DecimalMax(value = "10.0", message = "Rating must be at most 10")
    private Double rating;

    private String description;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;

    @ManyToOne
    @JoinColumn(name = "director_id")
    private Director director;
}
