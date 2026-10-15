package br.com.eduspace.entities.place.lab;

import br.com.eduspace.entities.place.PlaceRecord;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

import java.util.List;

public record CreateLabRequest(
        @NotNull(message = "place information is required.")
        @Valid
        PlaceRecord place,

        @NotEmpty(message = "the list of installed softwares must not be empty.")
        List<String> softwares,

        @NotBlank(message = " the operating system is required.")
        String OS
) {
}
