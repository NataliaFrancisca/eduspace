package br.com.eduspace.dto.error;

public record ErrorResponse(
        int status,
        String message
) {
}
