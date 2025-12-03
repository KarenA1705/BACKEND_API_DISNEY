package com.retoDisney.retoDisney.domain.repository;

import com.retoDisney.retoDisney.domain.filter.CharacterFilter;
import com.retoDisney.retoDisney.domain.model.Character;

import java.util.List;
import java.util.Optional;

public interface CharacterRespository {

    Character save(Character character);

    List<Character> findAll();

    Optional<Character> findById(Long id);

    void deleteById(Long id);

    Character updateById(Long id);

    List<CharacterFilter> filter(CharacterFilter filter);
}
