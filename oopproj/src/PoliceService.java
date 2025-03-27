class PoliceService implements EmergencyServiceStrategy {
    @Override
    public void requestHelp() {
        System.out.println("Dialing 999 for Police... Assistance requested.");
    }

    @Override
    public String getServiceName() {
        return "Police";
    }
}
