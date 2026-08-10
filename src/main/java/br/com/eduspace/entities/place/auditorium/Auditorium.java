package br.com.eduspace.entities.place.auditorium;

import br.com.eduspace.dto.place.AuditoriumDTO;
import br.com.eduspace.entities.place.Place;
import jakarta.persistence.Entity;

@Entity
public class Auditorium extends Place {
    private int microphonesAvailable;

    public Auditorium(){}

    public Auditorium(AuditoriumDTO auditoriumDTO){
        super(auditoriumDTO.id(), auditoriumDTO.capacity(), auditoriumDTO.isAccessible());
        this.microphonesAvailable = auditoriumDTO.microphones();
    }

    public Auditorium(String id, int capacity, boolean isAccessible, int microphones) {
        super(id, capacity, isAccessible);
        this.microphonesAvailable = microphones;
    }

    public void setMicrophonesAvailable(int microphonesAvailable) {
        this.microphonesAvailable = microphonesAvailable;
    }

    public int getMicrophonesAvailable() {
        return microphonesAvailable;
    }
}
