package com.sda.travelagency.repository;

import com.sda.travelagency.entity.Trip;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Base64;

@Profile("!Develop"
)

public interface RealTripRepository extends JpaRepository<Trip, Long> {
}
