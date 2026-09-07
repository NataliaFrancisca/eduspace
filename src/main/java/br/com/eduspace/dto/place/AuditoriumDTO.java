package br.com.eduspace.dto.place;

import br.com.eduspace.entities.place.auditorium.Auditorium;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record AuditoriumDTO(
        String id, int capacity, boolean isAccessible, int microphones, String sponsorName
) {
    public AuditoriumDTO(Auditorium auditorium){
        this(
                auditorium.getId(),
                auditorium.getCapacity(),
                auditorium.isAccessible(),
                auditorium.getMicrophonesAvailable(),
                auditorium.getSponsorName());
    }
}
