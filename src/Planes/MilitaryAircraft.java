package Planes;

import java.util.Scanner;

public class MilitaryAircraft extends Plane {

    private int aircrew;
    public MilitaryAircraft () {
        Plane();
        Scanner Input = new Scanner(System.in);
        System.out.print(" Команда - ");
        setAircrew(Input.nextInt());
    }


    public void setAircrew (int aircrew) {
        this.aircrew = aircrew;
    }
    public int Capacity(){
        return aircrew;
    }
    @Override
    public String toString () {
        return "\nЛітак воєнного призначення" + super.toString() + "\nкоманда - " + aircrew;
    }
}
