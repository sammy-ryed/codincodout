package com.ecommerce.cart;

import java.util.ArrayList;
import java.util.List;
import com.ecommerce.product.Product;

/**
 * ShoppingCart with controlled access and item validation
 */
public class ShoppingCart {
    private final String cartId;
    private final String customerId;
    private final List<Object> items = new ArrayList<>();
    private double totalAmount = 0.0;
    private int itemCount = 0;

    public ShoppingCart(String cartId, String customerId) {
        this.cartId = cartId;
        this.customerId = customerId;
    }

    public boolean addItem(Object product, int quantity) {
        if (product instanceof Product && quantity > 0) {
            items.add(product);
            itemCount += quantity;
            totalAmount += ((Product) product).getBasePrice() * quantity;
            return true;
        }
        return false;
    }

    private double calculateDiscount() {
        // Internal pricing logic demo
        return itemCount > 10 ? 0.05 * totalAmount : 0.0;
    }

    // Package-private summary for checkout
    String getCartSummary() {
        return "CartSummary{cartId=" + cartId + ", items=" + itemCount + ", total=" + totalAmount + ", discount=" + calculateDiscount() + "}";
    }

    @Override
    public String toString() {
        return "ShoppingCart{cartId=" + cartId + ", total=" + totalAmount + "}";
    }
}
