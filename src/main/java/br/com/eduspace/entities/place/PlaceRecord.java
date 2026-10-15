package br.com.eduspace.entities.place;

import jakarta.validation.constraints.*;

public record PlaceRecord(
        @NotBlank
        @Pattern(
                regexp = "\\d{3}[A-Z]",
                message = "placeCode must contain 3 digits followed by a block letter"
        )
        String placeCode,

        @NotNull
        @Min(value = 10, message = "capacity must be equal or bigger than 10.")
        int capacity,

        boolean isAccessible,

        @Pattern(
                regexp = ".*\\S.*",
                message = "sponsor's name is required"
        )
        String sponsorName
) {
}
