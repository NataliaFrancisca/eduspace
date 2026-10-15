package br.com.eduspace.exceptions;

public class PlaceAlreadyExistsException extends RuntimeException {
    public PlaceAlreadyExistsException(String placeCode) {
        super("Place with code " + placeCode + " already exists");
    }
}
