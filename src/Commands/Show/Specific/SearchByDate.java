package Commands.Show.Specific;

import Planes.AirFreighter;
import Planes.Aircompany;
import Planes.PassengerPlane;
import Planes.Plane;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class SearchByDate {
    public static void ByDate(){

        System.out.println("Пошук за датою...");
        Date maxDate = StringToDate("2023-01-01");

        SimpleDateFormat dateInput = new SimpleDateFormat("yyyy-MM-dd");
        Scanner input = new Scanner(System.in);

        String strDate = input.nextLine();
        Date date = StringToDate(strDate);

        List<PassengerPlane> listPP= new ArrayList<>();
        List<AirFreighter> listAF= new ArrayList<>();
        for(Plane pln : Aircompany.getPlanes()) {
            if (pln instanceof PassengerPlane)
                listPP.add((PassengerPlane) pln);
            else if (pln instanceof AirFreighter)
                listAF.add((AirFreighter) pln);
        }

        System.out.println("\nПасажирські літаки, що відправляються заданої дати");
        for(PassengerPlane pln : listPP) {
            FindPlane(pln, maxDate, date);
        }

        System.out.println("\nВантажні літаки, що відправляються заданої дати");
        for(AirFreighter pln : listAF) {
            FindPlane(pln, maxDate, date);
        }

    }
    public static <T extends Plane> void FindPlane(T pln, Date maxDate, Date date) {

        Date planeDate = null;
        int i = 0;
        if (pln instanceof PassengerPlane)
            planeDate = StringToDate(((PassengerPlane)pln).getDate());
        else
            planeDate = StringToDate(((AirFreighter)pln).getDate());

        while (planeDate.before(maxDate) && planeDate.before(DateAdd(date,1))) {
            if (planeDate.equals(date)) {
                System.out.println(pln);
                i++;
            }
            if (pln instanceof PassengerPlane)
                planeDate = DateAdd(planeDate, ((PassengerPlane)pln).getRegularity());
            else
                planeDate = DateAdd(planeDate, ((AirFreighter)pln).getRegularity());

        }
        if(i==0)
            System.out.println("Відсутні");
    }

    public static Date DateAdd(Date date, int days)
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, days); //minus number would decrement the days
        return cal.getTime();
    }

    public static Date StringToDate(String s){

        Date result = null;
        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            result  = dateFormat.parse(s);
        }

        catch(ParseException e){
            e.printStackTrace();
        }
        return result ;
    }
}