package Commands.Show.Specific;

import Planes.AirFreighter;
import Planes.Aircompany;
import Planes.PassengerPlane;
import Planes.Plane;

import java.util.Scanner;

public class SearchByCity {
   // private static final Logger log = LogManager.getLogger(SearchByCity.class);

    public static void ByCity(){

        System.out.println("Пошук за містом...");
     //   log.info("Search by city");

        Scanner input = new Scanner(System.in);
        String city = input.nextLine();

        System.out.println("\nПасажирські літаки");

        if(!Search(city,1)){
            System.out.println("Відсутні");
          //  log.warn("No objects were found");
        }

        System.out.println("\nВантажні літаки");
        if(!Search(city,2)){
            System.out.println("Відсутні");
          //  log.warn("No objects were foundd");
        }
    }

    public static boolean Search (String city, int type)
    {
        boolean i =  false;
        for(Plane pln : Aircompany.getPlanes()) {
            if (pln instanceof PassengerPlane && type ==1)
            {
                if(((PassengerPlane)pln).getCities().contains(city))
                {
                    System.out.println(pln);
                    i=true;
                }
            }

            else if (pln instanceof AirFreighter)
                if(((AirFreighter)pln).getCities().contains(city)&& type ==2)
                {
                    System.out.println(pln);
                    i=true;
                }

        }
        return i;
    }
}