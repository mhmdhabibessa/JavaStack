public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring()  {
    	return " Iphons  "+this.getVersionNumber()+"says: " + this.getRingTone();

    }
    @Override
    public String unlock() {
    	return "Unlocking via facial recognations";
    }
    @Override
    public void displayInfo() {
    	
    	System.out.println("IPhone versions "+this.getVersionNumber());
    }
}
