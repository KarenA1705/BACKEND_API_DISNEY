package com.retoDisney.retoDisney.infrastructure.repository.CharacterRepository.genre;

import com.retoDisney.retoDisney.infrastructure.repository.Entity.GenreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreJpaRepository extends JpaRepository<GenreEntity, Long> {
}
