package Additional;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;

import static Planes.Aircompany.AddMessageIndex;

public class AddM {

    @FXML
    private TextField message;
    @FXML
    private ListView<String> LstView = new ListView<String>();
    @FXML
    private Button ok = new Button();
    @FXML
    private Button Show = new Button();
    @FXML
    private Button back = new Button();


    @FXML
    public void EnterMessage () throws IOException {
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle (javafx.event.ActionEvent e) {
                if (!message.getText().isEmpty()) {
                    final int selectedIdx = LstView.getSelectionModel().getSelectedIndex();
                    if (selectedIdx != -1) {
                        AddMessageIndex(selectedIdx, message.getText());
                        try {Common.Back();}
                        catch (IOException ex) {throw new RuntimeException(ex);}
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

    public void setLstView () {
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {Common.Show(LstView);}
        };
        Show.setOnAction(event);
    }

}