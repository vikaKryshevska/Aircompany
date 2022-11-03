package Commands;

import Planes.Aircompany;
import StartCommands.MenuItems;

import java.util.Scanner;

public class EditPlane implements MenuItems {
    @Override
    public  void execute(){

        Scanner input = new Scanner(System.in);
        System.out.println("Номер літака в якого бажаєте змінити доступність");

        int changeItem = input.nextInt();
        for (int j = 0; j < Aircompany.getPlanes().size(); j++)
            if(j == changeItem)
                Aircompany.ChangeAvailability(j);


        System.out.println("Змінено");
    }
}