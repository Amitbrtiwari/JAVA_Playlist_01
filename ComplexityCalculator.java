import java.util.Scanner;

public class ComplexityCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select an algorithm to calculate its time and space complexity:");
        System.out.println("1. Linear Search");
        System.out.println("2. Binary Search");
        System.out.println("3. Bubble Sort");
        System.out.println("4. Merge Sort");
        System.out.println("5. Quick Sort");
        System.out.println("6. Hash Table Insertion");
        System.out.print("Enter your choice (1-6): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("Algorithm: Linear Search");
                System.out.println("Time Complexity: O(n)");
                System.out.println("Space Complexity: O(1)");
            }
            case 2 -> {
                System.out.println("Algorithm: Binary Search");
                System.out.println("Time Complexity: O(log n)");
                System.out.println("Space Complexity: O(1)");
            }
            case 3 -> {
                System.out.println("Algorithm: Bubble Sort");
                System.out.println("Time Complexity: O(n^2)");
                System.out.println("Space Complexity: O(1)");
            }
            case 4 -> {
                System.out.println("Algorithm: Merge Sort");
                System.out.println("Time Complexity: O(n log n)");
                System.out.println("Space Complexity: O(n)");
            }
            case 5 -> {
                System.out.println("Algorithm: Quick Sort");
                System.out.println("Time Complexity: O(n log n)");
                System.out.println("Space Complexity: O(log n)");
            }
            case 6 -> {
                System.out.println("Algorithm: Hash Table Insertion");
                System.out.println("Time Complexity: O(1)");
                System.out.println("Space Complexity: O(n)");
            }
            default -> System.out.println("Invalid choice. Please enter a number from 1 to 6.");
        }

        sc.close();
    }
}
