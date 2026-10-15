package br.com.eduspace.repositories.place;

import br.com.eduspace.entities.place.Place;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PlaceRepository extends JpaRepository<Place, UUID> {
    boolean existsByPlaceCode(String placeCode);
}
