package Commands.Show.Specific;

import Planes.AirFreighter;
import Planes.Aircompany;
import Planes.PassengerPlane;
import Planes.Plane;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class SearchByDate {
   // private static final Logger log = LogManager.getLogger(SearchByDate.class);

    public static void ByDate(){
        //log.info("Search by date");

        System.out.println("Пошук за датою...");
        Date maxDate = StringToDate("2023-01-01");

        SimpleDateFormat dateInput = new SimpleDateFormat("yyyy-MM-dd");
        Scanner input = new Scanner(System.in);

        String strDate = input.nextLine();
        Date date = StringToDate(strDate);


        System.out.println("\nПасажирські літаки, що відправляються заданої дати");
        if(!FindPlane( maxDate, date, 1) ){
               // log.warn("No objects were found");
                System.out.println("Відсутні");}


        System.out.println("\nВантажні літаки, що відправляються заданої дати");
        if(!FindPlane(maxDate, date, 2) )
              {           // log.warn("No objects were found");
                  System.out.println("Відсутні");}


    }
    public static boolean FindPlane( Date maxDate, Date date, int type) {

        Date planeDate = null;
        boolean i = false;
        for(Plane pln:Aircompany.getPlanes()){
            if(type==1 && pln instanceof PassengerPlane) {
                planeDate = StringToDate(((PassengerPlane)pln).getDate());}
            else  if(type==2 && pln instanceof AirFreighter)
                planeDate = StringToDate(((AirFreighter)pln).getDate());
            else
                planeDate=maxDate;
            while (planeDate.before(maxDate) && planeDate.before(DateAdd(date,1))) {
                if (planeDate.equals(date)) {
                    System.out.println(pln);
                    i=true;
                }
                if (pln instanceof PassengerPlane)
                    planeDate = DateAdd(planeDate, ((PassengerPlane)pln).getRegularity());
                else  if (pln instanceof AirFreighter)
                    planeDate = DateAdd(planeDate, ((AirFreighter)pln).getRegularity());
                else
                    continue;
            }
        }
        return i;
    }


    public static Date DateAdd(Date date, int days)
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, days); //minus number would decrement the days
        return cal.getTime();
    }

    public static Date StringToDate (String s)  {

        Date result = null;
        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            result  = dateFormat.parse(s);
        }

        catch(ParseException e){
          //  log.fatal("Entered incorrect date format");
            //try {SendEmail.sendEmail(SearchByDate.class.getSimpleName()+"\nError: "+e);
            ///} catch (MessagingException ex) {throw new RuntimeException(ex);}

            e.printStackTrace();
        }
        return result ;
    }
}