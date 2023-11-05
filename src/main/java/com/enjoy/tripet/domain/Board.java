package com.enjoy.tripet.domain;

import com.enjoy.tripet.enums.BoardType;
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
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BoardType type;
    private String title;
    private String content;

    @Builder
    private Board(BoardType type, String title, String content) {
        this.type = type;
        this.title = title;
        this.content = content;
    }
}
