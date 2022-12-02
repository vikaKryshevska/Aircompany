package Additional;

import Planes.*;
import javafx.scene.control.ListView;

import java.io.IOException;

public class Common {

    public static void  Back () throws IOException {
        GUI m = new GUI();
                try {
                    m.changeScene("Resource/menu.fxml");
                } catch (IOException event) {
                    throw new RuntimeException(event);
                }


    }


    public static void Show (ListView<String> LstView) {
        LstView.getItems().clear();
        for (Plane pln : Aircompany.getPlanes()) {
            if (pln instanceof PassengerPlane)
                LstView.getItems().add(String.valueOf(((PassengerPlane) pln)));
            else if (pln instanceof AirFreighter)
                LstView.getItems().add(String.valueOf(((AirFreighter) pln)));
            else
                LstView.getItems().add(String.valueOf(((MilitaryAircraft) pln)));
        }

    }

}
