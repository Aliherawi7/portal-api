package com.mycompany.portalapi.dtos;

import jakarta.persistence.Column;
import lombok.Builder;
import org.hibernate.Length;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

@Builder
public record PostResponseDTO(
        Long id,
        String message,
        String department,
        String fieldOfStudy,
        ZonedDateTime dateTime,
        AuthorDTO author,
        List<String> images,
        List<String> docs

) {
}
