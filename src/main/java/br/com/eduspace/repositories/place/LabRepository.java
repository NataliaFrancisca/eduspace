package br.com.eduspace.repositories.place;

import br.com.eduspace.entities.place.lab.Lab;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LabRepository extends JpaRepository<Lab, String> {
}
