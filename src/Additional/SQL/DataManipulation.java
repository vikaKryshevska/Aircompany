package Additional.SQL;

import Planes.AirFreighter;
import Planes.MilitaryAircraft;
import Planes.PassengerPlane;
import Planes.Plane;

import java.sql.*;
import java.util.Random;

public class DataManipulation {

    public static void Insert(Plane pln) throws SQLException {
        Connection conn = Connection2SQL.Connection();
        Statement statement = conn.createStatement();
        Random rand = new Random();
        int upperbound = 250000;
        int id =rand.nextInt(upperbound);
        statement.executeUpdate(
                "INSERT INTO plane " + "VALUES ( "+id +", '"+ pln.getName()+"', "
                +  pln.getFuel_consumption()+ ", "+pln.getFlight_range()+ ", " +
                pln.getMax_speed()+", '" + pln.isAvailable()+ "', '" + pln.getMessage()+"')");

        if(pln instanceof PassengerPlane){
            statement.executeUpdate(
                    "INSERT INTO passenger " + "VALUES ( "+id +"," + ((PassengerPlane)pln).getFirst_class()+
                            "," + ((PassengerPlane)pln).getBusiness_class()+"," + ((PassengerPlane)pln).getEconomy_class()+
                            ", '"+((PassengerPlane)pln).getDate() +"'," + ((PassengerPlane)pln).getRegularity()+", '" +
                            ((PassengerPlane)pln).getCities()+"')");

        }
        else if(pln instanceof AirFreighter){
            statement.executeUpdate(
                    "INSERT INTO airfreighter " + "VALUES ( "+id +"," + ((AirFreighter)pln).getCapacity()+
                            ", '"+((AirFreighter)pln).getDate() +"'," + ((AirFreighter)pln).getRegularity()+", '" +
                            ((AirFreighter)pln).getCities()+"')");
        }
        else
        {
            statement.executeUpdate(
                    "INSERT INTO military " + "VALUES ( "+id +"," + ((MilitaryAircraft)pln).getAircrew()+")");
        }
    }

    public static void Delete(Plane pln) throws SQLException {
        Connection conn = Connection2SQL.Connection();
        Statement st = conn.createStatement();

        if(pln instanceof PassengerPlane){
            st.executeUpdate("DELETE pp FROM passenger pp INNER JOIN plane p ON p.ID=pp.ID WHERE name ='"+ pln.getName() +"' AND max_speed = " + pln.getMax_speed() );
        }
        else if(pln instanceof AirFreighter){
            st.executeUpdate("DELETE pp FROM airfreighter pp INNER JOIN plane p ON p.ID=pp.ID WHERE name ='"+ pln.getName() +"' AND max_speed = " + pln.getMax_speed() );
        }
        else {
            st.executeUpdate("DELETE pp FROM military pp INNER JOIN plane p ON p.ID=pp.ID WHERE name ='"+ pln.getName() +"' AND max_speed = " + pln.getMax_speed() );
        }
        st.executeUpdate("DELETE FROM plane WHERE name = '"+ pln.getName() +"' AND max_speed = " + pln.getMax_speed() );

    }

    public static void Edit(Plane plane, String type) throws SQLException {
        Connection conn = Connection2SQL.Connection();

        String update, changeItem;
        update = type.equals("message") ? " use Aircompany UPDATE plane set message = '" :  "UPDATE plane set available = '" ;
        changeItem = type.equals("message") ? plane.getMessage() : String.valueOf(plane.isAvailable());
        PreparedStatement st = conn.prepareStatement(
                update + changeItem +
                        "' where name = '"+plane.getName() + "'");
        st.executeUpdate();
    }
}
