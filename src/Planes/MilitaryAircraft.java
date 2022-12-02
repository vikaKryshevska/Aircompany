package Planes;

import java.util.Scanner;

public class MilitaryAircraft extends Plane {

    private int aircrew;

    public MilitaryAircraft () {
    }

    public MilitaryAircraft (String name, int fuel_consumption, int flight_range, int max_speed, int available, String message, int aircrew) {
        super(name, fuel_consumption, flight_range, max_speed, available, message);
        this.aircrew = aircrew;
    }

    public void MilitaryAircraftCreate () {
        PlaneCreate();
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

    public int getAircrew () {
        return aircrew;
    }
}


