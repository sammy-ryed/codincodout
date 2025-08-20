import java.util.Scanner;

public class VowelConsonantTable {
    static String getType(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return "Vowel";
            return "Consonant";
        }
        return "Not";
    }

    static String[][] buildTable(String txt) {
        String[][] grid = new String[txt.length()][2];
        for (int x = 0; x < txt.length(); x++) {
            grid[x][0] = String.valueOf(txt.charAt(x));
            grid[x][1] = getType(txt.charAt(x));
        }
        return grid;
    }

    static void show(String[][] grid) {
        System.out.println("Char\tType");
        for (int x = 0; x < grid.length; x++) {
            System.out.println(grid[x][0] + "\t" + grid[x][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Input string: ");
        String line = scn.nextLine();
        String[][] table = buildTable(line);
        show(table);
    }
}
