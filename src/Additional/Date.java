package Additional;

import Commands.Show.Specific.SearchByDate;
import Planes.AirFreighter;
import Planes.Aircompany;
import Planes.PassengerPlane;
import Planes.Plane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;

import static Commands.Show.Specific.SearchByDate.DateAdd;
import static Commands.Show.Specific.SearchByDate.StringToDate;

public class Date extends java.util.Date {

    @FXML
    private TextField date;
    @FXML
    private ListView<String> LstView = new ListView<String>();

    @FXML
    private Button back = new Button();

    @FXML
    private Button ok = new Button();

    @FXML
    public void EnterDate () throws IOException {

        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle (ActionEvent e) {
                if (!date.getText().isEmpty()) {
                    LstView.getItems().clear();
                    String stringDate = date.getText();
                    java.util.Date enteredDate = StringToDate(stringDate);
                    for (Plane pln : Aircompany.getPlanes()) {
                        if (pln instanceof PassengerPlane || pln instanceof AirFreighter) {
                            java.util.Date planeDate = null;
                            int i = 0;
                            if (pln instanceof PassengerPlane)
                                planeDate = SearchByDate.StringToDate(((PassengerPlane) pln).getDate());
                            else
                                planeDate = SearchByDate.StringToDate(((AirFreighter) pln).getDate());

                            while (!planeDate.after(enteredDate)) {
                                if (planeDate.equals(enteredDate) && (pln instanceof PassengerPlane)) {
                                    LstView.getItems().add(String.valueOf(((PassengerPlane) pln)));
                                }

                                else if ( enteredDate.equals(planeDate) && (pln instanceof AirFreighter)) {
                                    LstView.getItems().add(String.valueOf(((AirFreighter) pln)));
                                }

                                if (pln instanceof PassengerPlane)
                                    planeDate = DateAdd(planeDate, ((PassengerPlane) pln).getRegularity());
                                else
                                    planeDate = DateAdd(planeDate, ((AirFreighter) pln).getRegularity());

                            }
                        }
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
