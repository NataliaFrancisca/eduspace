package br.com.eduspace.controller;

import br.com.eduspace.dto.place.AuditoriumDTO;
import br.com.eduspace.dto.place.ClassRoomDTO;
import br.com.eduspace.dto.place.LabDTO;
import br.com.eduspace.entities.place.auditorium.CreateAuditoriumRequest;
import br.com.eduspace.entities.place.classroom.CreateClassRoomRequest;
import br.com.eduspace.entities.place.lab.CreateLabRequest;
import br.com.eduspace.services.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/place")
public class PlaceController {

    @Autowired
    private PlaceService service;

    @PostMapping("/auditorium")
    public ResponseEntity<AuditoriumDTO> save(@RequestBody CreateAuditoriumRequest place){
        var auditorium =  this.service.registerAuditorium(place);
        return ResponseEntity.ok(auditorium);
    }

    @PostMapping("/classroom")
    public ResponseEntity<ClassRoomDTO> save(@RequestBody CreateClassRoomRequest place){
        var classroom = this.service.registerClassRoom(place);
        return ResponseEntity.ok(classroom);
    }

    @PostMapping("/lab")
    public ResponseEntity<LabDTO> save(@RequestBody CreateLabRequest place){
        var lab = this.service.registerLab(place);
        return ResponseEntity.ok(lab);
    }
}
