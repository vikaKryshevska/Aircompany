package Planes;

import java.util.Scanner;

public abstract class Plane {
    private String name;
    private float fuel_consumption;
    private int flight_range;
    private int max_speed;
    private boolean available;
    private String message;

    public void Plane () {//конструктор
        Scanner Input = new Scanner(System.in);
        System.out.println(" name = ");
        setName(Input.nextLine());
        System.out.println(" Fuel_consumption = ");
        setFuel_consumption(Input.nextFloat());
        System.out.println(" Flight_range = ");
        setFlight_range(Input.nextInt());
        System.out.println(" Max_speed = ");
        setMax_speed(Input.nextInt());
        System.out.println(" Available = ");
        setAvailable(Input.nextInt());
        setMessage("");
    }

    public abstract int Capacity();
    public void setName (String name) {
        this.name = name;
    }

    public float getFuel_consumption () {
        return fuel_consumption;
    }

    public void setFuel_consumption (float fuel_consumption) {
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
        this.message = message;
    }

    public int getFlight_range () {
        return flight_range;
    }
    public boolean isAvailable () {
        return available;
    }

    public String Available () {
        return available == true ?  "Is available" : "Si not available";
    }

    @Override
    public String toString () {

        return "name - " + name + "\tfuel_consumption - " + fuel_consumption +
         "\nflight_range - " + flight_range + "\tmax_speed - " + max_speed + "available - " + Available() +"\nmessage - " + message;
    }


    public String getName () {
        return name;
    }
}
