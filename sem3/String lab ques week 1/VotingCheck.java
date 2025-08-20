import java.util.Scanner;

public class VotingCheck {
    static int[] randomAges(int n) {
        int[] arr = new int[n];
        for (int x = 0; x < n; x++) arr[x] = (int)(Math.random() * 90 + 10);
        return arr;
    }

    static String[][] checkVoting(int[] ages) {
        String[][] grid = new String[ages.length][2];
        for (int x = 0; x < ages.length; x++) {
            grid[x][0] = String.valueOf(ages[x]);
            if (ages[x] < 0) grid[x][1] = "false";
            else if (ages[x] >= 18) grid[x][1] = "true";
            else grid[x][1] = "false";
        }
        return grid;
    }

    static void display(String[][] grid) {
        System.out.println("Age\tCanVote");
        for (int x = 0; x < grid.length; x++) {
            System.out.println(grid[x][0] + "\t" + grid[x][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Number of students: ");
        int n = scn.nextInt();
        int[] arr = randomAges(n);
        String[][] tab = checkVoting(arr);
        display(tab);
    }
}
