public class FoodDelivery {
    public static void main(String[] args) {
        DeliveryCalculator dc = new DeliveryCalculator();
        dc.calculate(5); // Basic
        dc.calculate(5, 20); // Premium
        dc.calculate(10, 3, true); // Group
        dc.calculate(15, 0.2, 200); // Festival
    }
}

class DeliveryCalculator {
    public void calculate(int distance) {
        double cost = distance * 5;
        System.out.println("\nBasic Delivery: Distance = " + distance + "km | Cost = " + cost);
    }

    public void calculate(int distance, int priorityFee) {
        double cost = distance * 5 + priorityFee;
        System.out.println("\nPremium Delivery: Distance = " + distance + "km + Priority fee = " + priorityFee + " | Total = " + cost);
    }

    public void calculate(int distance, int orders, boolean group) {
        double base = distance * 5;
        double discount = orders > 2 ? base * 0.2 : 0;
        double total = base - discount;
        System.out.println("\nGroup Delivery: Distance = " + distance + "km | Orders = " + orders + " | Discount = " + discount + " | Total = " + total);
    }

    public void calculate(int distance, double discountPercent, double orderAmount) {
        double cost = distance * 5;
        double discount = cost * discountPercent;
        double total = (orderAmount > 100) ? 0 : cost - discount;
        System.out.println("\nFestival Delivery: Distance = " + distance + "km | Discount = " + (discountPercent*100) + "% | Order = " + orderAmount + " | Total = " + total);
    }
}