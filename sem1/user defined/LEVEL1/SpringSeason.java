import java.util.Scanner;

public class SpringSeason {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the month (1 for January, 2 for February, etc.):");

        if(!input.hasNextInt()){
            System.out.println("That's not a number! Please start again and enter a number.");
            input.close();
            return;
        }

        int month = input.nextInt();

        System.out.println("Enter the day of the month:");

        if(!input.hasNextInt()){
            System.out.println("That's not a number! Please start again and enter a number.");
            input.close();
            return;
        }

        int day = input.nextInt();

        boolean isSpring = false;

        if (month == 3 && day >= 20 && day <= 31) {
            isSpring = true;
        } else if (month == 4 && day >= 1 && day <= 30) {
            isSpring = true;
        } else if (month == 5 && day >= 1 && day <= 31) {
            isSpring = true;
        } else if (month == 6 && day >= 1 && day <= 20) {
            isSpring = true;
        }

        if (isSpring) {
            System.out.println("It's a Spring Season!");
        } else {
            System.out.println("It's not a Spring Season.");
        }

        input.close();
    }
}