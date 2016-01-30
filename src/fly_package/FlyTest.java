package fly_package;

import java.util.Scanner;

public class FlyTest {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        Fly[] fly = {new Boeing747(), new AirbusA330(), new AirbusA380()};

        System.out.println("If you like to get information about Boeing747 please press 1");
        System.out.println("If you like to get information about AirbusA330 please press 2");
        System.out.println("If you like to get information about AirbusA380 please press 3");

        int index = console.nextInt();

        fly[index - 1].showName();
        System.out.println(fly[index - 1].getSecurityLevel());
        System.out.println(fly[index - 1].getSpeed());
        System.out.println(fly[index - 1].getWeight());
        System.out.println(fly[index - 1].getNumberOfPassenger());
    }
}
