package com.retoDisney.retoDisney.infrastructure.repository.CharacterRepository.character;

import com.retoDisney.retoDisney.domain.filter.CharacterFilter;
import com.retoDisney.retoDisney.domain.model.Character;
import com.retoDisney.retoDisney.domain.repository.CharacterRespository;
import com.retoDisney.retoDisney.infrastructure.mapper.CharacterMapper;
import com.retoDisney.retoDisney.infrastructure.repository.CharacterRepository.character.CharacterJpaRepository;
import com.retoDisney.retoDisney.infrastructure.repository.Entity.CharacterEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CharacterRepositoryImpl implements CharacterRespository {

    private final CharacterJpaRepository jpaRepository;

    public CharacterRepositoryImpl(CharacterJpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public Character save(Character character) {
        CharacterEntity entity = CharacterMapper.toEntity(character);
        CharacterEntity saved = jpaRepository.save(entity);
        return CharacterMapper.toDomain(saved);
    }

    @Override
    public List<Character> findAll() {
        return jpaRepository.findAll().stream()
                .map(CharacterMapper::toDomain)
                .toList();
    }

    @Override
    public Optional<Character> findById(Long id) {
        return jpaRepository.findById(id).map(CharacterMapper::toDomain);
    }

    @Override
    public boolean deleteById(Long id) {
        if (existById(id))
            return false;

        jpaRepository.deleteById(id);
        return true;
    }

    @Override
    public Character updateById(Long id, Character character) {
        return null;
    }

    @Override
    public List<Character> filter(CharacterFilter filter) {
        List<CharacterEntity> getFilter = jpaRepository.findByFilter(filter.getName(), filter.getAge());
        return getFilter.stream()
                .map(CharacterMapper::toDomain)
                .toList();
    }

    @Override
    public boolean existsByName(String name) {
        return false;
    }

    @Override
    public boolean existById(Long id) {
        return !jpaRepository.existsById(id);
    }
}
