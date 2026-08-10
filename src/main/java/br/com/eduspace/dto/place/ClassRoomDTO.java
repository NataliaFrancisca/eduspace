package br.com.eduspace.dto.place;

import br.com.eduspace.entities.place.classroom.CreateClassRoomRequest;

public record ClassRoomDTO(
        String id, int capacity, boolean isAccessible, boolean isEquippedHybridClasses
) {
    public ClassRoomDTO(CreateClassRoomRequest classRoomRecord){
        this(
                classRoomRecord.place().id(),
                classRoomRecord.place().capacity(),
                classRoomRecord.place().isAccessible(),
                classRoomRecord.isEquippedHybridClasses()
        );
    }
}
