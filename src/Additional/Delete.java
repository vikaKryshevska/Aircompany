package Additional;

import Additional.SQL.DataManipulation;
import Planes.Aircompany;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import java.io.IOException;
import java.sql.SQLException;

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


    public void Delete () {
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle (ActionEvent e) {
                final int selectedIdx = LstView.getSelectionModel().getSelectedIndex();
                if (selectedIdx != -1) {
                    String itemToRemove = LstView.getSelectionModel().getSelectedItem();
                    try {
                        DataManipulation.Delete(Aircompany.getPlanes().get(selectedIdx));
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    removePlane(selectedIdx);
                    LstView.getItems().remove(selectedIdx);
                }
            }
        };
        delete.setOnAction(event);
    }
}
