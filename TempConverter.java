import java.util.*;

public class TempConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature scale (Fahrenheit or Celsius): ");
        String scale = sc.nextLine().trim().toLowerCase();

        System.out.print("Enter the temperature value: ");
        double value = sc.nextDouble();

        switch (scale) {
            case "fahrenheit" -> {
                double celsius = (value - 32) * 5 / 9;
                System.out.printf("Converted: %.2f Fahrenheit = %.2f Celsius%n", value, celsius);
            }
            case "celsius" -> {
                double fahrenheit = (value * 9 / 5) + 32;
                System.out.printf("Converted: %.2f Celsius = %.2f Fahrenheit%n", value, fahrenheit);
            }
            default -> System.out.println("Invalid input. Please enter either 'Fahrenheit' or 'Celsius'.");
        }
        sc.close();
    }
}
