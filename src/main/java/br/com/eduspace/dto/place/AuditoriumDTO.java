package br.com.eduspace.dto.place;

import br.com.eduspace.entities.place.auditorium.CreateAuditoriumRequest;

public record AuditoriumDTO(
        String id, int capacity, boolean isAccessible, int microphones
) {
    public AuditoriumDTO(CreateAuditoriumRequest auditorium){
        this(
                auditorium.place().id(),
                auditorium.place().capacity(),
                auditorium.place().isAccessible(),
                auditorium.microphonesAvailable());
    }
}
