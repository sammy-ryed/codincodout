import java.util.Arrays;
import java.util.Scanner;

public class FindFactors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            if (number < 1) {
                System.out.println("Please enter a positive integer.");
            } else {
                int maxFactor = 10;
                int[] factors = new int[maxFactor];
                int index = 0;

                for (int i = 1; i <= number; i++) {
                    if (number % i == 0) {
                        if (index == maxFactor) {
                            maxFactor *= 2;
                            int[] temp = Arrays.copyOf(factors, index);
                            factors = new int[maxFactor];
                            System.arraycopy(temp, 0, factors, 0, index);
                        }
                        factors[index++] = i;
                    }
                }

                int[] result = Arrays.copyOf(factors, index);
                System.out.print("Factors of " + number + ": ");
                for (int factor : result) {
                    System.out.print(factor + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }
        scanner.close();
    }
}