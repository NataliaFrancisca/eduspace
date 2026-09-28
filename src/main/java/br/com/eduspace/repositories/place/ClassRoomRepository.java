package br.com.eduspace.repositories.place;

import br.com.eduspace.entities.place.classroom.ClassRoom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClassRoomRepository extends JpaRepository<ClassRoom, UUID> {
}
