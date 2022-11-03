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
        System.out.print(" Назва - ");
        setName(Input.nextLine());
        System.out.print(" Споживання пального - ");
        setFuel_consumption(Input.nextFloat());
        System.out.print(" Дальність польоту - ");
        setFlight_range(Input.nextInt());
        System.out.print(" Максимальна швидкість - ");
        setMax_speed(Input.nextInt());
        System.out.print(" Доступність - ");
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
        return available == true ?  "є доступним" : "не є доступним";
    }

    public String getMessage () {
        if (!message.equals(""))
            return "Літак має повідомлення : \n" + message;
        else
            return "";
    }

    @Override
    public String toString () {

        return "\nНазва - " + name + "\tсоживання пального - " + fuel_consumption +
         "\nдальність польоту - " + flight_range + "\tмаксимальна швидкість - " + max_speed + "\nлітак " + Available() +getMessage();
    }


    public String getName () {
        return name;
    }
}
