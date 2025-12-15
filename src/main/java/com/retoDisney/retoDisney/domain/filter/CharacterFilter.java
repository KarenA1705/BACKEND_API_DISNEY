package com.retoDisney.retoDisney.domain.filter;

public class CharacterFilter {

    private String name;
    private Integer age;
    private Long movieId;

    public CharacterFilter(String name, Integer age, Long movieId) {
        this.name = name;
        this.age = age;
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Long getMovieId() {
        return movieId;
    }
}
