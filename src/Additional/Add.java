package Additional;

import Planes.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Add {

    @FXML private TextField name, fuel, range, speed, available, message;
    @FXML private TextField first, business, econom, datep, regularityp, citiesp;
    @FXML private TextField capacity, datef, regularityf, citiesf;
    @FXML private TextField aircrew;

    @FXML private Button back = new Button();
    @FXML private Button airfreighter = new Button();
    @FXML private Button military = new Button();
    @FXML private Button passenger = new Button();
    @FXML private Label wrong_data;



    @FXML
    public void addMilitary ()  {

        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                wrong_data.setText(" ");
                Plane plane = new MilitaryAircraft();
                StandardField(plane);
                if(aircrew.getText().isEmpty()){
                    wrong_data.setText("Required fields can't be empty");
                }
                else{
                    ((MilitaryAircraft)plane).setAircrew(Integer.parseInt(aircrew.getText()));
                    Add(plane);
                }

            }
        };

        // when button is pressed
        military.setOnAction(event);
    }

    @FXML
    private void AddPassenger(){
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                wrong_data.setText(" ");

                Plane plane = new PassengerPlane();
                StandardField(plane);
                if(datep.getText().isEmpty()||citiesp.getText().isEmpty()||
                    regularityp.getText().isEmpty()||first.getText().isEmpty()||
                    business.getText().isEmpty()||econom.getText().isEmpty()){
                    wrong_data.setText("Required fields can't be empty");
                }
                else{
                    ((PassengerPlane)plane).setDate(datep.getText());
                    ((PassengerPlane)plane).setRegularity(Integer.parseInt(regularityp.getText()));
                    ((PassengerPlane)plane).setCities(citiesp.getText());
                    ((PassengerPlane)plane).setFirst_class(Integer.parseInt(first.getText()));
                    ((PassengerPlane)plane).setEconomy_class(Integer.parseInt(econom.getText()));
                    ((PassengerPlane)plane).setBusiness_class(Integer.parseInt(business.getText()));

                    Add(plane);
                }

            }
        };

        // when button is pressed
        passenger.setOnAction(event);
    }
    @FXML
    private void AddAirFreighter(){
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                wrong_data.setText(" ");
                Plane plane = new AirFreighter();
                StandardField(plane);
                if(capacity.getText().isEmpty()||datef.getText().isEmpty()||citiesf.getText().isEmpty()||regularityf.getText().isEmpty()){
                    wrong_data.setText("Required fields can't be empty");
                }
                else{
                    ((AirFreighter)plane).setRegularity(Integer.parseInt(regularityf.getText()));
                    ((AirFreighter)plane).setCities(citiesf.getText());
                    ((AirFreighter)plane).setCapacity(Integer.parseInt(capacity.getText()));
                    ((AirFreighter)plane).setDate(datef.getText());
                    Add(plane);
                }

            }
        };

        // when button is pressed
        airfreighter.setOnAction(event);
    }

    private void Add(Plane pln)
    {
        wrong_data.setText("OK, plane created");
        Aircompany.getPlanes().add(pln);
        try {
            Common.Back();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    private void StandardField (Plane pln) {
        if(name.getText().isEmpty() || fuel.getText().isEmpty() || range.getText().isEmpty()
                || speed.getText().isEmpty() || available.getText().isEmpty()){
            wrong_data.setText("Required fields can't be empty");
            return;
        }
        pln.setName(name.getText());
        pln.setFlight_range(Integer.parseInt(range.getText()));
        pln.setMax_speed(Integer.parseInt(speed.getText()));
        pln.setAvailable(Integer.parseInt(available.getText()));
        pln.setFuel_consumption(Integer.parseInt(fuel.getText()));
        if(message.getText().isEmpty()){
            pln.setMessage(""); return;}
        pln.setMessage(message.getText());

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
