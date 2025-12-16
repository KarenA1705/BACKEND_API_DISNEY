package com.retoDisney.retoDisney.infrastructure.repository.CharacterRepository.genre;

import com.retoDisney.retoDisney.domain.model.Genre;
import com.retoDisney.retoDisney.domain.repository.GenreRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class GenreRepositoryImpl implements GenreRepository {
    @Override
    public Genre save(Genre genre) {
        return null;
    }

    @Override
    public Optional<Genre> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Genre> findAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
