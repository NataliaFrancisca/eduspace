package br.com.eduspace.entities.place.lab;

import br.com.eduspace.entities.place.Place;
import jakarta.persistence.Entity;
import java.util.List;

@Entity
public class Lab extends Place {
    private List<String> softwares;
    private String OS;

    public Lab(){}

    public Lab(String id, int capacity, boolean isAccessible, String OS, List<String> softwares) {
        super(id, capacity, isAccessible);
        this.OS = OS;
        this.softwares = softwares;
    }

    public Lab(String id, int capacity, boolean isAccessible, String sponsorName, String OS, List<String> softwares) {
        super(id, capacity, isAccessible, sponsorName);
        this.OS = OS;
        this.softwares = softwares;
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
