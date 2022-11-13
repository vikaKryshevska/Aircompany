package Additional;
import Planes.*;
import java.sql.*;

public class Connection2SQL {

    public static void GetDataFromSQL () throws SQLException {
        String url = "jdbc:sqlserver://DESKTOP-KS63AMV:1433;DatabaseName=Aircompany;encrypt=true;trustServerCertificate=true";
        String user = "1";
        String password = "1111";
        Connection connection = null;
        try {
            Class.forName(
                    "com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Good connection");
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String sql = "SELECT * FROM plane INNER JOIN military ON plane.ID = military.ID";
        Statement statement = connection.createStatement();
        ResultSet res = statement.executeQuery(sql);
        while (res.next()){
            MilitaryAircraft plane = new MilitaryAircraft();
            plane.setAircrew(res.getInt("aircrew"));
            Set(plane, res);
        }

        sql = "SELECT * FROM plane INNER JOIN passenger ON plane.ID = passenger.ID";
        statement = connection.createStatement();
        res = statement.executeQuery(sql);
        while (res.next()){
            PassengerPlane plane = new PassengerPlane();
            plane.setFirst_class(res.getInt("first_class"));
            plane.setEconomy_class(res.getInt("economy_class"));
            plane.setBusiness_class(res.getInt("business_class"));
            plane.setDate(res.getString("date"));
            plane.setCities(res.getString("cities"));
            plane.setRegularity(res.getInt("regularity"));
            Set(plane, res);
        }

        sql = "SELECT * FROM plane INNER JOIN airfreighter ON plane.ID = airfreighter.ID";
        statement = connection.createStatement();
        res = statement.executeQuery(sql);
        while (res.next()){
            AirFreighter plane = new AirFreighter();
            plane.setDate(res.getString("date"));
            plane.setCities(res.getString("cities"));
            plane.setRegularity(res.getInt("regularity"));
            plane.setCapacity(res.getInt("capacity"));
            Set(plane, res);
        }

    }

    public static void Set (Plane plane, ResultSet res) throws SQLException {

        plane.setName(res.getString("name"));
        plane.setFuel_consumption(res.getInt("fuel_consumption"));
        plane.setFlight_range(res.getInt("flight_range"));
        plane.setMax_speed(res.getInt("max_speed"));
        plane.setAvailable(res.getInt("available"));
        plane.setMessage(res.getString("message"));
        Aircompany.getPlanes().add(plane);

    }
}
