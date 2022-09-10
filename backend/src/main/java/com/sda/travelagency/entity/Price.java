package com.sda.travelagency.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@Embeddable
@NoArgsConstructor

public class Price {
    BigDecimal cost;
    String currency;
}
