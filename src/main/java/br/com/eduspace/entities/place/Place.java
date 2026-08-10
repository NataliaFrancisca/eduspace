package br.com.eduspace.entities.place;

import jakarta.persistence.*;

@Entity(name = "place")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Place {
    @Id
    private String id;

    private int capacity;
    private boolean isAccessible;
    private boolean isAvailable;

    private String sponsorName;

    public Place(){}

    public Place(String id, int capacity, boolean isAccessible) {
        this.id = id;
        this.capacity = capacity;
        this.isAccessible = isAccessible;
        this.isAvailable = true;
    }

    public String getId() {return id;}
    public int getCapacity() {return capacity;}
    public boolean isAccessible() {return isAccessible;}
    public boolean isAvailable() {return isAvailable;}
    public String getSponsorName() {return sponsorName;}

    public void setId(String id) {
        this.id = id;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setAccessible(boolean accessible) {
        isAccessible = accessible;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName;
    }
}
