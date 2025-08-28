import java.util.Scanner;
public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String trimmed = input.trim();
        String replaced = trimmed.replace(" ", "_");
        String removedDigits = replaced.replaceAll("\\d", "");
        String[] words = removedDigits.split(" ");
        String joined = String.join(" | ", words);
        System.out.println(joined);
        scanner.close();
    }
}