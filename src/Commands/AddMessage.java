package Commands;

import StartCommands.MenuItems;

import java.util.Scanner;

import static Planes.Aircompany.AddMessageIndex;
import static Planes.Aircompany.AddMessageName;

public class AddMessage implements MenuItems {
   // private static final Logger log = LogManager.getLogger(AddMessage.class);

    @Override
    public  void execute(){

        System.out.println("Введіть назву або номер літака, до якого бажаєте додати повідомлення");
        Scanner input = new Scanner(System.in);
        String Item = input.next();
       // log.info("Adding message");

        System.out.println("Введіть повідомлення");
        String message = input.next();
        Boolean flag = Character.isDigit(Item.charAt(0));
        if(flag)
            AddMessageIndex(Integer.parseInt(Item)-1, message);
        else
            AddMessageName(Item, message);


    }
}
    

    
