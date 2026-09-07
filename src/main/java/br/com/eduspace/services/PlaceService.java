package br.com.eduspace.services;

import br.com.eduspace.dto.place.AuditoriumDTO;
import br.com.eduspace.dto.place.ClassRoomDTO;
import br.com.eduspace.dto.place.LabDTO;
import br.com.eduspace.entities.place.auditorium.Auditorium;
import br.com.eduspace.entities.place.auditorium.CreateAuditoriumRequest;
import br.com.eduspace.entities.place.classroom.ClassRoom;
import br.com.eduspace.entities.place.classroom.CreateClassRoomRequest;
import br.com.eduspace.entities.place.lab.CreateLabRequest;
import br.com.eduspace.entities.place.lab.Lab;
import br.com.eduspace.repositories.place.AuditoriumRepository;
import br.com.eduspace.repositories.place.ClassRoomRepository;
import br.com.eduspace.repositories.place.LabRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlaceService {

    @Autowired
    private AuditoriumRepository auditoriumRepository;

    @Autowired
    private ClassRoomRepository classRoomRepository;

    @Autowired
    private LabRepository labRepository;

    public AuditoriumDTO registerAuditorium(CreateAuditoriumRequest placeRequest) {
        Auditorium auditoriumEntity = new Auditorium(
                placeRequest.place().id(),
                placeRequest.place().capacity(),
                placeRequest.place().isAccessible(),
                placeRequest.microphonesAvailable(),
                placeRequest.place().sponsorName()
        );

        var data = this.auditoriumRepository.save(auditoriumEntity);
        return new AuditoriumDTO(data);
    }

    public ClassRoomDTO registerClassRoom(CreateClassRoomRequest placeRequest) {
        ClassRoom classRoomEntity = new ClassRoom(
                placeRequest.place().id(),
                placeRequest.place().capacity(),
                placeRequest.place().isAccessible(),
                placeRequest.isEquippedHybridClasses(),
                placeRequest.place().sponsorName()
        );

        var data = this.classRoomRepository.save(classRoomEntity);
        return new ClassRoomDTO(data);
    }

    public LabDTO registerLab(CreateLabRequest labRequest) {
        Lab labEntity = new Lab(
                labRequest.place().id(),
                labRequest.place().capacity(),
                labRequest.place().isAccessible(),
                labRequest.place().sponsorName(),
                labRequest.OS(),
                labRequest.softwares()
        );

        var data = this.labRepository.save(labEntity);
        return new LabDTO(data);
    }
}
