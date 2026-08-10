package br.com.eduspace.entities.place;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record PlaceRecord(
        @NotBlank
        String id,
        @Min(20)
        int capacity,
        boolean isAccessible,

        String sponsorName
) {
}
