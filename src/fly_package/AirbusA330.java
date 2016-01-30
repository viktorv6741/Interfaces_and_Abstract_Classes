package fly_package;

public class AirbusA330 implements Fly {

    private double speed = 990 ;
    private double weight = 123.100;
    private int numberOfPassengers = 440;
    private String securityLevel = new String("As of October 2015, the Airbus A330 had been involved in 22 major aviation occurrences,[179] including eight confirmed hull-loss accidents[180] and two hijackings, for a total of 339 fatalities.") ;


    public void showName() {
        System.out.println("AirbusA330");
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
