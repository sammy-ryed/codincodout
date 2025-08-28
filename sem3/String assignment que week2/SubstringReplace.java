import java.util.Scanner;
public class SubstringReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String find = sc.nextLine();
        String replace = sc.nextLine();
        String result = manualReplace(text, find, replace);
        System.out.println("Manual Replace: " + result);
        System.out.println("Built-in Replace: " + text.replace(find, replace));
        sc.close();
    }
    public static String manualReplace(String text, String find, String replace){
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i < text.length()){
            if(i <= text.length()-find.length() && text.substring(i, i+find.length()).equals(find)){
                sb.append(replace);
                i += find.length();
            } else {
                sb.append(text.charAt(i));
                i++;
            }
        }
        return sb.toString();
    }
}