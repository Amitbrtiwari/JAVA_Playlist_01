import java.util.Scanner;

public class GST_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total amount (GST inclusive): ");
        double totalAmount = sc.nextDouble();

        System.out.print("Enter GST rate (%): ");
        double gstRate = sc.nextDouble();

        double originalAmount = (totalAmount * 100) / (100 + gstRate);
        double gstAmount = totalAmount - originalAmount;

        System.out.println("Original Amount (excluding GST): " + originalAmount);
        System.out.println("GST Amount: " + gstAmount);
    }
}
