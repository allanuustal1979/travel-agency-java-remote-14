package com.sda.travelagency.entity.enumeration;

public enum PaymentType {
    CASH("Pay with cash"),
    CARD("VISA or MasterCard"),
    TRANSFER("Bank transfer"),
    APPLE_PAY("Pay with iPhone"),
    GOOGLE_PAY("Pay with Android phone"),
    PAYPAL("Elon, would You pay?"),
    INSTALLMENT_PAYMENT("Just installment payments");

    private String description;

    PaymentType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}