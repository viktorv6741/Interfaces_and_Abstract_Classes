package fly_package;

public class AirbusA380 implements  Fly {

    private double speed = 1020;
    private double weight = 180;
    private int numberOfPassengers = 853 ;
    private String securityLevel = new String("The A380 has been involved in one aviation occurrence and no hull loss accidents with no fatalities as of January 2016, according to the Aviation Safety Network.") ;


    public void showName() {
        System.out.println("Boeing747");
    }

    public double getSpeed() {
        return this.speed;
    }

    public double getWeight() {
        return this.weight;
    }

    public int getNumberOfPassenger() {
        return this.numberOfPassengers;
    }

    public String getSecurityLevel() {
        return this.securityLevel;
    }

}
