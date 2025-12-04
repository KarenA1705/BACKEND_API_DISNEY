package com.retoDisney.retoDisney.infrastructure.controller;

import com.retoDisney.retoDisney.application.dto.command.CreateCharacterCommand;
import com.retoDisney.retoDisney.application.dto.response.CharacterResponse;
import com.retoDisney.retoDisney.application.usecase.CreateCharacterUseCase;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CharacterController {
    private final CreateCharacterUseCase createCharacterUseCase;

    public CharacterController(CreateCharacterUseCase createCharacterUseCase) {
        this.createCharacterUseCase = createCharacterUseCase;
    }

    @PostMapping("/characters")
    public CharacterResponse create(@RequestBody CreateCharacterCommand command) {
        return createCharacterUseCase.execute(command);
    }
}
