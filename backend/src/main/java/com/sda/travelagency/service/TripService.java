package com.sda.travelagency.service;

import com.sda.travelagency.entity.Trip;
import com.sda.travelagency.exception.TripNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@Slf4j
public class TripService {

    public List<Trip> findAllTrips() {
        log.info("finding all trips");

        return Collections.emptyList();
    }

    public Trip findTripById(Long id) {
        log.info("finding trip by id: [{}]", id);

        if (id != null) {
            throw new TripNotFoundException("No trip with id: " + id);
        }

        return null;
    }

}
