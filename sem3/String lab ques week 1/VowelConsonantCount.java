import java.util.Scanner;

public class VowelConsonantCount {
    static String checkType(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return "Vowel";
            return "Consonant";
        }
        return "Not";
    }

    static int[] analyze(String txt) {
        int v = 0, co = 0;
        for (int x = 0; x < txt.length(); x++) {
            String t = checkType(txt.charAt(x));
            if (t.equals("Vowel")) v++;
            else if (t.equals("Consonant")) co++;
        }
        return new int[]{v, co};
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter string: ");
        String data = scn.nextLine();
        int[] res = analyze(data);
        System.out.println("Vowels: " + res[0]);
        System.out.println("Consonants: " + res[1]);
    }
}
