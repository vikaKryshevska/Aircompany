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
        System.out.print(" Вантажопідйомність - ");
        setCapacity(Input.nextInt());
        System.out.print(" Дата -  ");
        setDate(Input.next());
        System.out.print(" Регулярність - ");
        setRegularity(Input.nextInt());
        System.out.print(" Міста -  ");
        Scanner sc = new Scanner(System.in);
        setCities(sc.nextLine());
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

    @Override
    public int Capacity () {
        return getCapacity();
    }

    @Override
    public String toString() {
        return "\nВантажний літак" + super.toString()+ "\nвантажопідйомність - " + capacity +
                "\nдата - " + date + "\nрегулярність польотів - " + regularity + "\nміста - " + cities;
    }



}
