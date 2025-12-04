package com.retoDisney.retoDisney.application.usecase;

import com.retoDisney.retoDisney.application.dto.command.CreateCharacterCommand;
import com.retoDisney.retoDisney.application.dto.response.CharacterResponse;
import com.retoDisney.retoDisney.domain.model.Character;
import com.retoDisney.retoDisney.domain.service.Character.CreateCharacterService;
import org.springframework.stereotype.Service;

@Service
public class CreateCharacterUseCase {

    private final CreateCharacterService createCharacterService;

    public CreateCharacterUseCase(CreateCharacterService createCharacterService) {
        this.createCharacterService = createCharacterService;
    }

    public CharacterResponse execute(CreateCharacterCommand command) {

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
}
