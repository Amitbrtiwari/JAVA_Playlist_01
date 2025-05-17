
    
    import java.util.Scanner;

    public class diaond_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows for the diamond (half height): ");
        int n = sc.nextInt();

        // Upper Half
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) System.out.print(" ");
            for (int k = 1; k <= i; k++) System.out.print("* ");
            System.out.println();
        }

        // Lower Half
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) System.out.print(" ");
            for (int k = 1; k <= i; k++) System.out.print("* ");
            System.out.println();
        }

        sc.close();
    }
}

