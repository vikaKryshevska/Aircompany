package Planes;

import java.util.ArrayList;
import java.util.List;

public final class Aircompany {
    private static List<Plane> planes;
   // private static final Logger log = LogManager.getLogger(Aircompany.class);


    public static List<Plane> getPlanes() {

        if(planes == null)
            planes = new ArrayList<>();

        return planes;
    }

    public static void Clear(){
        planes.clear();
    }

    public static void AddMessageIndex (int index, String message){

        //log.info("Adding message");

        if(index >= 0 && index < planes.size()){
            planes.get(index).setMessage(message);
        }
        else{
           // log.warn("Message cannot be added");
            System.out.println("Не можливо знайти літак");}
    }

    public static void AddMessageName (String name, String message){

       // log.info("Adding message");
        for(Plane pln : planes)
            if(pln.getName().equals(name)){
                pln.setMessage(message);
                return;
            }
        //log.warn("Message cannot be added");
        System.out.println("Не можливо знайти літак");
    }

    public static void ChangeAvailabilityIndex (int index){
        //log.info("Changing availability");

        if(index >= 0 && index < planes.size()){
            int i =  !planes.get(index).isAvailable() ? 1:0;
            planes.get(index).setAvailable(i);
            System.out.println("Змінено");

        }
        else{
           // log.warn("Availability cannot be changed");
            System.out.println("Не можливо знайти літак");}
    }

    public static void ChangeAvailabilityName (String name){
        //log.info("Changing availability");

        for(Plane pln : planes)
            if(pln.getName().equals(name)){
                int i =  !pln.isAvailable() ? 1:0;
                pln.setAvailable(i);
                System.out.println("Змінено");
                return;
            }
        //log.warn("Availability cannot be changed");
        System.out.println("Не можливо знайти літак");
    }

    public static void Sort (){
        //log.info("Sorting");

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
        if(index >= 0 && index < planes.size()) {
            planes.remove(index);
            System.out.println("Літак було видалено");        }
        else {
          //  log.warn("Plane cannot be deleted");
            System.out.println("Літак не можливо видалити");}
    }
    public static void removePlaneByName (String name){

        for(Plane pln : planes)
            if(pln.getName().equals(name))
            {
                planes.remove(pln);
                System.out.println("Літак було видалено");
                return;
            }
            else{
             //   log.warn("Plane cannot be deleted");
                System.out.println("Не можливо видалити літак");}

    }

}


