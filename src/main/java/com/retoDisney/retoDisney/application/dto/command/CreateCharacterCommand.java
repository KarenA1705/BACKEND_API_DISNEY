package com.retoDisney.retoDisney.application.dto.command;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class CreateCharacterCommand {

    private String name;
    private Integer age;
    private Long weight;
    private String history;
    private List<Long> moviesId;
    private String image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public List<Long> getMoviesId() {
        return moviesId;
    }

    public void setMoviesId(List<Long> moviesId) {
        this.moviesId = moviesId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
