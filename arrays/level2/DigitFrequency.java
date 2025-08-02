import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        int[] digits = new int[20]; // To store digits of the number
        int[] frequency = new int[10]; // To store frequency of digits (0-9)

        int index = 0;

        while (number > 0) {
            digits[index] = (int)(number % 10); // Get the last digit
            number = number / 10; // Remove the last digit
            index++;
        }

        for (int i = 0; i < index; i++) {
            frequency[digits[i]]++;
        }

        System.out.println("\nDigit | Frequency");
        System.out.println("-----------------");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("   " + i + "   |    " + frequency[i]);
            }
        }

        sc.close();
    }
}
