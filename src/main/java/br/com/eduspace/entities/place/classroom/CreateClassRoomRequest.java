package br.com.eduspace.entities.place.classroom;

import br.com.eduspace.entities.place.PlaceRecord;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record CreateClassRoomRequest(
        @NotNull(message = "place information is required.")
        @Valid
        PlaceRecord place,

        @NotNull(message = "you must specify whether the classroom is equipped for hybrid classes.")
        Boolean isEquippedHybridClasses
) {
}
