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
    }

    public PassengerPlane (String name, int fuel_consumption, int flight_range, int max_speed, int available, String message, int first_class, int business_class, int economy_class, String date, int regularity, String cities) {
        super(name, fuel_consumption, flight_range, max_speed, available, message);
        this.first_class = first_class;
        this.business_class = business_class;
        this.economy_class = economy_class;
        this.date = date;
        this.regularity = regularity;
        this.cities = cities;
    }

    public void PassengerPlaneCreate () {
        PlaneCreate();
        Scanner Input = new Scanner(System.in);
        System.out.print(" Місць у першому класі -  ");
        setFirst_class(Input.nextInt());
        System.out.print(" Бізнес клас - ");
        setBusiness_class(Input.nextInt());
        System.out.print(" Економ клас - ");

        setEconomy_class(Input.nextInt());
        System.out.print(" Дата -  ");
        setDate(Input.next());
        System.out.print(" Регулярність - ");
        setRegularity(Input.nextInt());
        System.out.print(" Міста -  ");
        Scanner sc = new Scanner(System.in);
        setCities(sc.nextLine());
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

    public int getFirst_class () {
        return first_class;
    }

    public int getBusiness_class () {
        return business_class;
    }

    public int getEconomy_class () {
        return economy_class;
    }

    public int Capacity (){
        return  first_class + business_class + economy_class;
    }
    @Override
    public String toString () {
        return "\nПасажирський літак" + super.toString() +  "\nперший клас - " + first_class +
                "\tбізнес клас - " + business_class +
                "\tеконом клас - " + economy_class +
                "\nдата - " + date +
                "\nрегулярність - " + regularity +
                "\nміста - " + cities;
    }


}


