package Commands.Show.Specific;
import Planes.Aircompany;
import Planes.Plane;

import java.util.Scanner;

public class SearchByFuelConsumption {
    public static void ByFuelConsumption(){

        System.out.println("Пошук за споживанням пального");
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть початок діапазону ");
        int start = input.nextInt();
        System.out.println("Кінець діапазону ");
        int end = input.nextInt();
        System.out.println("Підходящі літаки: ");
        boolean i = false;
        for(Plane pln : Aircompany.getPlanes())
            if(pln.getFuel_consumption()>start && pln.getFuel_consumption()<end) {
                System.out.println(pln);
                i=true;
            }
        if(i)
            System.out.println("Відсутні");
    }
}