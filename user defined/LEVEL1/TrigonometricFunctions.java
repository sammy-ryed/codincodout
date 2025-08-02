import java.util.Scanner;

public class TrigonometricFunctions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the angle in degrees: ");
        double angleDegrees = scanner.nextDouble();

        double[] results = calculateTrigonometricFunctions(angleDegrees);

        if (results != null) {
            System.out.println("Sine: " + results[0]);
            System.out.println("Cosine: " + results[1]);
            System.out.println("Tangent: " + results[2]);
        }

        scanner.close();
    }

    public static double[] calculateTrigonometricFunctions(double angleDegrees) {
        double angleRadians = Math.toRadians(angleDegrees);

        double sine = Math.sin(angleRadians);
        double cosine = Math.cos(angleRadians);
        double tangent = Math.tan(angleRadians);

        return new double[]{sine, cosine, tangent};
    }
}