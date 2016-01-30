package fly_package;

public class Boeing747 implements Fly {

    private double speed = 988;
    private double weight = 180.8;
    private int numberOfPassengers = 524;
    private String securityLevel = new String("As of October 2015, the 747 has been involved in 131 accidents or incidents,[200] including 60 hull-loss accidents,[201] resulting in 3,718 fatalities. The 747 has been in 31 hijackings, which caused 24 fatalities.[202]") ;


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
