class EmergencyService {
    public void requestService(int choice) {
        switch (choice) {
            case 1 -> System.out.println("Calling Ambulance...");
            case 2 -> System.out.println("Dialing 999 for Police...");
            case 3 -> System.out.println("Calling Fire Service...");
            default -> System.out.println("Invalid service choice.");
        }
    }
}
