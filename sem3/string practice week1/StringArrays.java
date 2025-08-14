public class StringArrays {

    public static String findLongestName(String[] names) {
        String longest = names[0];
        for (String x : names) {
            if (x.length() > longest.length()) {
                longest = x;
            }
        }
        return longest;
    }

    public static int countNamesStartingWith(String[] names, char letter) {
        int count = 0;
        char target = Character.toLowerCase(letter);
        for (String x : names) {
            if (!x.isEmpty() && Character.toLowerCase(x.charAt(0)) == target) {
                count++;
            }
        }
        return count;
    }

    public static String[] formatNames(String[] names) {
        String[] formatted = new String[names.length];
        for (int x = 0; x < names.length; x++) {
            String[] parts = names[x].split(" ");
            if (parts.length == 2) {
                formatted[x] = parts[1] + ", " + parts[0];
            } else {
                formatted[x] = names[x];
            }
        }
        return formatted;
    }

    public static void main(String[] args) {
        String[] students = {
            "Ali Zafar", 
            "Bo Burnham", 
            "Ryan Raynolds",
            "Skrillx", 
            "Powfu"
        };

        System.out.println("Longest name: " + findLongestName(students));

        char searchLetter = 'B';
        System.out.println("Names starting with '" + searchLetter + "': " + 
            countNamesStartingWith(students, searchLetter));

        String[] formattedNames = formatNames(students);
        System.out.println("Formatted names:");
        for (String x : formattedNames) {
            System.out.println(x);
        }
    }
}
