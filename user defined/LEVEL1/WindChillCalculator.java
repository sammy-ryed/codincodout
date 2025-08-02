import java.util.Scanner;

public class WindChillCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the wind speed in miles per hour: ");
        double windSpeed = scanner.nextDouble();

        if (temperature > 50 || windSpeed < 3) {
            System.out.println("Wind chill calculation is not valid for temperature above 50°F or wind speed below 3 mph.");
        } else {
            double windChill = calculateWindChill(temperature, windSpeed);
            System.out.println("Wind chill temperature: " + windChill + "°F");
        }

        scanner.close();
    }

    public static double calculateWindChill(double temperature, double windSpeed) {
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }
}