package watercraft_package;

public class LifeRaft extends Watercraft {


    @Override
    public void startMovement() {
        System.out.println("Gm ... just launch LifeRaft to the water... if necessary move raft by oars ... ");
    }

    @Override
    public void showClassification() {
        System.out.println("Inflatable liferaft");
        System.out.println("Rigid liferaft");
    }

    @Override
    public void generalInformation() {
        System.out.println("Number of passengers: ");
        System.out.println("Dimensions: 80 x 57 x 32cm");
        System.out.println("Weight: 40kg");
    }
}
