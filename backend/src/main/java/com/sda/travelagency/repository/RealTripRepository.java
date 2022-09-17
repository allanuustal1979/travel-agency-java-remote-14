package com.sda.travelagency.repository;

import org.springframework.context.annotation.Profile;

@Profile("!develop")
public interface RealTripRepository extends TripRepository {
}