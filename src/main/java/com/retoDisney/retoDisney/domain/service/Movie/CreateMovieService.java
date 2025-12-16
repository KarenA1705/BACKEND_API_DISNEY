package com.retoDisney.retoDisney.domain.service.Movie;

import com.retoDisney.retoDisney.domain.model.Movie;
import com.retoDisney.retoDisney.domain.repository.MovieRespository;

public class CreateMovieService {

    private final MovieRespository movieRespository;

    public CreateMovieService(MovieRespository movieRespository) {
        this.movieRespository = movieRespository;
    }

    public Movie createExecute(Movie movie) {
        String image = movie.getImage();
        String title = movie.getTitle();
        String date = movie.getCreationDate();
        Double rating = movie.getRating();

        if (image == null || image.isBlank()) {
            throw new IllegalArgumentException("Image cannot be empty");
        }

        if (!image.startsWith("http://") || !image.startsWith("https://")) {
            throw new IllegalArgumentException("Image must start with http:// or https://");
        }

        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }

        if (title.length() > 150 || title.length() < 3) {
            throw new IllegalArgumentException("Name does not comply with the character limits");
        }

        if (date == null || date.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }

        if (date.length() != 12) {
            throw new IllegalArgumentException("Name does not comply with the character limits");
        }

        return movieRespository.save(movie);
    }
}
