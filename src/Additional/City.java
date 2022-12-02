package Additional;

import Planes.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class City {


    @FXML
    private TextField city;
    @FXML
    private ListView<String> LstView = new ListView<String>();

    @FXML
    private Button back = new Button();

    @FXML
    private Button ok = new Button();

    @FXML
    public void EnterMessage () throws IOException {
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle (javafx.event.ActionEvent e) {
                if (!city.getText().isEmpty()) {
                    LstView.getItems().clear();
                    for (Plane pln : Aircompany.getPlanes()) {
                            if (pln instanceof PassengerPlane && ((PassengerPlane) pln).getCities().contains(city.getText()))
                                LstView.getItems().add(String.valueOf(((PassengerPlane) pln)));
                            else if (pln instanceof AirFreighter && ((AirFreighter) pln).getCities().contains(city.getText()))
                                LstView.getItems().add(String.valueOf(((AirFreighter) pln)));
                    }

                }
            }

        };
        ok.setOnAction(event);

    }

    public  void  Back() throws IOException {
        EventHandler<ActionEvent> event = new EventHandler<javafx.event.ActionEvent>() {
            public void handle(javafx.event.ActionEvent e) {
                try {Common.Back();}
                catch (IOException ex) {throw new RuntimeException(ex);}
            }
        };

        back.setOnAction(event);
    }
}
