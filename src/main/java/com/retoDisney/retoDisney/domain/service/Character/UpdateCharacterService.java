package com.retoDisney.retoDisney.domain.service.Character;

import com.retoDisney.retoDisney.domain.model.Character;
import com.retoDisney.retoDisney.domain.repository.CharacterRespository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UpdateCharacterService {

    private final CharacterRespository respository;

    public UpdateCharacterService(CharacterRespository respository) {
        this.respository = respository;
    }

    public Optional<Character> updateCharacter(Long id, Character character) {
        if (!respository.existById(id))
            return Optional.empty();
        return Optional.ofNullable(respository.updateById(id, character));
    }
}
