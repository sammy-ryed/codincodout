import java.util.Scanner;

public class BMI2D {
    static double bmi(double w, double h) {
        return w / (h * h);
    }

    static String status(double val) {
        if (val < 18.5) return "Underweight";
        if (val < 25) return "Normal";
        if (val < 30) return "Overweight";
        return "Obese";
    }

    static void show(double[][] arr) {
        System.out.println("Weight\tHeight\tBMI\tStatus");
        for (int x = 0; x < arr.length; x++) {
            double b = bmi(arr[x][0], arr[x][1]);
            System.out.println(arr[x][0] + "\t" + arr[x][1] + "\t" + Math.round(b * 100.0) / 100.0 + "\t" + status(b));
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Number of persons: ");
        int n = scn.nextInt();
        double[][] arr = new double[n][2];
        for (int x = 0; x < n; x++) {
            System.out.print("Enter weight and height: ");
            arr[x][0] = scn.nextDouble();
            arr[x][1] = scn.nextDouble();
        }
        show(arr);
    }
}
