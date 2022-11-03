package Commands;
import Planes.Aircompany;
import StartCommands.MenuItems;

import java.util.Scanner;

import static Planes.Aircompany.*;

public class AddMessage implements MenuItems {
    @Override
    public  void execute(){

        System.out.println("Введіть назву або номер літака, до якого бажаєте додати повідомлення");
        Scanner input = new Scanner(System.in);
        String Item = input.next();
        Boolean flag = Character.isDigit(Item.charAt(0));
        if(flag)
            AddMessageIndex(Integer.parseInt(Item)-1);
        else
            AddMessageName(Item);


    }
}