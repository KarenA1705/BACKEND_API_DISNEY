package com.retoDisney.retoDisney.domain.service.Character;

import com.retoDisney.retoDisney.domain.repository.CharacterRespository;
import org.springframework.stereotype.Service;

@Service
public class DeleteCharacterService {

    private final CharacterRespository characterRespository;

    public DeleteCharacterService(CharacterRespository characterRespository) {
        this.characterRespository = characterRespository;
    }

    public boolean deleteExecute(Long id) {
        if (id == null || id <= 0) {
            return false;
        }

        if (characterRespository.existById(id)) {
            return false;
        }

        return characterRespository.deleteById(id);
    }
}
