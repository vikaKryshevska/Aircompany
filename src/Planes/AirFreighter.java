package Planes;

import java.util.Scanner;

public class AirFreighter extends Plane{

    private int capacity;
    private String date;
    private int regularity;
    private  String cities;

    public AirFreighter () {
        Plane();
        Scanner Input = new Scanner(System.in);
        System.out.println(" setCapacity = ");
        setCapacity(Input.nextInt());
        System.out.println(" setDate = ");
        setDate(Input.next());
        System.out.println(" setRegularity = ");
        setRegularity(Input.nextInt());
        System.out.println(" setCities = ");
        setCities(Input.next());
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

    public int getCapacity () {
        return capacity;
    }

    public String getDate () {
        return date;
    }

    public int getRegularity () {
        return regularity;
    }

    public String getCities () {
        return cities;
    }

    public int Capacity(){
        return capacity;
    }
    @Override
    public String toString() {
        return "\nAirFreighter\n" + super.toString()+ "\ncapacity - " + capacity +
                "\nDate - " + date + "\tregularity - " + regularity + "\ncities - " + cities;
    }



}
