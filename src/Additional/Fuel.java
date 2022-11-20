package Additional;

import Planes.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Fuel {

    @FXML
    private TextField start;
    @FXML
    private TextField end;
    @FXML
    private ListView<String> LstView = new ListView<String>();

    @FXML
    private Button back = new Button();

    @FXML
    private Button ok = new Button();

    @FXML
    public void EnterRange () throws IOException {

        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle (ActionEvent e) {
                if (!start.getText().isEmpty()&&!end.getText().isEmpty()) {
                    LstView.getItems().clear();
                    int st = Integer.parseInt(start.getText());
                    int en = Integer.parseInt(end.getText());
                    for (Plane pln : Aircompany.getPlanes()) {
                        if (pln instanceof PassengerPlane)
                        { if(st< pln.getFuel_consumption() && pln.getFuel_consumption() <en)
                                 LstView.getItems().add(String.valueOf(((PassengerPlane) pln)));}
                        else if (pln instanceof AirFreighter)
                        {  if(st<pln.getFuel_consumption() && pln.getFuel_consumption() <en)
                                    LstView.getItems().add(String.valueOf(((AirFreighter) pln)));}
                        else
                        { if(st< pln.getFuel_consumption() &&pln.getFuel_consumption() <en)
                                   LstView.getItems().add(String.valueOf(((MilitaryAircraft) pln)));}
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
