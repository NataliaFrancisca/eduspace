package br.com.eduspace.entities.place.classroom;

import br.com.eduspace.dto.place.ClassRoomDTO;
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

    public ClassRoom(ClassRoomDTO dto){
        super(dto.id(), dto.capacity(), dto.isAccessible());
        this.isEquippedHybridClasses = dto.isEquippedHybridClasses();
    }

    public void setEquippedHybridClasses(boolean equippedHybridClasses) {
        isEquippedHybridClasses = equippedHybridClasses;
    }
}
