package com.mycompany.portalapi.dtos;

import lombok.Builder;

@Builder
public record StudentShortInfo(
        Long id,
        String name,
        String lastname,
        String fieldStudy,
        String department,
        String imageUrl
) {
}
