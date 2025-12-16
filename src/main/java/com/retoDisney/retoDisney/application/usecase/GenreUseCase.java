package com.retoDisney.retoDisney.application.usecase;

import com.retoDisney.retoDisney.application.dto.command.GenreCommand;
import com.retoDisney.retoDisney.application.dto.response.GenreResponse;
import com.retoDisney.retoDisney.domain.model.Character;
import com.retoDisney.retoDisney.domain.model.Genre;
import com.retoDisney.retoDisney.domain.service.Genre.CreateGenreService;
import com.retoDisney.retoDisney.domain.service.Genre.DeleteGenreService;
import org.springframework.stereotype.Service;

@Service
public class GenreUseCase {
    private final CreateGenreService createGenreService;
    private final DeleteGenreService deleteGenreService;

    public GenreUseCase(CreateGenreService createGenreService, DeleteGenreService deleteGenreService) {
        this.createGenreService = createGenreService;
        this.deleteGenreService = deleteGenreService;
    }

    public GenreResponse executeSave(GenreCommand genreCommand) {
        Genre genre = new Genre(
                null,
                genreCommand.getName(),
                genreCommand.getImage()
        );

        Genre save = createGenreService.createExecute(genre);

        return new GenreResponse(
                save.getId(),
                save.getName(),
                save.getImage()
        );
    }
}
