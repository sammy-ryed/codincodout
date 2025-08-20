import java.util.Scanner;

public class FactFiboRec {
    static int fact(int n) {
        if (n <= 1) return 1;
        return n * fact(n - 1);
    }

    static int fibo(int n) {
        if (n <= 1) return n;
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number for factorial: ");
        int f = scn.nextInt();
        System.out.println("Factorial: " + fact(f));

        System.out.print("Enter terms for Fibonacci: ");
        int t = scn.nextInt();
        System.out.print("Fibonacci: ");
        for (int x = 0; x < t; x++) System.out.print(fibo(x) + " ");
    }
}
