package Commands;

import Planes.Aircompany;
import StartCommands.MenuItems;

import java.util.Scanner;

import static Planes.Aircompany.*;

public class EditPlane implements MenuItems {
    @Override
    public  void execute(){

        Scanner input = new Scanner(System.in);
        System.out.println("Введіть назву або номер літака, в якого бажаєте змінити доступність");

        String Item = input.next();
        Boolean flag = Character.isDigit(Item.charAt(0));
        if(flag)
            ChangeAvailabilityIndex(Integer.parseInt(Item)-1);
        else
            ChangeAvailabilityName(Item);

        System.out.println("Змінено");
    }
}