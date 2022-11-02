package Planes;

import java.util.*;

public final class Aircompany {
    private static List<Plane> planes;

    public static List<Plane> getPlanes() {

        if(planes == null)
            planes = new ArrayList<>();

        return planes;
    }

    public static void AddMessage (int index){

        if(planes.get(index)!=null){
            System.out.println("Input message");
            Scanner input = new Scanner(System.in);
            planes.get(index).setMessage(input.next());
        }
        else
            System.out.println("Can't be added");
    }

    public static void Sort (){

        List<Plane> pln = planes;
        for (int i = 0; i < pln.size(); i++) {
            for (int j = i + 1; j < pln.size(); j++) {
                Plane temp = null;
                if (pln.get(j).getFlight_range() < pln.get(i).getFlight_range()) {
                    temp = pln.get(i);
                    pln.set(i, pln.get(j));
                    pln.set(j, temp);
                }
            }
        }
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

        for(Plane pln : planes)
            if(pln.getName().equals(name))
            {
                planes.remove(pln);
                return;
            }


    }

}
