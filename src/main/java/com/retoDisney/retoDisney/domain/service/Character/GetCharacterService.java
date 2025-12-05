package com.retoDisney.retoDisney.domain.service.Character;

import com.retoDisney.retoDisney.domain.model.Character;
import com.retoDisney.retoDisney.domain.repository.CharacterRespository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GetCharacterService {

    private final CharacterRespository characterRespository;

    public GetCharacterService(CharacterRespository characterRespository) {
        this.characterRespository = characterRespository;
    }

    public Optional<Character> getCharacterById(Long id) {

        if (id == null)
            throw new IllegalArgumentException("Id cannot be empty");

        if (id <= 0)
            throw new IllegalArgumentException("The id is not found within the limits");

        return characterRespository.findById(id);
    }

    public List<Character> getAllCharacter() {
        return characterRespository.findAll();
    }

}
