package Commands.Show.All;

import Planes.Aircompany;
import Planes.Plane;

import java.util.Scanner;

public class ShowAllPlanes {
  //  private static final Logger log = LogManager.getLogger(ShowAllPlanes.class);

    public static void AllPlanes(){
        System.out.println("Бажаєте вивести всі доступні літаки - 1");
        //log.info("Show planes");

        Scanner input = new Scanner(System.in);
        if (input.nextInt() == 1){
            for(Plane pln : Aircompany.getPlanes() )
                if(pln.isAvailable())
                    System.out.println(pln);
        }
        else{
            System.out.println("Усі літаки ");
            for(Plane pln : Aircompany.getPlanes() )
                System.out.println(pln);
        }
    }
}