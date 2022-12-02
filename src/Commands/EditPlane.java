package Commands;

import StartCommands.MenuItems;

import java.util.Scanner;

import static Planes.Aircompany.ChangeAvailabilityIndex;
import static Planes.Aircompany.ChangeAvailabilityName;

public class EditPlane implements MenuItems {
    //private static final Logger log = LogManager.getLogger(EditPlane.class);

    @Override
    public  void execute(){

      //  log.info("Editing plane");

        Scanner input = new Scanner(System.in);
        System.out.println("Введіть назву або номер літака, в якого бажаєте змінити доступність");

        String Item = input.next();
        Boolean flag = Character.isDigit(Item.charAt(0));
        if(flag)
            ChangeAvailabilityIndex(Integer.parseInt(Item)-1);
        else
            ChangeAvailabilityName(Item);

    }
}