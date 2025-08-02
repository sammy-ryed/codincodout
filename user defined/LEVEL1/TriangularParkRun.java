import java.util.Scanner;

public class TriangularParkRun {

    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double distanceInMeters = 5000;
        return distanceInMeters / perimeter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of side 1 (meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of side 2 (meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of side 3 (meters): ");
        double side3 = scanner.nextDouble();

        scanner.close();

        double rounds = calculateRounds(side1, side2, side3);
        System.out.printf("The athlete needs to complete %.2f rounds to complete 5 km.%n", rounds);
    }
}