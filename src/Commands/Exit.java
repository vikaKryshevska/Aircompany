package Commands;

import StartCommands.MenuItems;

public class Exit implements MenuItems {
    @Override
    public  void execute(){

        System.out.println("Вихід з програми...");
        System.exit(0);
    }
}