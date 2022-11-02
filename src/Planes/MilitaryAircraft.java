package Planes;

import java.util.Scanner;

public class MilitaryAircraft extends Plane {

    private int aircrew;
    public MilitaryAircraft () {
        Plane();
        Scanner Input = new Scanner(System.in);
        System.out.println(" aircrew = ");
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
        return "\nMilitaryAircraft \n" + super.toString() + "\naircrew - " + aircrew;
    }
}
