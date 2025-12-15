package com.retoDisney.retoDisney.domain.service.Character;

import com.retoDisney.retoDisney.domain.filter.CharacterFilter;
import com.retoDisney.retoDisney.domain.model.Character;
import com.retoDisney.retoDisney.domain.repository.CharacterRespository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilterCharactersService {

    private final CharacterRespository characterRespository;

    public FilterCharactersService(CharacterRespository characterRespository) {
        this.characterRespository = characterRespository;
    }

    public List<Character> getCharacterParams(CharacterFilter characterFilter) {
        return characterRespository.filter(characterFilter);
    }
}
