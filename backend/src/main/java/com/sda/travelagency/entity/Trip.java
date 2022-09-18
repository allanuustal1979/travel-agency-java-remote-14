package com.sda.travelagency.entity;

import com.sda.travelagency.entity.enumeration.MealType;
import com.sda.travelagency.entity.enumeration.PaymentType;
import com.sda.travelagency.entity.enumeration.TransportType;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Entity
@Table(name = "TRIPS")
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long Id;

    LocalDate tripStartDate;

    LocalDate tripEndDate;

    // dirty fix - just ignore that field
    @OneToOne(cascade = CascadeType.ALL)
    Destination destination;

    @Embedded
    Price tripPrice;

    @Enumerated(EnumType.STRING)
    TransportType typeOfTransport;

    @OneToOne(cascade = CascadeType.ALL)
    SecurityRules securityRules;

    @Enumerated(EnumType.STRING)
    PaymentType paymentType;

    @Enumerated(EnumType.STRING)
    MealType mealType;

    @OneToOne(cascade = CascadeType.ALL)
    HotelFacilities hotelFacilities;

    @ElementCollection
    @CollectionTable(name = "PHOTOS", joinColumns = @JoinColumn(name = "ID_OF_TRIP"))
    @Column(name = "photo")
    List<String> photos;
}
