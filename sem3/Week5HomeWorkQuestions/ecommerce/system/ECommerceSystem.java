package com.ecommerce.system;

import com.ecommerce.product.Product;
import com.ecommerce.order.Order;
import com.ecommerce.customer.Customer;
import java.util.Map;
import java.util.HashMap;

/**
 * Final ECommerceSystem class maintaining business rule integrity
 */
public final class ECommerceSystem {
    private static final Map<String,Object> productCatalog = new HashMap<>();
    public static boolean processOrder(Object order, Object customer) {
        if (!(order instanceof Order) || !(customer instanceof Customer)) return false;
        // Simplified processing
        return true;
    }

    public static void addProductToCatalog(String id, Object p) {
        productCatalog.put(id,p);
    }

    public static Object lookupProduct(String id) { return productCatalog.get(id); }
}
