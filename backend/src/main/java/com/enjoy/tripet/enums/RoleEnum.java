package com.enjoy.tripet.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RoleEnum {
    USER("USER"), ADMIN("ADMIN");

    @JsonValue
    private final String role;
}
