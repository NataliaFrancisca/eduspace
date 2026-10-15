package br.com.eduspace.configuration;

import br.com.eduspace.dto.error.ErrorResponse;
import br.com.eduspace.exceptions.PlaceAlreadyExistsException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(PlaceAlreadyExistsException.class)
    public ResponseEntity<ErrorResponse> handlePlaceAlreadyExists(
            PlaceAlreadyExistsException ex) {

        var response = new ErrorResponse(
                HttpStatus.CONFLICT.value(),
                ex.getMessage()
        );

        return ResponseEntity
                .status(HttpStatus.CONFLICT)
                .body(response);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handleValidation(MethodArgumentNotValidException ex) {
        String message = ex.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(error -> error.getDefaultMessage())
                .findFirst()
                .orElse("Invalid request.");
        var response = new ErrorResponse(
                HttpStatus.BAD_REQUEST.value(),
                message
        );
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(response);
    }
}
