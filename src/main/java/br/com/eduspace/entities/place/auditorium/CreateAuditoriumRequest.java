package br.com.eduspace.entities.place.auditorium;

import br.com.eduspace.entities.place.PlaceRecord;
import jakarta.validation.constraints.*;

public record CreateAuditoriumRequest(
        @NotNull
        PlaceRecord place,

        @Min(1)
        int microphonesAvailable
) {
}
