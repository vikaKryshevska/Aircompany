package Additional;

import Planes.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import java.io.IOException;

import static Planes.Aircompany.removePlane;

public class Delete {

    @FXML
    private Button Show = new Button();
    @FXML
    private ListView<String> LstView = new ListView<String>();
    @FXML
    private Button delete = new Button();

    @FXML
    private Button back = new Button();

    public  void  Back() throws IOException {
        GUI m = new GUI();
        EventHandler<javafx.event.ActionEvent> event = new EventHandler<javafx.event.ActionEvent>() {
            public void handle(javafx.event.ActionEvent e) {
                try {
                    m.changeScene("menu.fxml");
                } catch (IOException event) {
                    throw new RuntimeException(event);
                }

            }
        };
        // when button is pressed
        back.setOnAction(event);
    }


    public void setLstView () {

        Display m = new Display();
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {LstView.getItems().clear();
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





    public void Delete () {

        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle (ActionEvent e) {
                final int selectedIdx = LstView.getSelectionModel().getSelectedIndex();
                if (selectedIdx != -1) {
                    String itemToRemove = LstView.getSelectionModel().getSelectedItem();
                    removePlane(selectedIdx);
                    LstView.getItems().remove(selectedIdx);
                }
            }
        };
        delete.setOnAction(event);
    }
}
