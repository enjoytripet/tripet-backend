package com.enjoy.tripet.domain;

import com.enjoy.tripet.enums.ContactCategory;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private ContactCategory category;
    private String title;
    private String content;

    @Builder
    private Contact(ContactCategory category, String title, String content) {
        this.category = category;
        this.title = title;
        this.content = content;
    }
}
