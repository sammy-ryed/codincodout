import java.util.*;
public class SpellChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String[] dictionary = {"java", "string", "performance", "programming"};
        String[] words = sentence.split(" ");
        for(String word : words){
            String suggestion = findClosest(word, dictionary);
            System.out.println(word + " -> " + suggestion);
        }
        sc.close();
    }
    public static int distance(String a, String b){
        int diff = Math.abs(a.length()-b.length());
        int len = Math.min(a.length(), b.length());
        for(int i=0; i<len; i++){
            if(a.charAt(i)!=b.charAt(i)) diff++;
        }
        return diff;
    }
    public static String findClosest(String word, String[] dict){
        String best = word;
        int minDist = Integer.MAX_VALUE;
        for(String d : dict){
            int dist = distance(word.toLowerCase(), d.toLowerCase());
            if(dist < minDist){
                minDist = dist;
                best = d;
            }
        }
        return (minDist<=2)? best : "No Suggestion";
    }
}