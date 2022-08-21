package com.sda.travelagency.converter;

import com.sda.travelagency.dto.DestinationDto;
import com.sda.travelagency.entity.Destination;
import org.springframework.stereotype.Component;

@Component
public class DestinationConverter implements Converter<Destination, DestinationDto> {


    @Override
    public DestinationDto fromEntityToDto(Destination entity) {
        return null;
    }

    //TODO
    @Override
    public Destination fromDtoToEntity(DestinationDto dto) {
        return null;
    }
}
