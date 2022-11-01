package Commands;
import StartCommands.MenuItems;

import java.util.Scanner;

import static Planes.Aircompany.removePlane;
import static Planes.Aircompany.removePlaneByName;

public class DeletePlane implements MenuItems {
    @Override
    public  void execute(){

        Scanner input = new Scanner(System.in);
        System.out.println("Тип літака, який хочете");

        String deleteItem = input.next();
        Boolean flag = Character.isDigit(deleteItem.charAt(0));
        if(flag)
            removePlane(Integer.parseInt(deleteItem));
        else
            removePlaneByName(deleteItem);
        System.out.println("Delete plane");
    }
}
