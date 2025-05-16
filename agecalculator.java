import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Date of Birth (YYYY-MM-DD):");
        String dobInput = scanner.nextLine();
        LocalDate dob = LocalDate.parse(dobInput);

        System.out.println("Enter today's date (YYYY-MM-DD):");
        String todayInput = scanner.nextLine();
        LocalDate today = LocalDate.parse(todayInput);

        Period age = Period.between(dob, today);

        System.out.println("You are " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days old.");
        System.out.println("Congrats! You have successfully calculated your age.");
    }
}
