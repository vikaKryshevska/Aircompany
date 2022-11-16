package Additional;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class Find {

    @FXML
    private Button date = new Button();


    @FXML
    private Button city = new Button();
    @FXML
    private Button fuel = new Button();

    @FXML
    private Button back = new Button();


    @FXML
    public  void  ByDate() throws IOException{
        GUI m = new GUI();
        EventHandler<javafx.event.ActionEvent> event = new EventHandler<javafx.event.ActionEvent>() {
            public void handle(javafx.event.ActionEvent e) {
                try {
                    m.changeScene("date.fxml");
                } catch (IOException event) {
                    throw new RuntimeException(event);
                }

            }
        };
        // when button is pressed
        date.setOnAction(event);
    }

    @FXML
    public  void  FuelConsumption() throws IOException{
        GUI m = new GUI();
        EventHandler<javafx.event.ActionEvent> event = new EventHandler<javafx.event.ActionEvent>() {
            public void handle(javafx.event.ActionEvent e) {
                try {
                    m.changeScene("fuel.fxml");
                } catch (IOException event) {
                    throw new RuntimeException(event);
                }

            }
        };
        // when button is pressed
        fuel.setOnAction(event);
    }

    @FXML
    public  void  ByCity() throws IOException{
        GUI m = new GUI();
        EventHandler<javafx.event.ActionEvent> event = new EventHandler<javafx.event.ActionEvent>() {
            public void handle(javafx.event.ActionEvent e) {
                try {
                    m.changeScene("city.fxml");
                } catch (IOException event) {
                    throw new RuntimeException(event);
                }

            }
        };
        // when button is pressed
        city.setOnAction(event);
    }

    public  void  Back() throws IOException {
        GUI m = new GUI();
        EventHandler<ActionEvent> event = new EventHandler<javafx.event.ActionEvent>() {
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
}
