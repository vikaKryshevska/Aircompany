package Commands.Show.All;

import Planes.Aircompany;
import Planes.Plane;

public class ShowCapacity {
    public static void Capacity() {

        int capacity = 0;
        for(Plane pln : Aircompany.getPlanes() )
            capacity+= pln.Capacity();
        System.out.println("Загальна місткісь літаків авіакомпанії - " + capacity);

    }
}
