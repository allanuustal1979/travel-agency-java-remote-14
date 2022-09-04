package com.sda.travelagency.repository;

import com.sda.travelagency.entity.*;
import com.sda.travelagency.entity.enumeration.MealType;
import com.sda.travelagency.entity.enumeration.PaymentType;
import com.sda.travelagency.entity.enumeration.TransportType;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

// TripRepository bean will be created only when "Develop" profile is activated
// useful for development purposes
@Profile("Develop")
@Repository
public class TripRepository implements CrudRepository<Trip, Long> {
    @Override
    public <S extends Trip> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Trip> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Trip> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Trip> findAll() {
        return List.of(
                Trip.builder()
                        .tripStartDate(LocalDate.now().plusDays(1))
                        .tripEndDate(LocalDate.now().plusDays(15))
                        .destination(new Destination("UK","London", "Hilton"))
                        .tripPrice(new Price(BigDecimal.valueOf(500L),"EURO"))
                        .typeOfTransport(TransportType.PLANE)
                        .securityRules(new SecurityRules("",""))
                        .paymentType(PaymentType.PAYPAL)
                        .mealType(MealType.ALL_INCLUSIVE)
                        .hotelFacilities(new HotelFacilities(List.of(),List.of("bathroom","bed")))
                        .photos(List.of("https://www.hilton.com/en/hotels/lonhitw-london-hilton-on-park-lane/"))
                        .build(),
                Trip.builder()
                        .tripStartDate(LocalDate.now().plusDays(1))
                        .tripEndDate(LocalDate.now().plusDays(15))
                        .destination(new Destination("Thailand", "Bangkok", "Sawasdee Sunshine"))
                        .tripPrice(new Price(BigDecimal.valueOf(1_500L), "baht"))
                        .typeOfTransport(TransportType.PLANE)
                        .securityRules(new SecurityRules("", ""))
                        .paymentType(PaymentType.CARD)
                        .mealType(MealType.ALL_INCLUSIVE)
                        .hotelFacilities(new HotelFacilities(List.of(), List.of("Bed", "Swiming Pool", "Bathroom", "Parking")))
                        .photos(List.of("https://pix10.agoda.net/hotelImages/6796247/0/33adac49e47c732b38c54faca72b84f9.jpg?ca=22&ce=0&s=1024x768"))
                        .build());
    }

    @Override
    public Iterable<Trip> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Trip entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Trip> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
