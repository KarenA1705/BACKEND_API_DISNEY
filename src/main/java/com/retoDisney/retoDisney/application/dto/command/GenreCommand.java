package com.retoDisney.retoDisney.application.dto.command;

import com.retoDisney.retoDisney.domain.model.Movie;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class GenreCommand {
    private Long id;
    private String name;
    private String image;
    private List<Movie> movieList;
}
