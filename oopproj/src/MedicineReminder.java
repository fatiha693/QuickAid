import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class MedicineReminder {
    private List<String> reminders = new ArrayList<>();

    public void addReminder(String medicine, String time) {
        reminders.add(medicine + " at " + time);
        System.out.println("Reminder set successfully.");
    }

    public void viewReminders() {
        if (reminders.isEmpty()) {
            System.out.println("No reminders set.");
        } else {
            System.out.println("Medicine Reminders:");
            for (String reminder : reminders) {
                System.out.println(reminder);
            }
        }
    }
}
