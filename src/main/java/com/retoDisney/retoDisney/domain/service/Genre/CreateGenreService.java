package com.retoDisney.retoDisney.domain.service.Genre;

import com.retoDisney.retoDisney.domain.model.Genre;
import com.retoDisney.retoDisney.domain.repository.GenreRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateGenreService {
    private final GenreRepository genreRepository;

    public CreateGenreService(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    public Genre createExecute(Genre genre) {
        String name = genre.getName();
        String image = genre.getImage();

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }

        if (name.length() > 50 || name.length() < 3) {
            throw new IllegalArgumentException("Name does not comply with the character limits");
        }

        if (image == null || image.isBlank()) {
            throw new IllegalArgumentException("Image cannot be empty");
        }

        if (!image.startsWith("http://") || !image.startsWith("https://")) {
            throw new IllegalArgumentException("Image must start with http:// or https://");
        }

        return genreRepository.save(genre);
    }
}
