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
            case 1 -> ((PassengerPlane) plane).PassengerPlaneCreate();
            case 2 -> ((AirFreighter) plane).AirFreighterCreate();
            case 3 -> ((MilitaryAircraft)plane).MilitaryAircraftCreate();
            default -> System.out.println("Try again");
        }

        Aircompany.getPlanes().add(plane);
        System.out.println("Літак додано");

    }
}