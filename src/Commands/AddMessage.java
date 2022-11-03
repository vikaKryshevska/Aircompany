package Commands;
import Planes.Aircompany;
import StartCommands.MenuItems;

import java.util.Scanner;

public class AddMessage implements MenuItems {
    @Override
    public  void execute(){

        System.out.println("Введіть номер літака до якого бажаєте додати повідомлення");
        Scanner input = new Scanner(System.in);
        int item = input.nextInt();
        Aircompany.AddMessage(item);


    }
}