package br.com.eduspace.repositories.place;

import br.com.eduspace.entities.place.lab.Lab;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LabRepository extends JpaRepository<Lab, UUID> {
}
