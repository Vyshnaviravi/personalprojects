package com.jsp.movie.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "directors")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Director {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Director name is required")
    @Column(nullable = false)
    private String name;

    private String nationality;

    @OneToMany(mappedBy = "director", cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<Movie> movies;
}
