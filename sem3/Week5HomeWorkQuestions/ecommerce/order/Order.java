package com.ecommerce.order;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 * Order with final properties
 */
public class Order {
    private final String orderId;
    private final LocalDateTime orderTime;
    private final List<Object> items;

    public Order(String orderId, List<Object> items) {
        this.orderId = Objects.requireNonNull(orderId);
        this.orderTime = LocalDateTime.now();
        this.items = items;
    }

    public String getOrderId() { return orderId; }
    public LocalDateTime getOrderTime() { return orderTime; }
    public List<Object> getItems() { return items; }

    @Override
    public String toString() {
        return "Order{id=" + orderId + ", time=" + orderTime + ", itemsCount=" + (items==null?0:items.size()) + "}";
    }
}
