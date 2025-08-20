import java.util.Scanner;

public class ManualTrim {
    static int[] findBounds(String txt) {
        int n = txt.length();
        int start = 0, end = n - 1;
        while (start < n && txt.charAt(start) == ' ') start++;
        while (end >= 0 && txt.charAt(end) == ' ') end--;
        return new int[]{start, end};
    }

    static String makeSubstring(String txt, int a, int b) {
        String res = "";
        for (int x = a; x <= b; x++) res += txt.charAt(x);
        return res;
    }

    static boolean equalCheck(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int x = 0; x < a.length(); x++) if (a.charAt(x) != b.charAt(x)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter string with spaces: ");
        String data = scn.nextLine();
        int[] b = findBounds(data);
        String trimmed = makeSubstring(data, b[0], b[1]);
        String builtin = data.trim();
        System.out.println("Manual Trim: " + trimmed);
        System.out.println("Built-in Trim: " + builtin);
        System.out.println("Match: " + equalCheck(trimmed, builtin));
    }
}
