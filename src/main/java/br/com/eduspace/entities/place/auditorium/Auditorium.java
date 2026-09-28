package br.com.eduspace.entities.place.auditorium;

import br.com.eduspace.entities.place.Place;
import jakarta.persistence.Entity;


@Entity
public class Auditorium extends Place {
    private int microphonesAvailable;

    public Auditorium(){}

    public Auditorium(String placeCode, int capacity, boolean isAccessible, String sponsorName, int microphonesAvailable) {
        super(placeCode, capacity, isAccessible, sponsorName);
        this.microphonesAvailable = microphonesAvailable;
    }

    public void setMicrophonesAvailable(int microphonesAvailable) {
        this.microphonesAvailable = microphonesAvailable;
    }

    public int getMicrophonesAvailable() {
        return microphonesAvailable;
    }
}
