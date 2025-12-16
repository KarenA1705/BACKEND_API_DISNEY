package com.retoDisney.retoDisney.infrastructure.repository.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "movie")
@Data
@Getter
@Setter
public class MovieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String image;
    private String title;
    private String creationDate;
    private Double rating;
    //private List<Character> characters;
}
