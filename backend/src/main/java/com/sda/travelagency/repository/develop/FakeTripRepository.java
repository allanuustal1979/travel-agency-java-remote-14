package com.sda.travelagency.repository.develop;

import com.sda.travelagency.entity.*;
import com.sda.travelagency.entity.enumeration.MealType;
import com.sda.travelagency.entity.enumeration.PaymentType;
import com.sda.travelagency.entity.enumeration.TransportType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

// TripRepository bean will be created only when "Develop" profile is activated
// useful for development purposes
@Profile("Develop")
@Repository
@Slf4j
public class FakeTripRepository implements JpaRepository<Trip, Long> {

    public FakeTripRepository() {
        log.info("fake trip repository bean was created");
    }

    @Override
    public <S extends Trip> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Trip> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Trip> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Trip> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Trip> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Trip getOne(Long aLong) {
        return null;
    }

    @Override
    public Trip getById(Long aLong) {
        return null;
    }

    @Override
    public Trip getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Trip> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Trip> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Trip> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Trip> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Trip> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Trip> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Trip, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
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
                        .destination(new Destination(1L,"UK","London", "Hilton"))
                        .tripPrice(new Price(BigDecimal.valueOf(500L),"EURO"))
                        .typeOfTransport(TransportType.PLANE)
                        .securityRules(new SecurityRules(1L,"",""))
                        .paymentType(PaymentType.PAYPAL)
                        .mealType(MealType.ALL_INCLUSIVE)
                        .hotelFacilities(new HotelFacilities(2L,List.of(),List.of("bathroom","bed")))
                        .photos(List.of("https://www.hilton.com/en/hotels/lonhitw-london-hilton-on-park-lane/"))
                        .build(),
                Trip.builder()
                        .tripStartDate(LocalDate.now().plusDays(1))
                        .tripEndDate(LocalDate.now().plusDays(15))
                        .destination(new Destination(1L,"Thailand", "Bangkok", "Sawasdee Sunshine"))
                        .tripPrice(new Price(BigDecimal.valueOf(1_500L), "baht"))
                        .typeOfTransport(TransportType.PLANE)
                        .securityRules(new SecurityRules(2L,"", ""))
                        .paymentType(PaymentType.CARD)
                        .mealType(MealType.ALL_INCLUSIVE)
                        .hotelFacilities(new HotelFacilities(2L,List.of(), List.of("Bed", "Swiming Pool", "Bathroom", "Parking")))
                        .photos(List.of("https://pix10.agoda.net/hotelImages/6796247/0/33adac49e47c732b38c54faca72b84f9.jpg?ca=22&ce=0&s=1024x768"))
                        .build());
    }

    @Override
    public List<Trip> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Trip> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Trip> findAllById(Iterable<Long> longs) {
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
