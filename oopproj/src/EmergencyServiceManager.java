import java.util.Map;
import java.util.HashMap;



class EmergencyServiceManager {
    private Map<Integer, EmergencyServiceStrategy> services;

    public EmergencyServiceManager() {
        services = new HashMap<>();
        services.put(1, new AmbulanceService());
        services.put(2, new PoliceService());
        services.put(3, new FireService());
    }

    public void requestService(int choice) {
        EmergencyServiceStrategy service = services.get(choice);
        if (service != null) {
            service.requestHelp();
        } else {
            System.out.println("Invalid service choice.");
        }
    }

    public void listAvailableServices() {
        services.forEach((key, service) ->
                System.out.println(key + ". " + service.getServiceName())
        );
    }
}