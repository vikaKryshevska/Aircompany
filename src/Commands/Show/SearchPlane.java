package Commands.Show;
import Commands.Show.Specific.SearchByCity;
import Commands.Show.Specific.SearchByDate;
import Commands.Show.Specific.SearchByFuelConsumption;
import StartCommands.Menu;
import StartCommands.MenuItems;

import java.util.Scanner;

public class SearchPlane extends SearchByDate implements MenuItems {
    @Override
    public  void execute(){
        Scanner input = new Scanner(System.in);

        System.out.println("Пошук за \n 1 - містом 2 - датою 3 - споживанням пального ");

        switch (input.nextInt()){
            case 1:
                SearchByCity.ByCity();
                break;
            case 2:
                SearchByDate.ByDate();
                break;

            case 3:
                SearchByFuelConsumption.ByFuelConsumption();
                break;

            default:
                System.out.println("Try again");
        }
    }
}