package Additional;

import Commands.Show.All.ShowSorted;
import Planes.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import java.io.IOException;


public class Display {
    @FXML
    private ListView<String> LstView = new ListView<String>();
    @FXML
    private Button Show = new Button();
    @FXML
    private Button Sort = new Button();
    @FXML
    private Button Capacity = new Button();
    @FXML
    private Button back = new Button();


    public  void  Back() throws IOException {
        EventHandler<ActionEvent> event = new EventHandler<javafx.event.ActionEvent>() {
            public void handle(javafx.event.ActionEvent e) {
                try {Common.Back();}
                catch (IOException ex) {throw new RuntimeException(ex);}
            }
        };

        back.setOnAction(event);
    }

    public void setLstView () {

        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {Common.Show(LstView);}
        };
        Show.setOnAction(event);
    }

    public void Sort () {

        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            { ShowSorted.Sort(); Common.Show(LstView);}
        };
        Sort.setOnAction(event);
    }

    public void setCapacity () {
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {ShowCapacity();}
        };
        Sort.setOnAction(event);
    }

    public void ShowCapacity(){

        int pascapacity=0;
        int freightcapacity =0;
        LstView.getItems().clear();
        for(Plane pln: Aircompany.getPlanes()) {
            if (pln instanceof PassengerPlane)
                pascapacity+=pln.Capacity();
            else if (pln instanceof AirFreighter)
                freightcapacity+=pln.Capacity();
        }
        LstView.getItems().add("\nМісткість пасажирських літаків "+pascapacity+" місць");
        LstView.getItems().add("\nВантажопідйомність вантажних літаків "+freightcapacity+" тон");

    }

}
