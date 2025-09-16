package com.ecommerce.product;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/**
 * Immutable Product with defensive copies and factory methods
 */
public final class Product {
    private final String productId;
    private final String name;
    private final String category;
    private final String manufacturer;
    private final double basePrice;
    private final double weight;
    private final String[] features;
    private final Map<String,String> specifications;

    private Product(String productId, String name, String category, String manufacturer,
                    double basePrice, double weight, String[] features, Map<String,String> specs) {
        this.productId = Objects.requireNonNull(productId);
        this.name = name;
        this.category = category;
        this.manufacturer = manufacturer;
        this.basePrice = basePrice;
        this.weight = weight;
        this.features = features == null ? new String[0] : Arrays.copyOf(features, features.length);
        this.specifications = specs == null ? Collections.emptyMap() : Collections.unmodifiableMap(specs);
    }

    // Factory methods
    public static Product createElectronics(String id, String name, double price, double weight, String[] features, Map<String,String> specs) {
        return new Product(id, name, "Electronics", "GenericElectro", price, weight, features, specs);
    }

    public static Product createClothing(String id, String name, double price, double weight, String[] features) {
        return new Product(id, name, "Clothing", "GenericCloth", price, weight, features, null);
    }

    public static Product createBooks(String id, String name, double price, double weight, String[] features) {
        return new Product(id, name, "Books", "GenericBooks", price, weight, features, null);
    }

    public String getProductId() { return productId; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public String getManufacturer() { return manufacturer; }
    public double getBasePrice() { return basePrice; }
    public double getWeight() { return weight; }
    public String[] getFeatures() { return Arrays.copyOf(features, features.length); }
    public Map<String,String> getSpecifications() { return specifications; }

    // Business rule: cannot be overridden
    public final double calculateTax(String region) {
        // Simple tax logic for demo
        double rate = "EU".equalsIgnoreCase(region) ? 0.20 : 0.10;
        return basePrice * rate;
    }

    @Override
    public String toString() {
        return "Product{id=" + productId + ", name=" + name + ", category=" + category + "}";
    }
}
