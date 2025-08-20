import java.util.Scanner;

public class StudentGrades {
    static int[][] randomScores(int n) {
        int[][] arr = new int[n][3];
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < 3; y++) {
                arr[x][y] = (int)(Math.random() * 90 + 10);
            }
        }
        return arr;
    }

    static double[][] computeValues(int[][] scores) {
        double[][] vals = new double[scores.length][3];
        for (int x = 0; x < scores.length; x++) {
            int total = scores[x][0] + scores[x][1] + scores[x][2];
            double avg = total / 3.0;
            double percent = Math.round((total / 300.0) * 10000.0) / 100.0;
            vals[x][0] = total;
            vals[x][1] = Math.round(avg * 100.0) / 100.0;
            vals[x][2] = percent;
        }
        return vals;
    }

    static String[] assignGrades(double[][] vals) {
        String[] g = new String[vals.length];
        for (int x = 0; x < vals.length; x++) {
            double p = vals[x][2];
            if (p >= 90) g[x] = "A";
            else if (p >= 80) g[x] = "B";
            else if (p >= 70) g[x] = "C";
            else if (p >= 60) g[x] = "D";
            else g[x] = "F";
        }
        return g;
    }

    static void showAll(int[][] scores, double[][] vals, String[] g) {
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPercent\tGrade");
        for (int x = 0; x < scores.length; x++) {
            System.out.println(scores[x][0] + "\t" + scores[x][1] + "\t" + scores[x][2] + "\t" +
                    (int)vals[x][0] + "\t" + vals[x][1] + "\t" + vals[x][2] + "\t" + g[x]);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Number of students: ");
        int n = scn.nextInt();
        int[][] scores = randomScores(n);
        double[][] vals = computeValues(scores);
        String[] g = assignGrades(vals);
        showAll(scores, vals, g);
    }
}
