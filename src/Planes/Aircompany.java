package Planes;

import java.util.ArrayList;
import java.util.List;

public final class Aircompany {
    private static List<Plane> planes;

    public static List<Plane> getPlanes() {

        if(planes == null)
            planes = new ArrayList<>();

        return planes;
    }

    public static void removePlane (int index){
        Plane item = planes.get(index);
        if(item!=null){
            planes.remove(index);
            System.out.println("Was deleted");
        }
        else
            System.out.println("Can't be deleted");
    }


    public static void removePlaneByName (String name){

        for(Plane pln : planes){
            if(pln.getName().equals(name))
                planes.remove(pln);
        }

    }

}
