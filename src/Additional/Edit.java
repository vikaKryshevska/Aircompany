package Additional;

import Planes.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import java.io.IOException;

import static Planes.Aircompany.ChangeAvailabilityIndex;

public class Edit {


    @FXML
    private ListView<String> LstView = new ListView<String>();
    @FXML
    private Button change = new Button();
    @FXML
    private Button Show = new Button();
    @FXML
    private Button back = new Button();

    public void ChangeAvailability(){
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle (ActionEvent e) {
                final int selectedIdx = LstView.getSelectionModel().getSelectedIndex();
                if (selectedIdx != -1) {
                    String itemToRemove = LstView.getSelectionModel().getSelectedItem();
                    ChangeAvailabilityIndex(selectedIdx);
                    Exit();
                }
            }
        };

        change.setOnAction(event);

    }

    public  void Exit(){

        GUI m = new GUI();
        try {
            m.changeScene("menu.fxml");
        } catch (IOException event) {
            throw new RuntimeException(event);
        }
    }

    public void Back () throws IOException {

        EventHandler<ActionEvent> event = new EventHandler<javafx.event.ActionEvent>() {
            public void handle (javafx.event.ActionEvent e) {
              Exit();
            }
        };
        // when button is pressed
        back.setOnAction(event);
    }

    @FXML
    public void setLstView () {
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                LstView.getItems().clear();
                for(Plane pln: Aircompany.getPlanes()) {
                    if (pln instanceof PassengerPlane)
                        LstView.getItems().add(String.valueOf(((PassengerPlane) pln)));
                    else if (pln instanceof AirFreighter)
                        LstView.getItems().add(String.valueOf(((AirFreighter) pln)));
                    else
                        LstView.getItems().add(String.valueOf(((MilitaryAircraft) pln)));
                }
            }
        };
        Show.setOnAction(event);
    }

}
