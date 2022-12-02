package Commands;

import Planes.*;
import StartCommands.MenuItems;

import java.util.Scanner;

public class AddPlane implements MenuItems {
 //   private static final Logger log = LogManager.getLogger(AddPlane.class);

    @Override
    public  void execute() {

        Plane plane = null;
        Scanner input = new Scanner(System.in);
        System.out.println("Тип літака, який хочете додати \n 1 - пасажирський  2 - вантажний  3 - військовий");

       // log.info("Adding plane");

        switch (input.nextInt()) {
            case 1 -> {plane  = new PassengerPlane();
                         plane.PlaneCreate();}
            case 2 -> {plane = new AirFreighter();
                        plane.PlaneCreate();}
            case 3 -> {plane = new MilitaryAircraft();
                        plane.PlaneCreate();}
            default -> System.out.println("Try again");
        }

        Aircompany.getPlanes().add(plane);
        System.out.println("Літак додано");

    }
}