package br.com.eduspace.entities.place;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "places")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, unique = true)
    private String placeCode;

    @Column(nullable = false)
    private Integer capacity;
    @Column(nullable = false)
    private boolean isAccessible;
    @Column(nullable = false)
    private boolean active;

    private String sponsorName;

    public Place(){}

    public Place(String placeCode, int capacity, boolean isAccessible, String sponsorName) {
        this.placeCode = placeCode;
        this.capacity = capacity;
        this.isAccessible = isAccessible;
        this.active = true;
        this.sponsorName = sponsorName;
    }

    public String getPlaceCode() {return placeCode;}
    public int getCapacity() {return capacity;}
    public boolean isAccessible() {return isAccessible;}
    public boolean isActive() {return active;}
    public String getSponsorName() {return sponsorName;}

    public void setPlaceCode(String placeCode) {this.placeCode = placeCode;}

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setAccessible(boolean accessible) {
        isAccessible = accessible;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName;
    }
}
