import java.util.*;
public class TextCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        Map<Character,Integer> freq = new HashMap<>();
        for(char c : text.toCharArray()){
            freq.put(c, freq.getOrDefault(c,0)+1);
        }
        System.out.println("Frequencies: " + freq);
        String compressed = compress(text, freq);
        System.out.println("Compressed: " + compressed);
        sc.close();
    }
    public static String compress(String text, Map<Character,Integer> freq){
        StringBuilder sb = new StringBuilder();
        for(char c : text.toCharArray()){
            sb.append(Integer.toHexString(c));
        }
        return sb.toString();
    }
}