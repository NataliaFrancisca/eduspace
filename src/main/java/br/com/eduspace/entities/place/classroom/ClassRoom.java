package br.com.eduspace.entities.place.classroom;

import br.com.eduspace.entities.place.Place;
import jakarta.persistence.Entity;

@Entity(name = "classroom")
public class ClassRoom extends Place {
    private boolean isEquippedHybridClasses;

    public ClassRoom(){}

    public ClassRoom(String placeCode, int capacity, boolean isAccessible, String sponsorName, boolean isEquippedHybridClasses) {
        super(placeCode, capacity, isAccessible, sponsorName);
        this.isEquippedHybridClasses = isEquippedHybridClasses;
    }

    public boolean isEquippedHybridClasses() {
        return isEquippedHybridClasses;
    }

    public void setEquippedHybridClasses(boolean equippedHybridClasses) {
        isEquippedHybridClasses = equippedHybridClasses;
    }
}
