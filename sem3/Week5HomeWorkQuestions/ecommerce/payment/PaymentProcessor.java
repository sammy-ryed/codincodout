package com.ecommerce.payment;

import java.util.Objects;

/**
 * PaymentProcessor with sensitive key (private)
 */
public class PaymentProcessor {
    private final String processorId;
    private final String securityKey;

    public PaymentProcessor(String processorId, String securityKey) {
        this.processorId = Objects.requireNonNull(processorId);
        this.securityKey = Objects.requireNonNull(securityKey);
    }

    public boolean processPayment(double amount) {
        // Dummy logic for demo
        return amount >= 0;
    }

    @Override
    public String toString() {
        return "PaymentProcessor{id=" + processorId + "}";
    }
}
