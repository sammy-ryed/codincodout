import java.util.Scanner;
public class CaseConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println("Upper: " + toUpper(text));
        System.out.println("Lower: " + toLower(text));
        System.out.println("Title: " + toTitleCase(text));
        sc.close();
    }
    public static String toUpper(String text){
        StringBuilder sb = new StringBuilder();
        for(char c: text.toCharArray()){
            if(c >= 'a' && c <= 'z') sb.append((char)(c - 32));
            else sb.append(c);
        }
        return sb.toString();
    }
    public static String toLower(String text){
        StringBuilder sb = new StringBuilder();
        for(char c: text.toCharArray()){
            if(c >= 'A' && c <= 'Z') sb.append((char)(c + 32));
            else sb.append(c);
        }
        return sb.toString();
    }
    public static String toTitleCase(String text){
        String lower = toLower(text);
        StringBuilder sb = new StringBuilder();
        boolean newWord = true;
        for(char c: lower.toCharArray()){
            if(c == ' '){
                sb.append(c);
                newWord = true;
            } else {
                if(newWord && c >= 'a' && c <= 'z'){
                    sb.append((char)(c - 32));
                    newWord = false;
                } else {
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}