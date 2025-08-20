import java.util.Scanner;

public class SubstringSearch {
    static int find(String text, String word) {
        return text.indexOf(word);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = scn.nextLine();
        System.out.print("Enter word: ");
        String w = scn.nextLine();
        int pos = find(s, w);
        if (pos == -1) System.out.println("Not found");
        else System.out.println("Found at index " + pos);
    }
}
