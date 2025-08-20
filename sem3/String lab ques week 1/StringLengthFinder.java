import java.util.Scanner;

public class StringLengthFinder {
    static int findSize(String txt) {
        int count = 0;
        try {
            while (true) {
                txt.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter text: ");
        String str = scn.next();
        int manual = findSize(str);
        int builtin = str.length();
        System.out.println("Manual Count: " + manual);
        System.out.println("Built-in Count: " + builtin);
    }
}
