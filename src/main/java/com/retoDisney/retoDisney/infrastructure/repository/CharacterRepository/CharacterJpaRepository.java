package com.retoDisney.retoDisney.infrastructure.repository.CharacterRepository;

import com.retoDisney.retoDisney.infrastructure.repository.Entity.CharacterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterJpaRepository extends JpaRepository<CharacterEntity, Long> {
}
