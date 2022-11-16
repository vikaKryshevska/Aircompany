package Planes;

import java.util.*;

public final class Aircompany {
    private static List<Plane> planes;

    public static List<Plane> getPlanes() {

        if(planes == null)
            planes = new ArrayList<>();

        return planes;
    }

    public static void AddMessageIndex (int index, String message){

        if(planes.get(index)!=null){
            planes.get(index).setMessage(message);
        }
        else
            System.out.println("Не можливо знайти літак");
    }

    public static void AddMessageName (String name, String message){

        for(Plane pln : planes)
            if(pln.getName().equals(name)){
                pln.setMessage(message);
                return;
            }
        System.out.println("Не можливо знайти літак");
    }

    public static void ChangeAvailabilityIndex (int index){

        if(planes.get(index)!=null){
            int i =  !planes.get(index).isAvailable() ? 1:0;
            planes.get(index).setAvailable(i);
        }
        else
            System.out.println("Немає такого літака");
    }

    public static void ChangeAvailabilityName (String name){

        for(Plane pln : planes)
            if(pln.getName().equals(name)){
                int i =  !pln.isAvailable() ? 1:0;
                pln.setAvailable(i);
                return;
            }
        System.out.println("Не можливо знайти літак");
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
            System.out.println("Літак було видалено");        }
        else
            System.out.println("Літак не можливо видалити");
    }
    public static void removePlaneByName (String name){

        for(Plane pln : planes)
            if(pln.getName().equals(name))
            {
                planes.remove(pln);
                System.out.println("Літак було видалено");
                return;
            }
        System.out.println("Літак не можливо видалити");

    }

}
