package Commands.Show;

import Commands.Show.Specific.SearchByCity;
import Commands.Show.Specific.SearchByDate;
import Commands.Show.Specific.SearchByFuelConsumption;
import StartCommands.MenuItems;

import java.util.Scanner;

public class SearchPlane extends SearchByDate implements MenuItems {
   // private static final Logger log = LogManager.getLogger(SearchPlane.class);

    @Override
    public  void execute(){
       Scanner input = new Scanner(System.in);
    ///    log.info("Searching plane");

        System.out.println("Пошук за \n 1 - містом 2 - датою 3 - споживанням пального ");

        switch (input.nextInt()){
            case 1 -> SearchByCity.ByCity();
            case 2 -> SearchByDate.ByDate();
            case 3 -> SearchByFuelConsumption.ByFuelConsumption();
            default -> System.out.println("Try again");
        }
    }
}