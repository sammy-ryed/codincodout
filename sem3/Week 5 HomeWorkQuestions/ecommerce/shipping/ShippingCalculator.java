package com.ecommerce.shipping;

import java.util.Map;

/**
 * ShippingCalculator with static rates
 */
public class ShippingCalculator {
    private final Map<String, Double> shippingRates;

    public ShippingCalculator(Map<String, Double> shippingRates) {
        this.shippingRates = shippingRates;
    }

    public double calculate(String region, double weight) {
        Double rate = shippingRates.get(region);
        if (rate == null) rate = 5.0;
        return rate * weight;
    }
}
