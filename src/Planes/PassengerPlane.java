package Planes;

import java.util.Scanner;

public class PassengerPlane extends Plane{
    private int first_class;
    private int business_class;
    private int economy_class;
    private String date;
    private int regularity;
    private String cities;

    public PassengerPlane () {
        Plane();
        Scanner Input = new Scanner(System.in);
        System.out.println(" setFirst_class = ");
        setFirst_class(Input.nextInt());
        System.out.println(" setBusiness_class = ");
        setBusiness_class(Input.nextInt());
        System.out.println(" setEconomy_class = ");

        setEconomy_class(Input.nextInt());
        System.out.println(" setDate = ");
        setDate(Input.next());
        System.out.println(" setRegularity = ");
        setRegularity(Input.nextInt());
        System.out.println(" setCities = ");
        setCities(Input.next());
    }

    public void setFirst_class (int first_class) {
        this.first_class = first_class;
    }

    public void setBusiness_class (int business_class) {
        this.business_class = business_class;
    }

    public void setEconomy_class (int economy_class) {
        this.economy_class = economy_class;
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

    public String getDate () {
        return date;
    }

    public int getRegularity () {
        return regularity;
    }

    public String getCities () {
        return cities;
    }

    public int Capacity (){
        return  first_class + business_class + economy_class;
    }
    @Override
    public String toString () {
        return "\nPassengerPlane\n" + super.toString() +  "\nfirst_class - " + first_class +
                "\tbusiness_class - " + business_class +
                "\teconomy_class - " + economy_class +
                "\ndate - " + date +
                "\tregularity - " + regularity +
                "\ncities - " + cities;
    }
}
