import java.util.Scanner;

public class ReverseRec {
    static String rev(String s) {
        if (s.isEmpty()) return "";
        return rev(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = scn.nextLine();
        System.out.println("Reversed: " + rev(s));
    }
}
