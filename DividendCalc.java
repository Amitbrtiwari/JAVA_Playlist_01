import java.util.Scanner;

public class DividendCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter stock name: ");
        String stock = sc.nextLine();

        System.out.print("Enter current stock price: ");
        double price = sc.nextDouble();

        System.out.print("Enter number of shares: ");
        int shares = sc.nextInt();

        System.out.print("Enter dividend per share: ");
        double div = sc.nextDouble();

        double totalDiv = shares * div;

        System.out.println("\nName: " + name);
        System.out.println("Stock: " + stock);
        System.out.printf("Amount you will get as dividend: ₹%.2f\n", totalDiv);
    }
}
