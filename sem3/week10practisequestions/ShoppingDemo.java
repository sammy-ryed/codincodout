public class ShoppingDemo {
    public static void main(String[] args) {
        Customer c1 = new Customer("Amit", "amit@gmail.com");

        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Mobile", 25000);
        Product p3 = new Product("Mouse", 1500);

        Order o1 = new Order("ORD101");
        o1.addProduct(p1);
        o1.addProduct(p2);

        Order o2 = new Order("ORD102");
        o2.addProduct(p3);

        c1.placeOrder(o1);
        c1.placeOrder(o2);

        c1.showCustomerOrders();
    }
}
