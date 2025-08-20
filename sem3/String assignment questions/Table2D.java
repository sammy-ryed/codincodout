import java.util.Scanner;

public class Table2D {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Rows: ");
        int r = scn.nextInt();
        System.out.print("Cols: ");
        int c = scn.nextInt();

        int[][] arr = new int[r][c];
        System.out.println("Enter elements:");
        for (int x = 0; x < r; x++) {
            for (int y = 0; y < c; y++) {
                arr[x][y] = scn.nextInt();
            }
        }

        System.out.println("\nMatrix:");
        for (int x = 0; x < r; x++) {
            for (int y = 0; y < c; y++) {
                System.out.print(arr[x][y] + "\t");
            }
            System.out.println();
        }
    }
}
