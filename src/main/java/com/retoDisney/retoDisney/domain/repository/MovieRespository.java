package com.retoDisney.retoDisney.domain.repository;

import com.retoDisney.retoDisney.domain.filter.MovieFilter;
import com.retoDisney.retoDisney.domain.model.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieRespository {

    Movie save(Movie movie);
    List<Movie> findAll();
    Optional<Movie> findById(Long id);
    Movie updateById(Long id);
    void deleteById(Long id);
    List<MovieFilter> filter(MovieFilter filter);
}
