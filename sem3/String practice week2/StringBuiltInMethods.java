public class StringBuiltInMethods {
    public static void main(String[] args) {
        String sampleText = "  Java Programming is Fun and Challenging!  ";
        System.out.println("Original Length: " + sampleText.length());
        String trimmed = sampleText.trim();
        System.out.println("Trimmed Length: " + trimmed.length());
        System.out.println("Character at index 5: " + sampleText.charAt(5));
        System.out.println("Substring: " + sampleText.substring(7, 18));
        System.out.println("Index of 'Fun': " + sampleText.indexOf("Fun"));
    }
}