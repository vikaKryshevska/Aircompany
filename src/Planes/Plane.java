package Planes;

import java.util.Scanner;

public abstract class Plane {
    private String name;
    private int fuel_consumption;
    private int flight_range;
    private int max_speed;
    private boolean available;
    private String message;

   // private static final Logger log = LogManager.getLogger(Plane.class);

    public Plane () {
    }

    public Plane (String name, int fuel_consumption, int flight_range, int max_speed, int available, String message) {
       // log.info("Creating plane");

        this.name = name;
        this.fuel_consumption = fuel_consumption;
        this.flight_range = flight_range;
        this.max_speed = max_speed;
        setAvailable(available);
        this.message = message;
    }

    public PassengerPlane PlaneCreate () {//конструктор
        Scanner Input = new Scanner(System.in);
        System.out.print(" Назва - ");
        setName(Input.nextLine());
        System.out.print(" Споживання пального - ");
        setFuel_consumption(Input.nextInt());
        System.out.print(" Дальність польоту - ");
        setFlight_range(Input.nextInt());
        System.out.print(" Максимальна швидкість - ");
        setMax_speed(Input.nextInt());
        System.out.print(" Доступність - ");
        setAvailable(Input.nextInt());
        setMessage("");
        return null;
    }

    public abstract int Capacity();
    public void setName (String name) {
        this.name = name;
    }

    public int getMax_speed () {
        return max_speed;
    }

    public int getFuel_consumption () {
        return fuel_consumption;
    }

    public void setFuel_consumption (int fuel_consumption) {
        this.fuel_consumption = fuel_consumption;
    }

    public void setFlight_range (int flight_range) {
        this.flight_range = flight_range;
    }

    public void setMax_speed (int max_speed) {
        this.max_speed = max_speed;
    }

    public void setAvailable (int available) {
        this.available = available == 0 ?  false : true;
    }

    public void setMessage (String message) {
        if(message == null)
            message="";
        this.message = message;
    }

    public int getFlight_range () {
        return flight_range;
    }
    public boolean isAvailable () {
        return available;
    }

    public String Available () {
        return available == true ?  "є доступним" : "не є доступним";
    }

    public String getMessage () {
        if (!message.equals(""))
            return   message;
        else
            return "";
    }

    @Override
    public String toString () {

        return "\nНазва - " + name + "\tспоживання пального - " + fuel_consumption +
                "\nдальність польоту - " + flight_range + "\tмаксимальна швидкість - " + max_speed + "\nлітак " + Available() + "\tПовідомлення  "+getMessage();
    }


    public String getName () {
        return name;
    }
}


