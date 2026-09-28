package br.com.eduspace.dto.place;

import br.com.eduspace.entities.place.lab.Lab;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record LabDTO(
        String id, int capacity, boolean isAccessible, String sponsorName, List<String> softwares, String OS
) {

    public LabDTO(Lab lab){
        this(
                lab.getPlaceCode(),
                lab.getCapacity(),
                lab.isAccessible(),
                lab.getSponsorName(),
                lab.getSoftwares(),
                lab.getOS());
    }
}
