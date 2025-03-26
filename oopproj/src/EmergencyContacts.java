import java.util.List;
import java.util.ArrayList;


public class EmergencyContacts {
    private List<String> contacts = new ArrayList<>();

    public void addContact(String name, String number) {
        if (contacts.size() < 5) {
            contacts.add(name + " - " + number);
            System.out.println("Contact added successfully.");
        } else {
            System.out.println("You can only store up to 5 contacts.");
        }
    }

    public void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No emergency contacts available.");
        } else {
            System.out.println("Emergency Contacts:");
            for (int i = 0; i < contacts.size(); i++) {
                System.out.println((i + 1) + ". " + contacts.get(i));
            }
        }
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No emergency contacts found.");
        } else {
            System.out.println("Your emergency contacts:");
            for (int i = 0; i < contacts.size(); i++) {
                System.out.println((i + 1) + ". " + contacts.get(i));
            }
        }
    }
}