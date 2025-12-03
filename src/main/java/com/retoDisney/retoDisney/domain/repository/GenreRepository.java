package com.retoDisney.retoDisney.domain.repository;

import com.retoDisney.retoDisney.domain.model.Genre;

import java.util.List;
import java.util.Optional;

public interface GenreRepository {

    Genre save(Genre genre);

    Optional<Genre> findById(Long id);

    List<Genre> findAll();

    void deleteById(Long id);

}
