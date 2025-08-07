import java.util.Scanner;

public class SimpleInterestUserDefined {

    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static double getUserInput(String prompt, Scanner scanner) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public static void displayResult(double simpleInterest, double principal, double rate, double time) {
        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f and Time %.2f%n",
                simpleInterest, principal, rate, time);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principal = getUserInput("Enter the principal amount: ", scanner);
        double rate = getUserInput("Enter the rate of interest: ", scanner);
        double time = getUserInput("Enter the time period: ", scanner);

        scanner.close();

        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        displayResult(simpleInterest, principal, rate, time);
    }
}