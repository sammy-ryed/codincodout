import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        int[][] marks = new int[numStudents][3];
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            while (true) {
                System.out.print("Physics: ");
                marks[i][0] = sc.nextInt();
                if (marks[i][0] >= 0) break;
                System.out.println("Invalid marks. Please enter a positive value.");
            }

            while (true) {
                System.out.print("Chemistry: ");
                marks[i][1] = sc.nextInt();
                if (marks[i][1] >= 0) break;
                System.out.println("Invalid marks. Please enter a positive value.");
            }

            while (true) {
                System.out.print("Maths: ");
                marks[i][2] = sc.nextInt();
                if (marks[i][2] >= 0) break;
                System.out.println("Invalid marks. Please enter a positive value.");
            }
        }

        for (int i = 0; i < numStudents; i++) {
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 300.0) * 100;

            if (percentages[i] >= 80) {
                grades[i] = "above agency-normalized level";
            } else if (percentages[i] >= 70) {
                grades[i] = "at agency-normalized level";
            } else if (percentages[i] >= 60) {
                grades[i] = "below, but approaching agency-normalized level";
            } else if (percentages[i] >= 50) {
                grades[i] = "well below agency-normalized level";
            } else if (percentages[i] >= 40) {
                grades[i] = "too below agency-normalized level";
            } else {
                grades[i] = "remedial level";
            }
        }

        System.out.println("\nResults:");
        System.out.println("Student | Physics | Chemistry | Maths | Percentage | Grade");
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("   %d    |   %d     |    %d     |   %d   |   %.2f%%    |   %s\n", 
                              (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }

        sc.close();
    }
}
