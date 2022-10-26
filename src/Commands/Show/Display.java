package Commands.Show;
import Commands.Show.All.*;
import StartCommands.MenuItems;

import java.util.Scanner;

public class Display extends ShowSorted implements MenuItems {
    @Override
    public  void execute(){
        Scanner input = new Scanner(System.in);

        System.out.println("Показати \n 1 - всі літаки 2 - відсортовані 3 - місткість");

        switch (input.nextInt()){
            case 1 -> ShowAllPlanes.AllPlanes();
            case 2 -> ShowSorted.Sort();
            case 3 -> ShowCapacity.Capacity();
            default -> System.out.println("Try again");
        }
    }
}