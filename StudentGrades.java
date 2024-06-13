import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numSub;

        System.out.print("Enter the number of subjects: ");
        numSub = scanner.nextInt();

        int[] marks = new int[numSub];

        for (int i = 0; i < numSub; i++) {
            int mark;
            do {
                System.out.print("Enter marks for subject " + (i + 1) + " : ");
                mark = scanner.nextInt();
                if (mark < 0 || mark > 100) {
                    System.out.println("Invalid marks. Enter a value between 0 and 100.");
                }
            } while (mark < 0 || mark > 100);
            marks[i] = mark;
        }

        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        double averagePercentage = (double) totalMarks / numSub;

        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}