package com.ecommerce.customer;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Customer with privacy tiers
 */
public class Customer {
    private final String customerId;
    private final String email;
    private String name;
    private String phoneNumber;
    private String preferredLanguage;
    private final String accountCreationDate; // immutable history

    // Guest checkout constructor (minimal)
    public Customer(String customerId, String email) {
        this.customerId = Objects.requireNonNull(customerId);
        this.email = Objects.requireNonNull(email);
        this.name = "Guest";
        this.phoneNumber = null;
        this.preferredLanguage = null;
        this.accountCreationDate = LocalDateTime.now().toString();
    }

    // Full registration
    public Customer(String customerId, String email, String name, String phone, String preferredLanguage, String accountCreationDate) {
        this.customerId = Objects.requireNonNull(customerId);
        this.email = Objects.requireNonNull(email);
        this.name = name;
        this.phoneNumber = phone;
        this.preferredLanguage = preferredLanguage;
        this.accountCreationDate = accountCreationDate == null ? LocalDateTime.now().toString() : accountCreationDate;
    }

    // Package-private credit rating for internal ops
    int getCreditRating() {
        // Dummy rating for demo (0-850)
        return 700;
    }

    public String getPublicProfile() {
        return "CustomerPublic{name=" + name + ", id=" + customerId + "}";
    }

    // Validated setters
    public void setName(String name) { if (name != null && !name.isBlank()) this.name = name; }
    public void setPhoneNumber(String phone) { this.phoneNumber = phone; }
    public void setPreferredLanguage(String lang) { this.preferredLanguage = lang; }

    @Override
    public String toString() {
        return "Customer{id=" + customerId + ", email=" + email + ", created=" + accountCreationDate + "}";
    }
}
