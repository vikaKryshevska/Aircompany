package Commands.Show.Specific;

import Planes.AirFreighter;
import Planes.Aircompany;
import Planes.PassengerPlane;
import Planes.Plane;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchByCity {
    public static void ByCity(){

        System.out.println("Пошук за містом...");
        Scanner input = new Scanner(System.in);
        String city = input.nextLine();
        List<PassengerPlane> listPP= new ArrayList<>();
        List<AirFreighter> listAF= new ArrayList<>();
        for(Plane pln : Aircompany.getPlanes()) {
            if (pln instanceof PassengerPlane)
                listPP.add((PassengerPlane) pln);
            else if (pln instanceof AirFreighter)
                listAF.add((AirFreighter) pln);
        }
        System.out.println("Pass planes\n");
        for(PassengerPlane pln : listPP) {
            if(pln.getCities().contains(city))
                System.out.println(pln);
        }
        System.out.println("AirFreighter planes\n");
        for(AirFreighter pln : listAF) {
            if(pln.getCities().contains(city))
                System.out.println(pln);
        }

    }
}