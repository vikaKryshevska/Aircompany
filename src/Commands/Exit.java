package Commands;

import StartCommands.MenuItems;

public class Exit implements MenuItems {

    //private static final Logger log = LogManager.getLogger(Menu.class);

    @Override
    public  void execute(){

        //log.info("Exit program");
        System.out.println("Вихід з програми...");
        System.exit(0);
    }
}