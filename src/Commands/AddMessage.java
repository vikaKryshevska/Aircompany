package Commands;
import Planes.Aircompany;
import StartCommands.MenuItems;

import java.util.Scanner;

public class AddMessage implements MenuItems {
    @Override
    public  void execute(){

        System.out.println("Add Message");
        Scanner input = new Scanner(System.in);
        int item = input.nextInt();
        Aircompany.AddMessage(item);


    }
}