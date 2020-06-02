package com.jpabook.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class Book extends Item {
    private String author;
    private String isbn;

    @Builder
    public Book(Long id, String name, int price, int stockQuantity, List<Category> categories, String author, String isbn) {
        super(id, name, price, stockQuantity, categories);
        this.author = author;
        this.isbn = isbn;
    }
}