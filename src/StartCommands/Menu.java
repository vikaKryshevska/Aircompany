package StartCommands;
import Commands.*;
import Commands.Show.Display;
import Commands.Show.SearchPlane;

import java.util.LinkedHashMap;
import java.util.Map;


public class Menu  {

    private final Map<Integer, MenuItems> Items;
    private final String[]  commands = new String[7];

    public Menu(){
        Items = new LinkedHashMap<>();
        Items.put(1, new Display());
        Items.put(2, new SearchPlane());
        Items.put(3, new AddPlane());
        Items.put(4, new EditPlane());
        Items.put(5, new DeletePlane());
        Items.put(6, new AddMessage());
        Items.put(7, new Exit());
        commands[0] = " - Вивести всі літаки";
        commands[1] = " - Знайти літаки з параметрами";
        commands[2] = " - Додати літак";
        commands[3] = " - Редагувати параметри";
        commands[4] = " - Видалити";
        commands[5] = " - Додати повідомлення";
        commands[6] = " - Вийти";
    }

    public void execute(Integer command)
    {
        Items.getOrDefault(command, ()->System.out.println("Try again")).execute();
    }

    public void getAvailableCommands()
    {
        int i=0;
        for (int key: Items.keySet()){
            System.out.println(key + commands[i]);
            i++;
        }

    }
}