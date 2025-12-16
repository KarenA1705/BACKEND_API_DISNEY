package com.retoDisney.retoDisney.application.dto.response;

import com.retoDisney.retoDisney.domain.model.Character;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@NoArgsConstructor
@Data
@Getter
@Setter
public class GenreResponse {
    private Long id;
    private String name;
    private String image;
    private List<Character> characterList;

    public GenreResponse(Long id, String name, String image) {
        this.id = id;
        this.name = name;
        this.image = image;
    }
}
