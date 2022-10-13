package Commands.Show;
import Commands.Show.All.ShowAllPlanes;
import Commands.Show.All.ShowCapacity;
import Commands.Show.All.ShowSorted;
import StartCommands.MenuItems;

import java.util.Scanner;

public class Display implements MenuItems {
    @Override
    public  void execute(){
        Scanner input = new Scanner(System.in);

        System.out.println("1 -ShowAllPlanes 2-ShowSorted 3 -ShowCapacity ");

        switch (input.nextInt()){
            case 1:
                ShowAllPlanes.AllPlanes();
                break;

            case 2:
                ShowSorted.Sort();
                break;

            case 3:
                ShowCapacity.Capacity();
                break;

            default:
                System.out.println("Try again");
        }
    }
}