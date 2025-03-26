import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class FirstAidGuidelines {
    private Map<Integer, String> emergencies = new HashMap<>();
    private Map<Integer, List<String>> guidelines = new HashMap<>();

    public FirstAidGuidelines() {
        emergencies.put(1, "CPR");
        emergencies.put(2, "Burn");
        emergencies.put(3, "Choking");
        emergencies.put(4, "Fracture");
        emergencies.put(5, "Heart Attack");
        emergencies.put(6, "Poisoning");

        guidelines.put(1, Arrays.asList(
                "1. Check if the person is breathing.",
                "2. If not, call emergency services immediately.",
                "3. Begin chest compressions: Push hard and fast at 100 per minute.",
                "4. Continue until medical help arrives."
        ));
        guidelines.put(2, Arrays.asList(
                "1. Run cool water over the burn for at least 10 minutes.",
                "2. Do not apply ice or butter.",
                "3. Cover with a sterile, non-stick bandage.",
                "4. Seek medical help if severe."
        ));
        guidelines.put(3, Arrays.asList(
                "1. Encourage coughing if the person can still breathe.",
                "2. If choking continues, perform the Heimlich maneuver.",
                "3. Call emergency services if needed."
        ));
        guidelines.put(4, Arrays.asList(
                "1. Immobilize the injured area.",
                "2. Apply a splint if necessary.",
                "3. Avoid moving the person unnecessarily.",
                "4. Seek medical attention."
        ));
        guidelines.put(5, Arrays.asList(
                "1. Call emergency services immediately.",
                "2. Keep the person calm and seated.",
                "3. If conscious, help them chew aspirin if not allergic.",
                "4. Perform CPR if they become unresponsive."
        ));
        guidelines.put(6, Arrays.asList(
                "1. Identify the poison if possible.",
                "2. Do not induce vomiting unless instructed.",
                "3. Call poison control or emergency services.",
                "4. Provide supportive care as needed."
        ));
    }

    public void showGuidelines() {
        System.out.println("Choose an emergency:");
        for (Map.Entry<Integer, String> entry : emergencies.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue());
        }

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (guidelines.containsKey(choice)) {
            System.out.println("First Aid Steps for " + emergencies.get(choice) + ":");
            for (String step : guidelines.get(choice)) {
                System.out.println(step);
            }
        } else {
            System.out.println("Invalid choice!");
        }
    }
}