package com.retoDisney.retoDisney.infrastructure.repository.CharacterRepository.character;

import com.retoDisney.retoDisney.infrastructure.repository.Entity.CharacterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CharacterJpaRepository extends JpaRepository<CharacterEntity, Long> {

    @Query("""
            SELECT DISTINCT c FROM CharacterEntity c
            WHERE (:name IS NULL OR LOWER(c.name) LIKE LOWER(CONCAT('%', :name, '%')))
            AND (:age IS NULL OR c.age = :age)
            """)
    List<CharacterEntity> findByFilter(@Param("name") String name, @Param("age") Integer age);
}
