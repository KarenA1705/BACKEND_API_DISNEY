package com.retoDisney.retoDisney.infrastructure.repository.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "genre")
@Data
@Setter
@Getter
public class GenreEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String image;
    //private List<Movie> movies;
}
