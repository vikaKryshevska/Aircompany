package Additional;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Window;

import java.io.IOException;

public class LogIn {

    @FXML
    private Button button = new Button();
    @FXML
    private Label wrongLogIn;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;

    Window window;

    @FXML
    public void userLogIn () throws IOException {

         GUI m = new GUI();

        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                if(username.getText().toString().equals("1")&& password.getText().toString().equals("1111")){
                    wrongLogIn.setVisible(true);
                    wrongLogIn.setText("Success!");
                    try {
                        m.changeScene("menu.fxml");
                    } catch (IOException event) {
                        throw new RuntimeException(event);
                    }
                }

                else if(username.getText().isEmpty()&& password.getText().isEmpty()){
                    wrongLogIn.setVisible(true);
                    wrongLogIn.setText("Enter data.");
                }

                else{
                    wrongLogIn.setVisible(true);
                    wrongLogIn.setText("Wrong username or password!");
                }
            }
        };

        // when button is pressed
        button.setOnAction(event);
    }

}
