package com.retoDisney.retoDisney.application.usecase;

import com.retoDisney.retoDisney.application.dto.command.CharacterCommand;
import com.retoDisney.retoDisney.application.dto.response.CharacterResponse;
import com.retoDisney.retoDisney.domain.filter.CharacterFilter;
import com.retoDisney.retoDisney.domain.model.Character;
import com.retoDisney.retoDisney.domain.service.Character.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CharacterUseCase {

    private final CreateCharacterService createCharacterService;
    private final DeleteCharacterService deleteCharacterService;
    private final GetCharacterService getCharacterByIDService;
    private final UpdateCharacterService updateCharacterService;
    private final FilterCharactersService filterCharactersService;

    public CharacterUseCase(CreateCharacterService createCharacterService, DeleteCharacterService deleteCharacterService, GetCharacterService getCharacterByIDService, UpdateCharacterService updateCharacterService, FilterCharactersService filterCharactersService) {
        this.createCharacterService = createCharacterService;
        this.deleteCharacterService = deleteCharacterService;
        this.getCharacterByIDService = getCharacterByIDService;
        this.updateCharacterService = updateCharacterService;
        this.filterCharactersService = filterCharactersService;
    }

    public CharacterResponse executeSave(CharacterCommand command) {

        Character character = new Character(
                null,
                command.getImage(),
                command.getName(),
                command.getAge(),
                command.getWeight(),
                command.getHistory()
        );

        Character save = createCharacterService.createExecute(character);

        return new CharacterResponse(
                save.getId(),
                save.getImage(),
                save.getName()
        );
    }

    public boolean executeDelete(Long id) {
        return deleteCharacterService.deleteExecute(id);
    }

    public Optional<CharacterResponse> executeCharacterByID(Long id) {
        return Optional.ofNullable(getCharacterByIDService.getCharacterById(id)
                .map(character -> new CharacterResponse(
                        character.getId(),
                        character.getImage(),
                        character.getName()
                ))
                .orElseThrow(() -> new RuntimeException("Character not found")));
    }

    public List<CharacterResponse> executeCharacterAll() {
        List<Character> list = getCharacterByIDService.getAllCharacter();
        return list.stream()
                .map(c -> new CharacterResponse(
                        c.getId(),
                        c.getImage(),
                        c.getName()
                ))
                .toList();
    }

    public Optional<CharacterResponse> updateCharacter(Long id, CharacterCommand command) {
        Character character = new Character(
                id,
                command.getImage(),
                command.getName(),
                command.getAge(),
                command.getWeight(),
                command.getHistory()
        );

        return updateCharacterService.updateCharacter(id, character)
                .map(c -> new CharacterResponse(
                        c.getId(),
                        c.getImage(),
                        c.getName()
                ));
    }

    public List<CharacterResponse> filterCharacter(CharacterFilter characterFilter) {
        List<Character> list = filterCharactersService.getCharacterParams(characterFilter);
        return list.stream().map(c -> new CharacterResponse(
                c.getId(),
                c.getImage(),
                c.getName()
        )).toList();
    }
}
