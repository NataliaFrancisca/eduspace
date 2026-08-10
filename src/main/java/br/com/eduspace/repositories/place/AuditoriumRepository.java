package br.com.eduspace.repositories.place;

import br.com.eduspace.entities.place.auditorium.Auditorium;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditoriumRepository extends JpaRepository<Auditorium, String> {
}
