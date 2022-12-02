package Commands.Show.Specific;

import Planes.Aircompany;
import Planes.Plane;

import java.util.Scanner;

public class SearchByFuelConsumption {
    //private static final Logger log = LogManager.getLogger(SearchByFuelConsumption.class);

    public static void ByFuelConsumption() {
        //log.info("Search by fuel consumption");

        System.out.println("Пошук за споживанням пального");
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть початок діапазону ");
        int start = input.nextInt();
        System.out.println("Кінець діапазону ");
        int end = input.nextInt();
        System.out.println("Підходящі літаки: ");
        if(!Find(start,end)){
           // log.warn("No objects were found");
            System.out.println("Відсутні");
        }
    }


    public static boolean Find (int start, int end){
        boolean i = false;
        for(Plane pln : Aircompany.getPlanes())
            if(pln.getFuel_consumption()>start && pln.getFuel_consumption()<end) {
                System.out.println(pln);
                i=true;
            }
       return i;
    }

}