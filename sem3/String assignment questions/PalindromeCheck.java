import java.util.Scanner;

public class PalindromeCheck {
    static boolean isPal(String s) {
        s = s.toLowerCase().replaceAll("\\s+", "");
        String rev = "";
        for (int x = s.length() - 1; x >= 0; x--) rev += s.charAt(x);
        return s.equals(rev);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = scn.nextLine();
        if (isPal(s)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}
