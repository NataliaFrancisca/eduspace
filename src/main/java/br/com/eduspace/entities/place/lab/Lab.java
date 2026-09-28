package br.com.eduspace.entities.place.lab;

import br.com.eduspace.entities.place.Place;
import jakarta.persistence.Entity;
import java.util.List;

@Entity
public class Lab extends Place {
    private List<String> softwares;
    private String OS;

    public Lab(){}

    public Lab(String placeCode, int capacity, boolean isAccessible, String sponsorName, List<String> softwares, String OS) {
        super(placeCode, capacity, isAccessible, sponsorName);
        this.softwares = softwares;
        this.OS = OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }
    public void setSoftwares(List<String> softwares) {
        this.softwares = softwares;
    }

    public List<String> getSoftwares() {
        return softwares;
    }
    public String getOS() {
        return OS;
    }
}
