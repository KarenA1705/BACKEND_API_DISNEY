package com.retoDisney.retoDisney.domain.service.Character;

import com.retoDisney.retoDisney.domain.model.Character;
import com.retoDisney.retoDisney.domain.repository.CharacterRespository;
import org.springframework.stereotype.Service;

@Service
public class CreateCharacterService {

    private final CharacterRespository characterRespository;

    public CreateCharacterService(CharacterRespository characterRespository) {
        this.characterRespository = characterRespository;
    }

    public Character createExecute(Character character) {

        String name = character.getName();
        Integer age = character.getAge();
        Long weight = character.getWeight();
        String history = character.getHistory();
        String image = character.getImage();

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }

        if (name.length() > 50 || name.length() < 2) {
            throw new IllegalArgumentException("Name does not comply with the character limits");
        }

        if (characterRespository.existsByName(name)) {
            throw new IllegalArgumentException("A character with this name already exists");
        }

        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age does not meet the range");
        }

        if (weight <= 0) {
            throw new IllegalArgumentException("The weight cannot be a negative value or zero.");
        }

        if (history == null || history.isBlank()) {
            throw new IllegalArgumentException("History cannot be empty");
        }

        if (history.length() > 500) {
            throw new IllegalArgumentException("The description only allows 500 characters.");
        }

        if (image == null || image.isBlank()) {
            throw new IllegalArgumentException("Image cannot be empty");
        }

        if (!image.startsWith("http://") && !image.startsWith("https://")) {
            throw new IllegalArgumentException("Image must start with http:// or https://");
        }

        return characterRespository.save(character);
    }
}
