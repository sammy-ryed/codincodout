import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    static boolean isAnagram(String a, String b) {
        char[] x = a.replaceAll("\\s+", "").toLowerCase().toCharArray();
        char[] y = b.replaceAll("\\s+", "").toLowerCase().toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        return Arrays.equals(x, y);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = scn.nextLine();
        System.out.print("Enter second string: ");
        String s2 = scn.nextLine();
        if (isAnagram(s1, s2)) System.out.println("Anagram");
        else System.out.println("Not Anagram");
    }
}
