package Planes;

import java.util.Scanner;

public class Airfreighter extends Plane{

    private int capacity;
    private String date;
    private int regularity;
    private  String cities;

    public Airfreighter () {
        Plane();
        Scanner Input = new Scanner(System.in);
        System.out.println(" setCapacity = ");
        setCapacity(Input.nextInt());
        System.out.println(" setDate = ");
        setDate(Input.nextLine());
        System.out.println(" setRegularity = ");
        setRegularity(Input.nextInt());
        System.out.println(" setCities = ");
        setCities(Input.nextLine());
    }

    public void setCapacity (int capacity) {
        this.capacity = capacity;
    }

    public void setDate (String date) {
        this.date = date;
    }

    public void setRegularity (int regularity) {
        this.regularity = regularity;
    }

    public void setCities (String cities) {
        this.cities = cities;
    }

    public int Capacity(){
        return capacity;
    }
    @Override
    public String toString() {
        return super.toString()+ " capacity - " + capacity + " Date - " + date + " regularity - " + regularity + " cities - " + cities;
    }



}
