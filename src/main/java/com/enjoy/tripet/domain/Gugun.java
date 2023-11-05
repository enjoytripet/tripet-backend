package com.enjoy.tripet.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Gugun {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String gugunCode;
    private String gugunName;

    @Builder
    private Gugun(String gugunCode, String gugunName) {
        this.gugunCode = gugunCode;
        this.gugunName = gugunName;
    }
}
