package Commands.Show.All;

import Planes.Aircompany;
import Planes.Plane;

public class ShowSorted {
    public static void Sort(){

        Aircompany.Sort();
        System.out.println("Відсортовані за зростанням дальності польоту літаки");
        for(Plane pln : Aircompany.getPlanes())
            System.out.println(pln);

    }
}