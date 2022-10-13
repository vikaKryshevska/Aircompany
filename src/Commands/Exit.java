package Commands;

import StartCommands.MenuItems;

public class Exit implements MenuItems {
    @Override
    public  void execute(){

        System.out.println("Exit");
        System.exit(0);
    }
}