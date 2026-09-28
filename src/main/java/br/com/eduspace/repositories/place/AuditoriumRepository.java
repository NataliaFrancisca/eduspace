package br.com.eduspace.repositories.place;

import br.com.eduspace.entities.place.auditorium.Auditorium;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AuditoriumRepository extends JpaRepository<Auditorium, UUID> {
}
