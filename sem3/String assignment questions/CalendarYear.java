import java.util.Scanner;

public class CalendarYear {
    static int daysInMonth(int m, int y) {
        if (m == 1) return (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)) ? 29 : 28;
        if (m == 3 || m == 5 || m == 8 || m == 10) return 30;
        return 31;
    }

    static void printMonth(int m, int y, int start) {
        String[] names = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        System.out.println("\n" + names[m] + " " + y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int x = 0; x < start; x++) System.out.print("    ");
        int d = daysInMonth(m, y);
        for (int x = 1; x <= d; x++) {
            System.out.printf("%3d ", x);
            if ((x + start) % 7 == 0) System.out.println();
        }
        System.out.println();
    }

    static void printYear(int y) {
        int start = 0;
        for (int z = 1900; z < y; z++) {
            start += (z % 400 == 0 || (z % 4 == 0 && z % 100 != 0)) ? 366 : 365;
        }
        start %= 7;
        for (int m = 0; m < 12; m++) {
            printMonth(m, y, start);
            start = (start + daysInMonth(m, y)) % 7;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter year: ");
        int y = scn.nextInt();
        printYear(y);
    }
}
