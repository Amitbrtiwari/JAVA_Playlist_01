import java.util.Scanner;

public class GPACalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int n = input.nextInt();

        double totalGradePoints = 0;
        double totalCredits = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter credit hours for subject " + i + ": ");
            double credit = input.nextDouble();
            System.out.print("Enter grade for subject " + i + " (0.0 - 10.0 or 4.0 scale): ");
            double grade = input.nextDouble();
            totalGradePoints += credit * grade;
            totalCredits += credit;
        }

        double gpa = totalGradePoints / totalCredits;
        System.out.printf("Your GPA is: %.2f\n", gpa);
        input.close();
    }
}
