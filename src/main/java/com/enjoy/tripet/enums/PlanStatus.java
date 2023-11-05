package com.enjoy.tripet.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PlanStatus {
    READY("READY"), ONGOING("ONGOING"), COMPLETE("COMPLETE");

    @JsonValue
    private final String status;
}
