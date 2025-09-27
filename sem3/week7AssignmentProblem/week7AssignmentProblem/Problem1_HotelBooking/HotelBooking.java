public class HotelBooking {
    public static void main(String[] args) {
        BookingCalculator bc = new BookingCalculator();
        bc.calculate("Deluxe", 3); // standard
        bc.calculate("Deluxe", 3, 1.5); // seasonal multiplier
        bc.calculate("Deluxe", 5, 0.1, true); // corporate: discount, meal package
        bc.calculate("Suite", 2, 50, 200, true); // wedding: guestCount, decorationFee, catering
    }
}

class BookingCalculator {
    public void calculate(String roomType, int nights) {
        double rate = baseRate(roomType);
        double total = rate * nights;
        System.out.println("\nStandard Booking - " + roomType);
        System.out.println("Rate per night: " + rate);
        System.out.println("Nights: " + nights);
        System.out.println("Total: " + total);
    }

    public void calculate(String roomType, int nights, double seasonalMultiplier) {
        double rate = baseRate(roomType);
        double adjusted = rate * seasonalMultiplier;
        double total = adjusted * nights;
        System.out.println("\nSeasonal Booking - " + roomType);
        System.out.println("Base rate: " + rate);
        System.out.println("Seasonal multiplier: " + seasonalMultiplier);
        System.out.println("Adjusted rate: " + adjusted);
        System.out.println("Nights: " + nights);
        System.out.println("Total: " + total);
    }

    public void calculate(String roomType, int nights, double corporateDiscount, boolean mealPackage) {
        double rate = baseRate(roomType);
        double subtotal = rate * nights;
        double discount = subtotal * corporateDiscount;
        double meal = mealPackage ? 20 * nights : 0;
        double total = subtotal - discount + meal;
        System.out.println("\nCorporate Booking - " + roomType);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Corporate discount (" + (corporateDiscount*100) + "%): -" + discount);
        System.out.println("Meal package: " + meal);
        System.out.println("Total: " + total);
    }

    public void calculate(String roomType, int nights, int guestCount, double decorationFee, boolean catering) {
        double rate = baseRate(roomType);
        double roomCost = rate * nights;
        double cateringCost = catering ? (50 * guestCount) : 0;
        double total = roomCost + decorationFee + cateringCost;
        System.out.println("\nWedding Package - " + roomType);
        System.out.println("Room cost: " + roomCost);
        System.out.println("Guest count: " + guestCount);
        System.out.println("Decoration fee: " + decorationFee);
        System.out.println("Catering: " + cateringCost);
        System.out.println("Total: " + total);
    }

    private double baseRate(String roomType) {
        switch (roomType.toLowerCase()) {
            case "suite": return 200;
            case "deluxe": return 120;
            case "standard": return 80;
            default: return 100;
        }
    }
}