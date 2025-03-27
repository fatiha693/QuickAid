

class AmbulanceService implements EmergencyServiceStrategy {
    @Override
    public void requestHelp() {
        System.out.println("Calling Ambulance... Help is on the way!");
    }

    @Override
    public String getServiceName() {
        return "Ambulance";
    }
}