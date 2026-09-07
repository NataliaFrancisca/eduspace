package br.com.eduspace.entities.place.classroom;

import br.com.eduspace.entities.place.PlaceRecord;
import jakarta.validation.constraints.NotNull;

public record CreateClassRoomRequest(
        @NotNull
        PlaceRecord place,

        boolean isEquippedHybridClasses
) {
}
