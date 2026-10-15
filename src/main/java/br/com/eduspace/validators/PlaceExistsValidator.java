package br.com.eduspace.validators;

import br.com.eduspace.entities.place.Place;
import br.com.eduspace.exceptions.PlaceAlreadyExistsException;
import br.com.eduspace.repositories.place.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlaceExistsValidator {

    @Autowired
    private PlaceRepository placeRepository;

    public void validate(Place place){
        var placeExists = placeRepository.existsByPlaceCode(place.getPlaceCode());

        if (placeExists){
            throw new PlaceAlreadyExistsException(place.getPlaceCode());
        }
    }
}
