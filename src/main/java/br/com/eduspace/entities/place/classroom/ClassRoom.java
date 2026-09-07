package br.com.eduspace.entities.place.classroom;

import br.com.eduspace.entities.place.Place;
import jakarta.persistence.Entity;

@Entity
public class ClassRoom extends Place {
    private boolean isEquippedHybridClasses;

    public ClassRoom(){}

    public ClassRoom(String id, int capacity, boolean isAccessible, boolean isEquippedHybridClasses) {
        super(id, capacity, isAccessible);
        this.isEquippedHybridClasses = isEquippedHybridClasses;
    }

    public ClassRoom(String id, int capacity, boolean isAccessible, boolean isEquippedHybridClasses, String sponsorName) {
        super(id, capacity, isAccessible, sponsorName);
        this.isEquippedHybridClasses = isEquippedHybridClasses;
    }

    public boolean isEquippedHybridClasses() {
        return isEquippedHybridClasses;
    }

    public void setEquippedHybridClasses(boolean equippedHybridClasses) {
        isEquippedHybridClasses = equippedHybridClasses;
    }
}
