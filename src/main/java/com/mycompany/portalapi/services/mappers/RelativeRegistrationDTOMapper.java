package com.mycompany.portalapi.services.mappers;

import com.mycompany.portalapi.dtos.studentDto.RelativeRegistrationDTO;
import com.mycompany.portalapi.models.hrms.Relative;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class RelativeRegistrationDTOMapper implements Function<Relative, RelativeRegistrationDTO> {
    @Override
    public RelativeRegistrationDTO apply(Relative relative) {
        return RelativeRegistrationDTO
                .builder()
                .name(relative.getName())
                .job(relative.getJob())
                .phoneNumber(relative.getPhoneNumber())
                .jobLocation(relative.getJobLocation())
                .relationship(relative.getRelationship().getRelationName().getValue())
                .build();
    }
}
