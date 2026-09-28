package br.com.eduspace.entities.place;

import br.com.eduspace.entities.place.auditorium.Auditorium;
import br.com.eduspace.entities.place.auditorium.CreateAuditoriumRequest;
import br.com.eduspace.entities.place.classroom.ClassRoom;
import br.com.eduspace.entities.place.classroom.CreateClassRoomRequest;
import br.com.eduspace.entities.place.lab.CreateLabRequest;
import br.com.eduspace.entities.place.lab.Lab;
import org.springframework.stereotype.Component;

@Component
public class PlaceMapper {

    public Auditorium toEntity(CreateAuditoriumRequest request){
        return new Auditorium(
                request.place().placeCode(),
                request.place().capacity(),
                request.place().isAccessible(),
                request.place().sponsorName(),
                request.microphonesAvailable()
        );
    }

    public Lab toEntity(CreateLabRequest request){
        return new Lab(
                request.place().placeCode(),
                request.place().capacity(),
                request.place().isAccessible(),
                request.place().sponsorName(),
                request.softwares(),
                request.OS()
        );
    }

    public ClassRoom toEntity(CreateClassRoomRequest request){
        return new ClassRoom(
                request.place().placeCode(),
                request.place().capacity(),
                request.place().isAccessible(),
                request.place().sponsorName(),
                request.isEquippedHybridClasses()
        );
    }

}
