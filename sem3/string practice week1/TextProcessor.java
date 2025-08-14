import java.util.*;

public class TextProcessor {

    public static String cleanInput(String input) {
        input = input.trim().replaceAll("\\s+", " ");
        String[] words = input.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            if (!w.isEmpty()) {
                sb.append(Character.toUpperCase(w.charAt(0)));
                sb.append(w.substring(1).toLowerCase());
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static void analyzeText(String text) {
        String[] words = text.split("\\s+");
        int wordCount = words.length;
        int sentenceCount = text.split("[.!?]").length;
        int charCount = text.replace(" ", "").length();

        String longestWord = "";
        for (String w : words) {
            if (w.length() > longestWord.length()) longestWord = w;
        }

        System.out.println("\nTEXT ANALYSIS");
        System.out.println("Words: " + wordCount);
        System.out.println("Sentences: " + sentenceCount);
        System.out.println("Characters (no spaces): " + charCount);
        System.out.println("Longest word: " + longestWord);
    }

    public static String[] getWordsSorted(String text) {
        text = text.replaceAll("[^a-zA-Z\\s]", "");
        String[] words = text.split("\\s+");
        Arrays.sort(words, String.CASE_INSENSITIVE_ORDER);
        return words;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== TEXT PROCESSOR ===");
        System.out.print("Enter a paragraph: ");
        String input = scanner.nextLine();

        String cleanText = cleanInput(input);
        System.out.println("\nCleaned Text: " + cleanText);

        analyzeText(cleanText);

        String[] sortedWords = getWordsSorted(cleanText);
        System.out.println("\nWords in Alphabetical Order:");
        for (String w : sortedWords) System.out.println(w);

        System.out.print("\nSearch for a word: ");
        String search = scanner.next();
        boolean found = Arrays.stream(sortedWords).anyMatch(s -> s.equalsIgnoreCase(search));
        System.out.println(found ? "'" + search + "' found!" : "'" + search + "' not found!");

        scanner.close();
    }
}
