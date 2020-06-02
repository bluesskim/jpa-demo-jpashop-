package com.jpabook.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Movie extends Item {
    private String director;
    private String actor;

    @Builder
    public Movie(Long id, String name, int price, int stockQuantity, List<Category> categories, String director, String actor) {
        super(id, name, price, stockQuantity, categories);
        this.director = director;
        this.actor = actor;
    }
}