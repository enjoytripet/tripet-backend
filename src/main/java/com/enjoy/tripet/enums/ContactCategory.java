package com.enjoy.tripet.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ContactCategory {
    PLACE_REQUEST("PLACE_REQUEST"), PLACE_MODIFY("PLACE_MODIFY"), SERVICE("SERVICE"), QNA("QNA"), ETC("ETC");

    @JsonValue
    private final String type;
}
