class FireService implements EmergencyServiceStrategy {
    @Override
    public void requestHelp() {
        System.out.println("Calling Fire Service... Responding to emergency.");
    }

    @Override
    public String getServiceName() {
        return "Fire Service";
    }
}