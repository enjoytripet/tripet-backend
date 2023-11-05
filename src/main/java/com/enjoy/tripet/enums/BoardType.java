package com.enjoy.tripet.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BoardType {
    NOTICE("NOTICE"), FREE("FREE"), PETNEWS("PETNEWS");

    @JsonValue
    private final String type;
}
