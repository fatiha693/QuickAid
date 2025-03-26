import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class HospitalFinder {
    private static final Map<String, List<String>> hospitalData = new HashMap<>();

    static {
        hospitalData.put("Uttara", Arrays.asList("A Hospital", "B Hospital"));
        hospitalData.put("Dhanmondi", Arrays.asList("C Hospital", "D Hospital"));
        hospitalData.put("Mirpur", Arrays.asList("E Hospital", "F Hospital"));
        hospitalData.put("Gulshan", Arrays.asList("G Hospital", "H Hospital"));
        // Add more areas and hospitals here...
    }

    public void findHospitals(String area) {
        if (hospitalData.containsKey(area)) {
            System.out.println("Hospitals in " + area + ":");
            for (String hospital : hospitalData.get(area)) {
                System.out.println("- " + hospital);
            }
        } else {
            System.out.println("No hospital data available for this area.");
        }
    }

    public void listAreas() {
        System.out.println("Available areas:");
        int i = 1;
        for (String area : hospitalData.keySet()) {
            System.out.println(i++ + ". " + area);
        }
    }

    public String getAreaByIndex(int index) {
        List<String> areas = new ArrayList<>(hospitalData.keySet());
        if (index > 0 && index <= areas.size()) {
            return areas.get(index - 1);
        }
        return null;
    }
}
