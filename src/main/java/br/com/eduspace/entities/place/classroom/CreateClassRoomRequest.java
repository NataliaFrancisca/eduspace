package br.com.eduspace.entities.place.classroom;

import br.com.eduspace.entities.place.PlaceRecord;

public record CreateClassRoomRequest(
        PlaceRecord place,
        boolean isEquippedHybridClasses
) {
}
