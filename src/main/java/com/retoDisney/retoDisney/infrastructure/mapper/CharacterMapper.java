package com.retoDisney.retoDisney.infrastructure.mapper;

import com.retoDisney.retoDisney.domain.model.Character;
import com.retoDisney.retoDisney.infrastructure.repository.Entity.CharacterEntity;

public class CharacterMapper {

    public static CharacterEntity toEntity(Character character) {
        CharacterEntity entity = new CharacterEntity();
        entity.setId(character.getId());
        entity.setName(character.getName());
        entity.setImage(character.getImage());
        entity.setAge(character.getAge());
        entity.setWeight(character.getWeight());
        return entity;
    }

    public static Character toDomain(CharacterEntity entity) {
        return new Character(
                entity.getId(),
                entity.getImage(),
                entity.getName(),
                entity.getAge(),
                entity.getWeight(),
                entity.getHistory()
        );
    }
}
