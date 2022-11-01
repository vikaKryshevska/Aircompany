package Commands;
import Planes.*;
import StartCommands.MenuItems;

import java.util.Scanner;

public class AddPlane implements MenuItems {
    @Override
    public  void execute() {

        Plane plane = null;
        Scanner input = new Scanner(System.in);
        System.out.println("Тип літака, який хочете додати \n 1 - пасажирський  2 - вантажний  3 - військовий");

        switch (input.nextInt()) {
            case 1 -> plane = new PassengerPlane();
            case 2 -> plane = new Airfreighter();
            case 3 -> plane = new MilitaryAircraft();
            default -> System.out.println("Try again");
        }

        Aircompany.getPlanes().add(plane);
        System.out.println("Add Plane");

    }
}