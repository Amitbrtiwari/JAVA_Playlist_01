import java.util.*;

public class Grocery_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> items = new ArrayList<>();
        double total = 0;

        System.out.print("How many items do you have? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter name of item " + i + ": ");
            String name = sc.nextLine();
            items.add(name);

            System.out.print("Enter price of " + name + ": ");
            double price = sc.nextDouble();
            total += price;
            sc.nextLine();
        }

        System.out.print("Any discount? (yes/no): ");
        String discResp = sc.nextLine();
        double disc = 0;

        if (discResp.equalsIgnoreCase("yes")) {
            System.out.print("Enter discount in %: ");
            disc = sc.nextDouble();
        }

        double finalAmt = total - (total * disc / 100);

        System.out.println("\nItems: " + String.join(", ", items));
        System.out.printf("Total: ₹%.2f\n", total);
        if (disc > 0)
            System.out.printf("Discount: %.2f%%\n", disc);
        System.out.printf("Grand Total: ₹%.2f\n", finalAmt);
    }
}
