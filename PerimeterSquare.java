import java.util.Scanner;

public class PerimeterSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side length of the square: ");
        double side = sc.nextDouble();
        double perimeter = 4 * side;
        System.out.println("Perimeter of Square: " + perimeter);
    }
}
