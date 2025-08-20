import java.util.Scanner;

public class WordLengthTable {
    static int findSize(String txt) {
        int c = 0;
        try {
            while (true) {
                txt.charAt(c);
                c++;
            }
        } catch (Exception e) {
        }
        return c;
    }

    static String[] separate(String txt) {
        int n = findSize(txt);
        int gap = 1;
        for (int x = 0; x < n; x++) if (txt.charAt(x) == ' ') gap++;
        int[] loc = new int[gap + 1];
        int pos = 0;
        loc[pos++] = -1;
        for (int x = 0; x < n; x++) if (txt.charAt(x) == ' ') loc[pos++] = x;
        loc[pos] = n;
        String[] arr = new String[gap];
        for (int x = 0; x < gap; x++) {
            String t = "";
            for (int y = loc[x] + 1; y < loc[x + 1]; y++) t += txt.charAt(y);
            arr[x] = t;
        }
        return arr;
    }

    static String[][] make2D(String[] words) {
        String[][] grid = new String[words.length][2];
        for (int x = 0; x < words.length; x++) {
            grid[x][0] = words[x];
            grid[x][1] = String.valueOf(findSize(words[x]));
        }
        return grid;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Input text: ");
        String line = scn.nextLine();
        String[] words = separate(line);
        String[][] table = make2D(words);
        System.out.println("Word\tLength");
        for (int x = 0; x < table.length; x++) {
            System.out.println(table[x][0] + "\t" + Integer.parseInt(table[x][1]));
        }
    }
}
