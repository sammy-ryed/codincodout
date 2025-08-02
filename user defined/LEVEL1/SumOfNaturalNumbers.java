import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int sum = calculateSum(number);
            System.out.println("Sum of first " + number + " natural numbers is: " + sum);
        }
		
		scanner.close();
    }
}