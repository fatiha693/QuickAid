import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static UserAuthenticator userDatabase = new UserDatabase();
    private static Scanner scanner = new Scanner(System.in);
    private static EmergencyServiceManager emergencyService = new EmergencyServiceManager();
    private static HospitalFinder hospitalFinder = new HospitalFinder();
    private static EmergencyContacts emergencyContacts = new EmergencyContacts();
    private static FirstAidGuidelines firstAidGuidelines = new FirstAidGuidelines();
    private static MedicineReminder medicineReminder = new MedicineReminder();
    private static User currentUser = null;

    public static void main(String[] args) {
        while (true) {
            if (currentUser == null) {
                showLoginMenu();
            } else {
                showMainMenu();
            }
        }
    }



    private static void showLoginMenu() {
        System.out.println("\n--- Emergency Support System ---");
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                registerUser();
                break;
            case 2:
                loginUser();
                break;
            case 3:
                System.out.println("Exiting the system. Goodbye!");
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void registerUser() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (userDatabase.registerUser(username, password)) {
            System.out.println("Registration successful!");
        }
    }

    private static void loginUser() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (userDatabase.authenticateUser(username, password)) {
            currentUser = new User(username, password);
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }
    }


    private static void showMainMenu() {
        System.out.println("\n--- Emergency Support System ---");
        System.out.println("1. Emergency Services");
        System.out.println("2. Hospital Finder");
        System.out.println("3. Emergency Contacts");
        System.out.println("4. First Aid Guidelines");
        System.out.println("5. Medicine Reminders");
        System.out.println("6. Logout");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                handleEmergencyServices();
                break;
            case 2:
                handleHospitalFinder();
                break;
            case 3:
                handleEmergencyContacts();
                break;
            case 4:
                firstAidGuidelines.showGuidelines();
                break;
            case 5:
                handleMedicineReminders();
                break;
            case 6:
                currentUser = null;
                System.out.println("Logged out successfully.");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void handleEmergencyServices() {
        System.out.println("\nEmergency Services:");
        System.out.println("1. Ambulance");
        System.out.println("2. Police");
        System.out.println("3. Fire Service");
        System.out.print("Enter your choice: ");

        int serviceChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        emergencyService.requestService(serviceChoice);
    }

    private static void handleHospitalFinder() {
        hospitalFinder.listAreas();
        System.out.print("Enter the area number: ");
        int areaChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String area = hospitalFinder.getAreaByIndex(areaChoice);
        if (area != null) {
            hospitalFinder.findHospitals(area);
        } else {
            System.out.println("Invalid area selection.");
        }
    }

    private static void handleEmergencyContacts() {
        System.out.println("\nEmergency Contacts:");
        System.out.println("1. Add Contact");
        System.out.println("2. View Contacts");
        System.out.print("Enter your choice: ");

        int contactChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (contactChoice) {
            case 1:
                System.out.print("Enter contact name: ");
                String name = scanner.nextLine();
                System.out.print("Enter contact number: ");
                String number = scanner.nextLine();
                emergencyContacts.addContact(name, number);
                break;
            case 2:
                emergencyContacts.viewContacts();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    private static void handleMedicineReminders() {
        System.out.println("\nMedicine Reminders:");
        System.out.println("1. Add Reminder");
        System.out.println("2. View Reminders");
        System.out.print("Enter your choice: ");

        int reminderChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (reminderChoice) {
            case 1:
                System.out.print("Enter medicine name: ");
                String medicine = scanner.nextLine();
                System.out.print("Enter time for reminder: ");
                String time = scanner.nextLine();
                medicineReminder.addReminder(medicine, time);
                break;
            case 2:
                medicineReminder.viewReminders();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
