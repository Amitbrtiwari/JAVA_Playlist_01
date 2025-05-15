import java.util.*;

class Person {
    String name, gender;
    int age;

    Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}

class Patient extends Person {
    int id;
    String disease;

    Patient(int id, String name, int age, String gender, String disease) {
        super(name, age, gender);
        this.id = id;
        this.disease = disease;
    }

    public void display() {
        System.out.println("Patient ID: " + id + ", Name: " + name + ", Disease: " + disease);
    }
}

class Doctor extends Person {
    String specialization, timing;
    double fees;

    Doctor(String name, int age, String gender, String specialization, String timing, double fees) {
        super(name, age, gender);
        this.specialization = specialization;
        this.timing = timing;
        this.fees = fees;
    }

    public void display() {
        System.out.println("Doctor: " + name + ", Specialization: " + specialization + ", Timing: " + timing + ", Fees: " + fees);
    }
}

class Medicine {
    String name;
    double price;
    int stock;

    Medicine(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void display() {
        System.out.println("Medicine: " + name + ", Price: " + price + ", Stock: " + stock);
    }
}

public class hospital{
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Patient> patients = new ArrayList<>();
    static ArrayList<Doctor> doctors = new ArrayList<>();
    static ArrayList<Medicine> medicines = new ArrayList<>();

    public static void addPatient() {
        System.out.print("Enter Patient ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Gender: ");
        String gender = sc.nextLine();
        System.out.print("Disease: ");
        String disease = sc.nextLine();
        patients.add(new Patient(id, name, age, gender, disease));
        System.out.println("Patient added successfully.");
    }

    public static void addDoctor() {
        sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Age: ");
        int age = sc.nextInt(); sc.nextLine();
        System.out.print("Gender: ");
        String gender = sc.nextLine();
        System.out.print("Specialization: ");
        String spec = sc.nextLine();
        System.out.print("Timing: ");
        String timing = sc.nextLine();
        System.out.print("Fees: ");
        double fees = sc.nextDouble();
        doctors.add(new Doctor(name, age, gender, spec, timing, fees));
        System.out.println("Doctor added successfully.");
    }

    public static void addMedicine() {
        sc.nextLine();
        System.out.print("Medicine name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Stock quantity: ");
        int stock = sc.nextInt();
        medicines.add(new Medicine(name, price, stock));
        System.out.println("Medicine added successfully.");
    }

    public static void searchDoctor() {
        sc.nextLine();
        System.out.print("Enter specialization to search: ");
        String spec = sc.nextLine();
        boolean found = false;
        for (Doctor d : doctors) {
            if (d.specialization.equalsIgnoreCase(spec)) {
                d.display();
                found = true;
            }
        }
        if (!found) System.out.println("No doctor found with that specialization.");
    }

    public static void searchMedicine() {
        sc.nextLine();
        System.out.print("Enter medicine name to search: ");
        String name = sc.nextLine();
        boolean found = false;
        for (Medicine m : medicines) {
            if (m.name.equalsIgnoreCase(name)) {
                m.display();
                found = true;
            }
        }
        if (!found) System.out.println("Medicine not found.");
    }

    public static void generateBill() {
        System.out.print("Enter Patient ID: ");
        int id = sc.nextInt();
        Patient selectedPatient = null;
        for (Patient p : patients) {
            if (p.id == id) {
                selectedPatient = p;
                break;
            }
        }
        if (selectedPatient == null) {
            System.out.println("Patient not found.");
            return;
        }

        double doctorFees = 0;
        System.out.println("Enter number of doctors consulted:");
        int docCount = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < docCount; i++) {
            System.out.print("Enter Doctor's Name: ");
            String docName = sc.nextLine();
            for (Doctor d : doctors) {
                if (d.name.equalsIgnoreCase(docName)) {
                    doctorFees += d.fees;
                    break;
                }
            }
        }

        double medicineCost = 0;
        System.out.println("Enter number of medicines taken:");
        int medCount = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < medCount; i++) {
            System.out.print("Enter Medicine Name: ");
            String medName = sc.nextLine();
            for (Medicine m : medicines) {
                if (m.name.equalsIgnoreCase(medName)) {
                    medicineCost += m.price;
                    break;
                }
            }
        }

        System.out.println("\n--- Bill Summary ---");
        System.out.println("Patient: " + selectedPatient.name);
        System.out.println("Disease: " + selectedPatient.disease);
        System.out.println("Doctor Fees: ₹" + doctorFees);
        System.out.println("Medicine Cost: ₹" + medicineCost);
        System.out.println("Total Bill: ₹" + (doctorFees + medicineCost));
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- Hospital Management Menu ---");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Add Medicine");
            System.out.println("4. Search Doctor by Specialization");
            System.out.println("5. Search Medicine");
            System.out.println("6. Generate Bill");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: addPatient(); break;
                case 2: addDoctor(); break;
                case 3: addMedicine(); break;
                case 4: searchDoctor(); break;
                case 5: searchMedicine(); break;
                case 6: generateBill(); break;
                case 7: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 7);
    }
}
