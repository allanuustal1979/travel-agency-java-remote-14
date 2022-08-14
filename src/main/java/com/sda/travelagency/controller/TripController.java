package com.sda.travelagency.controller;

import com.sda.travelagency.converter.TripConverter;
import com.sda.travelagency.dto.TripDto;
import com.sda.travelagency.service.TripService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/trips")
public class TripController {

    private final TripService tripService;

    private final TripConverter tripConverter;

    public TripController(TripService tripService, TripConverter tripConverter) {
        this.tripService = tripService;
        this.tripConverter = tripConverter;
    }

    @GetMapping
    public List<TripDto> getAllTrips(){

        log.info("getting all trips");

        var entities = tripService.findAllTrips();
        return entities.stream()
                .map(trip -> tripConverter.fromEntityToDto(trip))
                .toList();
    }
    @GetMapping("/{id}")
    public TripDto getTripById(@PathVariable("id") Long id){
        log.info("get trip by id: [{}]", id);

        var entity = tripService.findTripById(id);
        return tripConverter.fromEntityToDto(entity);
    }
}
