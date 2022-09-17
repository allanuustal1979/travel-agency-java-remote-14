package com.sda.travelagency.repository;

import com.sda.travelagency.entity.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface TripRepository extends JpaRepository<Trip, Long> {
    /**
     *     LocalDate tripStartDate;
     *
     *     LocalDate tripEndDate;
     *
     *     @OneToOne
     *     Destination destination;
     *
     *     @Embedded
     *     Price tripPrice;
     *
     *     @Enumerated(EnumType.STRING)
     *     TransportType typeOfTransport;
     *
     *     @OneToOne
     *     SecurityRules securityRules;
     *
     *     @Enumerated(EnumType.STRING)
     *     PaymentType paymentType;
     *
     *     @Enumerated(EnumType.STRING)
     *     MealType mealType;
     *
     *     @OneToOne
     *     HotelFacilities hotelFacilities;
     * @return
     */
    // TODO: finish
    default boolean isDuplicateOfOther(Trip trip) {
        return false;
    }
}