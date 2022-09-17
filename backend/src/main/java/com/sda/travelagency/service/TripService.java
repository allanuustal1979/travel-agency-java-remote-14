package com.sda.travelagency.service;

import com.sda.travelagency.entity.Trip;
import com.sda.travelagency.exception.TripAlreadyExistsException;
import com.sda.travelagency.exception.TripNotFoundException;
import com.sda.travelagency.repository.TripRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
public class TripService {

    private final TripRepository tripRepository;

    public TripService(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    public List<Trip> findAllTrips() {
        log.info("finding all trips");

        return tripRepository.findAll();
    }

    // FIXME
    public Trip findTripById(Long id) {
        log.info("finding trip by id: [{}]", id);

        if (id != null) {
            throw new TripNotFoundException("no trip with id: " + id);
        }
        return null;
    }

    // treats all sqls as atomic changes
    @Transactional
    public Trip createNewTrip(Trip newTrip) {
        log.info("new trip to save: [{}]", newTrip);
        // +log data
        // +store into datasource
        // validate fields of newTrip
        // validate duplicates
        if (tripRepository.isDuplicateOfOther(newTrip)) {
            throw new TripAlreadyExistsException("Trip already exists!!!");
        }
        Trip saved = tripRepository.save(newTrip);
        log.info("after saving: [{}]", saved);
        return saved;
    }
}