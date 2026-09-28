package br.com.eduspace.services;

import br.com.eduspace.dto.place.AuditoriumDTO;
import br.com.eduspace.dto.place.ClassRoomDTO;
import br.com.eduspace.dto.place.LabDTO;
import br.com.eduspace.entities.place.PlaceMapper;
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

    public AuditoriumDTO registerAuditorium(CreateAuditoriumRequest request) {
        Auditorium auditoriumEntity = new PlaceMapper().toEntity(request);
        var data = this.auditoriumRepository.save(auditoriumEntity);
        return new AuditoriumDTO(data);
    }

    public ClassRoomDTO registerClassRoom(CreateClassRoomRequest request) {
        ClassRoom classRoomEntity = new PlaceMapper().toEntity(request);
        var data = this.classRoomRepository.save(classRoomEntity);
        return new ClassRoomDTO(data);
    }

    public LabDTO registerLab(CreateLabRequest request) {
        Lab labEntity = new PlaceMapper().toEntity(request);
        var data = this.labRepository.save(labEntity);
        return new LabDTO(data);
    }
}
