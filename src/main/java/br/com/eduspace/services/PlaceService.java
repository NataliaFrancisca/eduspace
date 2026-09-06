package br.com.eduspace.services;

import br.com.eduspace.dto.place.AuditoriumDTO;
import br.com.eduspace.dto.place.ClassRoomDTO;
import br.com.eduspace.entities.place.auditorium.Auditorium;
import br.com.eduspace.entities.place.auditorium.CreateAuditoriumRequest;
import br.com.eduspace.entities.place.classroom.ClassRoom;
import br.com.eduspace.entities.place.classroom.CreateClassRoomRequest;
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
    private ClassRoomRepository classRommRepository;

    @Autowired
    private LabRepository labRepository;

    public AuditoriumDTO registerAuditorium(CreateAuditoriumRequest auditorium) {
        AuditoriumDTO dto = new AuditoriumDTO(auditorium);

        Auditorium auditoriumEntity = new Auditorium(dto);

        this.auditoriumRepository.save(auditoriumEntity);

        return dto;
    }

    public ClassRoomDTO registerClassRoom(CreateClassRoomRequest classRoom) {
        ClassRoomDTO dto = new ClassRoomDTO(classRoom);

        ClassRoom classRoomEntity = new ClassRoom(dto);

        this.classRommRepository.save(classRoomEntity);

        return dto;
    }
}
