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
public class Album extends Item {
    private String artist;
    private String etc;

    @Builder
    public Album(Long id, String name, int price, int stockQuantity, List<Category> categories, String artist, String etc) {
        super(id, name, price, stockQuantity, categories);
        this.artist = artist;
        this.etc = etc;
    }
}