package Commands.Show.All;

import Planes.AirFreighter;
import Planes.Aircompany;
import Planes.Plane;

import java.util.ArrayList;
import java.util.List;

public class ShowCapacity {
    //private static final Logger log = LogManager.getLogger(ShowCapacity.class);

    public static void Capacity() {

        int capacity = 0;
       // log.info("Show capacity");

        List<Plane> listPP= new ArrayList<>();
        List<AirFreighter> listAF= new ArrayList<>();
        for(Plane pln : Aircompany.getPlanes()) {
            if (pln instanceof AirFreighter)
                listAF.add((AirFreighter) pln);
            else
                listPP.add(pln);
        }

        System.out.println("\nМісткість пасажирських літаків");
        for(Plane pln : listPP)
            capacity+=pln.Capacity();
        System.out.println(capacity);

        capacity=0;
        System.out.println("\nВантажопідйомність вантажних літаків");
        for(AirFreighter pln : listAF)
            capacity+=pln.Capacity();
        System.out.println(capacity);

    }
}
