package br.com.eduspace.entities.place.lab;

import br.com.eduspace.entities.place.PlaceRecord;
import jakarta.validation.constraints.*;

import java.util.List;

public record CreateLabRequest(
        @NotNull
        PlaceRecord place,

        @NotEmpty
        List<String> softwares,

        @NotBlank
        String OS
) {
}
