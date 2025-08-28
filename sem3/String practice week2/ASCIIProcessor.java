import java.util.Scanner;
public class ASCIIProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        for(char ch : input.toCharArray()){
            System.out.println(ch + " -> " + (int)ch);
        }
        scanner.close();
    }
}