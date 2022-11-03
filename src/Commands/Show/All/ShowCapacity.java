package Commands.Show.All;

import Planes.*;

import java.util.ArrayList;
import java.util.List;

public class ShowCapacity {
    public static void Capacity() {

        int capacity = 0;

        List<Plane> listPP= new ArrayList<>();
        List<AirFreighter> listAF= new ArrayList<>();
        for(Plane pln : Aircompany.getPlanes()) {
            if (pln instanceof AirFreighter)
                listAF.add((AirFreighter) pln);
            else
                listPP.add(pln);
        }

        System.out.println("Місткість пасажирських літаків\n");
        for(Plane pln : listPP)
            capacity+=pln.Capacity();
        System.out.println(capacity);

        capacity=0;
        System.out.println("Вантажопідйомність вантажних літаків\n");
        for(AirFreighter pln : listAF)
            capacity+=pln.Capacity();
        System.out.println(capacity);

    }
}
