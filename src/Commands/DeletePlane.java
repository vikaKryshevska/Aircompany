package Commands;

import StartCommands.MenuItems;

import java.util.Scanner;

import static Planes.Aircompany.removePlane;
import static Planes.Aircompany.removePlaneByName;

public class DeletePlane implements MenuItems {
   // private static final Logger log = LogManager.getLogger(DeletePlane.class);
    @Override
    public  void execute(){

        Scanner input = new Scanner(System.in);
        System.out.println("Введіть назву або номер літака, який хоче видалити");
        //log.info("Deleting plane");
        String deleteItem = input.next();
        Boolean flag = Character.isDigit(deleteItem.charAt(0));
        if(flag)
            removePlane(Integer.parseInt(deleteItem)-1);
        else
            removePlaneByName(deleteItem);
    }
}
