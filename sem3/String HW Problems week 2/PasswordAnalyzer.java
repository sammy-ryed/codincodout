import java.util.*;
public class PasswordAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        analyze(password);
        System.out.println("Generated Strong Password: " + generatePassword(12));
        sc.close();
    }
    public static void analyze(String pwd){
        int upper=0, lower=0, digit=0, special=0;
        for(char c: pwd.toCharArray()){
            if(c>='A'&&c<='Z') upper++;
            else if(c>='a'&&c<='z') lower++;
            else if(c>='0'&&c<='9') digit++;
            else special++;
        }
        int score = (pwd.length()-8)*2 + (upper>0?10:0) + (lower>0?10:0) + (digit>0?10:0) + (special>0?10:0);
        System.out.println("Upper:"+upper+" Lower:"+lower+" Digit:"+digit+" Special:"+special+" Score:"+score);
    }
    public static String generatePassword(int length){
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%";
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<length;i++){
            sb.append(chars.charAt(r.nextInt(chars.length())));
        }
        return sb.toString();
    }
}