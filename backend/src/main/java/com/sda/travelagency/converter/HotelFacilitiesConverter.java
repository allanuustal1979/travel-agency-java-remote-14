package com.sda.travelagency.converter;

import com.sda.travelagency.dto.HotelFacilitiesDto;
import com.sda.travelagency.entity.HotelFacilities;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class HotelFacilitiesConverter implements Converter<HotelFacilities, HotelFacilitiesDto> {

    private final AttractionConverter attractionConverter;

    public HotelFacilitiesConverter(AttractionConverter attractionConverter) {
        this.attractionConverter = attractionConverter;
    }

    // till Java 8 implementation
//    @Override
//    public HotelFacilitiesDto fromEntityToDto(HotelFacilities entity) {
//        List<AttractionDto> attractionDtos = new ArrayList<>();
//        for (Attraction attraction: entity.getAttractions()) {
//            AttractionDto attractionDto = attractionConverter.fromEntityToDto(attraction);
//            attractionDtos.add(attractionDto);
//        }
//
//        return new HotelFacilitiesDto(attractionDtos, entity.getApartmentFacilities());
//    }

    // since Java 8 style - more preferred
    @Override
    public HotelFacilitiesDto fromEntityToDto(HotelFacilities entity) {
        var attractionsDtos = entity.getAttractions()
                .stream()
//                .map(attraction -> attractionConverter.fromEntityToDto(attraction))
                .map(attractionConverter::fromEntityToDto)
                .collect(Collectors.toList()); // toList() was added at Java 16th
//                .toList();

        return new HotelFacilitiesDto(entity.getId(), attractionsDtos, entity.getApartmentFacilities());
    }

    @Override
    public HotelFacilities fromDtoToEntity(HotelFacilitiesDto dto) {

        var entities = dto.attractions()
                .stream()
                .map(attractionDto -> attractionConverter.fromDtoToEntity(attractionDto))
                .toList();
        return new HotelFacilities(dto.id(), entities, dto.apartmentFacilities());
    }
}