package com.retoDisney.retoDisney.infrastructure.controller;

import com.retoDisney.retoDisney.application.dto.command.CharacterCommand;
import com.retoDisney.retoDisney.application.dto.response.CharacterResponse;
import com.retoDisney.retoDisney.application.usecase.CharacterUseCase;
import com.retoDisney.retoDisney.domain.model.Character;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CharacterController {

    private final CharacterUseCase characterUseCase;

    public CharacterController(CharacterUseCase characterUseCase) {
        this.characterUseCase = characterUseCase;
    }

    @PostMapping("/characters")
    public CharacterResponse create(@RequestBody CharacterCommand command) {
        return characterUseCase.executeSave(command);
    }

    @DeleteMapping("/characters/{id}")
    public String delete(@PathVariable Long id) {
        boolean status = characterUseCase.executeDelete(id);
        return status ? "Eliminado" : "Ocurrio un error";
    }

    @GetMapping("/characters/{id}")
    public Optional<CharacterResponse> getById(@PathVariable Long id) {
        return characterUseCase.executeCharacterByID(id);
    }

    @GetMapping("/characters")
    public List<CharacterResponse> getAll() {
        return characterUseCase.executeCharacterAll();
    }

    @PutMapping("/characters/{id}")
    public Optional<CharacterResponse> update(@PathVariable Long id, @RequestBody CharacterCommand command) {
        return characterUseCase.updateCharacter(id, command);
    }
}
