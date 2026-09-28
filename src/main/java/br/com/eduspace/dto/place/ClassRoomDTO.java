package br.com.eduspace.dto.place;

import br.com.eduspace.entities.place.classroom.ClassRoom;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record ClassRoomDTO(
        String id, int capacity, boolean isAccessible, boolean isEquippedHybridClasses, String sponsorName
) {
    public ClassRoomDTO(ClassRoom classRoom){
        this(
                classRoom.getPlaceCode(),
                classRoom.getCapacity(),
                classRoom.isAccessible(),
                classRoom.isEquippedHybridClasses(),
                classRoom.getSponsorName()
        );
    }
}
