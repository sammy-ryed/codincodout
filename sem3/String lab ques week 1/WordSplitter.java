import java.util.Scanner;

public class WordSplitter {
    static int getSize(String txt) {
        int cnt = 0;
        try {
            while (true) {
                txt.charAt(cnt);
                cnt++;
            }
        } catch (Exception e) {
        }
        return cnt;
    }

    static String[] divideWords(String txt) {
        int n = getSize(txt);
        int gapCount = 1;
        for (int x = 0; x < n; x++) if (txt.charAt(x) == ' ') gapCount++;
        int[] spaceIdx = new int[gapCount + 1];
        int pos = 0;
        spaceIdx[pos++] = -1;
        for (int x = 0; x < n; x++) if (txt.charAt(x) == ' ') spaceIdx[pos++] = x;
        spaceIdx[pos] = n;
        String[] out = new String[gapCount];
        for (int x = 0; x < gapCount; x++) {
            String temp = "";
            for (int y = spaceIdx[x] + 1; y < spaceIdx[x + 1]; y++) temp += txt.charAt(y);
            out[x] = temp;
        }
        return out;
    }

    static boolean sameCheck(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int x = 0; x < a.length; x++) if (!a[x].equals(b[x])) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String text = scn.nextLine();
        String[] manual = divideWords(text);
        String[] builtin = text.split(" ");
        boolean res = sameCheck(manual, builtin);
        System.out.println("Arrays match: " + res);
    }
}
