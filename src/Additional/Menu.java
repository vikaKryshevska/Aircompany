package Additional;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class Menu {

    @FXML
    private Button logout;

    public  void  userLogOut(ActionEvent event) throws IOException{
        GUI m = new GUI();
        m.changeScene("GUI.fxml");
    }
}
