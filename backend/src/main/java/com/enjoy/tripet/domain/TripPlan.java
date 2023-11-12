package com.enjoy.tripet.domain;

import com.enjoy.tripet.enums.PlanStatus;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TripPlan extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;

    @Enumerated(EnumType.STRING)
    private PlanStatus status;
    private LocalDate tripStartDate;
    private LocalDate tripEndDate;

    @Builder
    private TripPlan(String title, String description, PlanStatus status, LocalDate tripStartDate, LocalDate tripEndDate) {
        this.title = title;
        this.description = description;
        this.status = status;
        this.tripStartDate = tripStartDate;
        this.tripEndDate = tripEndDate;
    }
}
