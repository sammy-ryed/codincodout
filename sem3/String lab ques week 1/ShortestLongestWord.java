import java.util.Scanner;

public class ShortestLongestWord {
    static int getLen(String txt) {
        int k = 0;
        try {
            while (true) {
                txt.charAt(k);
                k++;
            }
        } catch (Exception e) {
        }
        return k;
    }

    static String[] cutWords(String txt) {
        int n = getLen(txt);
        int cnt = 1;
        for (int x = 0; x < n; x++) if (txt.charAt(x) == ' ') cnt++;
        int[] pts = new int[cnt + 1];
        int idx = 0;
        pts[idx++] = -1;
        for (int x = 0; x < n; x++) if (txt.charAt(x) == ' ') pts[idx++] = x;
        pts[idx] = n;
        String[] parts = new String[cnt];
        for (int x = 0; x < cnt; x++) {
            String t = "";
            for (int y = pts[x] + 1; y < pts[x + 1]; y++) t += txt.charAt(y);
            parts[x] = t;
        }
        return parts;
    }

    static String[][] build2D(String[] arr) {
        String[][] box = new String[arr.length][2];
        for (int x = 0; x < arr.length; x++) {
            box[x][0] = arr[x];
            box[x][1] = String.valueOf(getLen(arr[x]));
        }
        return box;
    }

    static int[] findMinMax(String[][] data) {
        int minI = 0, maxI = 0;
        for (int x = 1; x < data.length; x++) {
            if (Integer.parseInt(data[x][1]) < Integer.parseInt(data[minI][1])) minI = x;
            if (Integer.parseInt(data[x][1]) > Integer.parseInt(data[maxI][1])) maxI = x;
        }
        return new int[]{minI, maxI};
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter line: ");
        String input = scn.nextLine();
        String[] arr = cutWords(input);
        String[][] tab = build2D(arr);
        int[] res = findMinMax(tab);
        System.out.println("Shortest: " + tab[res[0]][0]);
        System.out.println("Longest: " + tab[res[1]][0]);
    }
}
