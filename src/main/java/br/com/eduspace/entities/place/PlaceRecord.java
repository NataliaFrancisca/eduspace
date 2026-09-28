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
        @Min(10)
        int capacity,

        boolean isAccessible,

        String sponsorName
) {
}
