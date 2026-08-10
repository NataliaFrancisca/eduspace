package br.com.eduspace.dto.place;

import br.com.eduspace.entities.place.lab.Lab;

import java.util.List;

public record LabDTO(
        String id, int capacity, boolean isAccessible, List<String> softwares, String OS
) {

    public LabDTO(Lab lab){
        this(
                lab.getId(),
                lab.getCapacity(),
                lab.isAccessible(),
                lab.getSoftwares(),
                lab.getOS());
    }
}
