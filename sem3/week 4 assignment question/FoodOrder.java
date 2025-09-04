public class FoodOrder {
    String customerName;
    String foodItem;
    int quantity;
    double price;
    static final double fixedRate = 100.0;

    public FoodOrder() {
        this("Unknown", "Unknown", 0, 0.0);
    }

    public FoodOrder(String foodItem) {
        this("Unknown", foodItem, 1, fixedRate);
    }

    public FoodOrder(String foodItem, int quantity) {
        this("Unknown", foodItem, quantity, quantity * fixedRate);
    }

    public FoodOrder(String customerName, String foodItem, int quantity, double price) {
        this.customerName = customerName;
        this.foodItem = foodItem;
        this.quantity = quantity;
        this.price = price;
    }

    public void printBill() {
        System.out.println("Customer: " + customerName + ", Item: " + foodItem + ", Qty: " + quantity + ", Total: " + price);
    }

    public static void main(String[] args) {
        FoodOrder o1 = new FoodOrder();
        FoodOrder o2 = new FoodOrder("Burger");
        FoodOrder o3 = new FoodOrder("Pizza", 3);
        FoodOrder o4 = new FoodOrder("Alice", "Pasta", 2, 400.0);
        o1.printBill();
        o2.printBill();
        o3.printBill();
        o4.printBill();
    }
}