package com.jsp.movie.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "genres")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Genre name is required")
    @Column(nullable = false, unique = true)
    private String name;

    @OneToMany(mappedBy = "genre", cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<Movie> movies;
}
