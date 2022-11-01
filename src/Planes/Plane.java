package Planes;

import java.awt.im.InputContext;
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
        setAvailable(Input.hasNextBoolean());
        System.out.println(" Message = ");
        setMessage(Input.nextLine());
    }

    public abstract int Capacity();
    public void setName (String name) {
        this.name = name;
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

    public void setAvailable (boolean available) {
        this.available = available;
    }

    public void setMessage (String message) {
        this.message = message;
    }

    @Override
    public String toString () {

        return "name " + name + "fuel_consumption " + fuel_consumption +
         "flight_range " + flight_range + "max_speed " + max_speed + "available " + available + message;
    }


    public String getName () {
        return name;
    }
}
