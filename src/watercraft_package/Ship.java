package watercraft_package;

public class Ship extends Watercraft {

    @Override
    public void showClassification() {
        System.out.println("Chemical Tankers");
        System.out.println("Liquefied Gas Tankers");
        System.out.println("Tankers");
        System.out.println("Sailing vessel)");
        System.out.println("Passenger Ships");
        System.out.println("Rolker ");
        System.out.println("Container Ships");
        System.out.println("Bulkers");
        System.out.println("Reefers");
    }


    @Override
    public void startMovement() {
        System.out.println("To star vessel need to have good cooperation between Bridge and Engine Room.");
        System.out.println("Before start need to prepare Main Engine");
        System.out.println("Put in parallel 2  Diesel Generators");
        System.out.println("Need to start Oil and Fuel Purifiers");
        System.out.println("Start necessary pumps(for example: Economizer Circulating Pump, Lubricating Oil pumps for Main Engine, etc)");
        System.out.println("Need to prepare and test Steering Gear");
        System.out.println("Check all parameters in Engine Room machinery (pressure, temperatures, levels)");
        System.out.println("Fill up all necessary check lists and documents");
        System.out.println("Only after switch control to Navigating Bridge");
    }

    @Override
    public void generalInformation() {
        System.out.println("IMO: 9706437");
        System.out.println("Gross Tonnage: 29700");
        System.out.println("Summer DWT: 51840 t");
    }
}
