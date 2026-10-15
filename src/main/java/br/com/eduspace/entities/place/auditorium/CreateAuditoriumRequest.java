package br.com.eduspace.entities.place.auditorium;

import br.com.eduspace.entities.place.PlaceRecord;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

public record CreateAuditoriumRequest(
        @NotNull(message = "place information is required.")
        @Valid
        PlaceRecord place,

        @Min(value = 1, message = "The number of microphones must be positive")
        int microphonesAvailable
) {
}
