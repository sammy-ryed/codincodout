import java.util.Scanner;

public class RockPaperScissors {
    static String compChoice() {
        int val = (int)(Math.random() * 3);
        if (val == 0) return "rock";
        if (val == 1) return "paper";
        return "scissors";
    }

    static int getWinner(String user, String comp) {
        if (user.equals(comp)) return 0;
        if (user.equals("rock") && comp.equals("scissors")) return 1;
        if (user.equals("scissors") && comp.equals("paper")) return 1;
        if (user.equals("paper") && comp.equals("rock")) return 1;
        return -1;
    }

    static String[][] summary(int userWins, int compWins, int total) {
        String[][] arr = new String[2][3];
        arr[0][0] = "User";
        arr[0][1] = String.valueOf(userWins);
        arr[0][2] = String.valueOf((userWins * 100.0) / total);
        arr[1][0] = "Computer";
        arr[1][1] = String.valueOf(compWins);
        arr[1][2] = String.valueOf((compWins * 100.0) / total);
        return arr;
    }

    static void show(String[][] arr) {
        System.out.println("Player\tWins\tPercentage");
        for (int x = 0; x < arr.length; x++) {
            System.out.println(arr[x][0] + "\t" + arr[x][1] + "\t" + arr[x][2] + "%");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Games to play: ");
        int n = scn.nextInt();
        scn.nextLine();
        int userWins = 0, compWins = 0;
        for (int g = 1; g <= n; g++) {
            System.out.print("Enter rock/paper/scissors: ");
            String user = scn.nextLine().toLowerCase();
            String comp = compChoice();
            int result = getWinner(user, comp);
            System.out.println("Computer: " + comp);
            if (result == 1) {
                System.out.println("User wins");
                userWins++;
            } else if (result == -1) {
                System.out.println("Computer wins");
                compWins++;
            } else {
                System.out.println("Draw");
            }
        }
        String[][] table = summary(userWins, compWins, n);
        show(table);
    }
}
