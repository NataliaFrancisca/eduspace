package br.com.eduspace.services;

import br.com.eduspace.dto.place.LabDTO;
import br.com.eduspace.entities.place.lab.CreateLabRequest;
import br.com.eduspace.entities.place.lab.Lab;
import br.com.eduspace.repositories.place.LabRepository;
import org.springframework.stereotype.Service;

@Service
public class LabService {
    private LabRepository labRepository;

    public LabService(LabRepository labRepository) {
        this.labRepository = labRepository;
    }

    public LabDTO registerLab(CreateLabRequest lab) {
        Lab labEntity = new Lab(lab);

        Lab savedLab = labRepository.save(labEntity);

        return new LabDTO(savedLab);
    }
}
