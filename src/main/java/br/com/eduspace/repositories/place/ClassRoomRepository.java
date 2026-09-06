package br.com.eduspace.repositories.place;

import br.com.eduspace.entities.place.classroom.ClassRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRoomRepository extends JpaRepository<ClassRoom, String> {
}
