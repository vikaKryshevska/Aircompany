package Commands.Show.Specific;

import Planes.AirFreighter;
import Planes.Aircompany;
import Planes.PassengerPlane;
import Planes.Plane;

import java.util.Scanner;

public class SearchByCity {
    public static void ByCity(){

        System.out.println("Пошук за містом...");
        Scanner input = new Scanner(System.in);
        String city = input.nextLine();

        System.out.println("\nПасажирські літаки");

        if(Search(city, 1))
            System.out.println("Відсутні");

        System.out.println("\nВантажні літаки");

        if(Search(city,  2));
        System.out.println("Відсутні");

    }

    public static boolean Search(String city, int type) {

        boolean i = true;
        for (Plane pln : Aircompany.getPlanes()) {
            if (type == 1)
                if (pln instanceof PassengerPlane && ((PassengerPlane) pln).getCities().contains(city)) {
                    System.out.println(pln);
                    i = false;
                } else if (pln instanceof AirFreighter && ((AirFreighter) pln).getCities().contains(city)) {
                    System.out.println(pln);
                    i = false;
                }

        }
        return i;

    }


}
    
