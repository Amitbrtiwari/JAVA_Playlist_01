import java.util.Scanner;

public class CTC_TO_IN_HAND {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your total annual CTC (₹): ");
        double ctc = sc.nextDouble();

        System.out.print("Enter PF percentage (e.g., 12 for 12%): ");
        double pfPerc = sc.nextDouble();

        System.out.print("Enter professional tax amount per month (₹): ");
        double profTax = sc.nextDouble();

        System.out.print("Enter income tax percentage (e.g., 10 for 10%): ");
        double incomeTaxPerc = sc.nextDouble();

        System.out.print("Enter any other monthly deductions (₹): ");
        double otherDed = sc.nextDouble();

        double monthlyCtc = ctc / 12;
        double pf = monthlyCtc * pfPerc / 100;
        double incomeTax = monthlyCtc * incomeTaxPerc / 100;
        double totalDed = pf + profTax + incomeTax + otherDed;
        double inHand = monthlyCtc - totalDed;

        System.out.println("\nName: " + name);
        System.out.printf("Monthly CTC: ₹%.2f\n", monthlyCtc);
        System.out.printf("PF Deduction: ₹%.2f\n", pf);
        System.out.printf("Professional Tax: ₹%.2f\n", profTax);
        System.out.printf("Income Tax: ₹%.2f\n", incomeTax);
        System.out.printf("Other Deductions: ₹%.2f\n", otherDed);
        System.out.printf("Total Deductions: ₹%.2f\n", totalDed);
        System.out.printf("Estimated Monthly In-Hand Salary: ₹%.2f\n", inHand);
    }
}
