package com.retoDisney.retoDisney.domain.repository;

import com.retoDisney.retoDisney.domain.filter.CharacterFilter;
import com.retoDisney.retoDisney.domain.model.Character;

import java.util.List;
import java.util.Optional;

public interface CharacterRespository {

    Character save(Character character);

    List<Character> findAll();

    Optional<Character> findById(Long id);

    boolean deleteById(Long id);

    Character updateById(Long id, Character character);

    List<Character> filter(CharacterFilter filter);

    boolean existsByName(String name);

    boolean existById(Long id);
}
