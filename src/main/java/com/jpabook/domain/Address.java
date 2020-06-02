package com.jpabook.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Address {
    @Column(length = 10)
    private String city;

    @Column(length = 20)
    private String street;

    @Column(length = 6)
    private String zipCode;
}