package Additional;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;
public class Menu {

    @FXML
    private Button logout;

    @FXML
    private Button Display;

    @FXML
    private Button Add;
    @FXML
    private Button Edit;
    @FXML
    private Button Delete;
    @FXML
    private Button AddM;
    @FXML
    private Button Find;


    @FXML
    public  void  userLogOut() throws IOException{
        GUI m = new GUI();
        StartCommands.Menu menu = new StartCommands.Menu();
        EventHandler<javafx.event.ActionEvent> event = new EventHandler<javafx.event.ActionEvent>() {
            public void handle(ActionEvent e) {
                menu.execute(7);
                }
        };
        // when button is pressed
        logout.setOnAction(event);
    }



    @FXML
    public  void  Display() throws IOException{
        GUI m = new GUI();
        EventHandler<javafx.event.ActionEvent> event = new EventHandler<javafx.event.ActionEvent>() {
            public void handle(javafx.event.ActionEvent e) {
                try {
                    m.changeScene("Resource/display.fxml");
                } catch (IOException event) {
                    throw new RuntimeException(event);
                }

            }
        };
        // when button is pressed
        Display.setOnAction(event);
    }

    @FXML
    public  void  Add() throws IOException{
        GUI m = new GUI();
        EventHandler<javafx.event.ActionEvent> event = new EventHandler<javafx.event.ActionEvent>() {
            public void handle(javafx.event.ActionEvent e) {
                try {m.changeScene("Resource/add.fxml");}
                catch (IOException event) {throw new RuntimeException(event);}
            }
        };
        Add.setOnAction(event);
    }

    @FXML
    public  void  Delete() throws IOException{
        GUI m = new GUI();
        EventHandler<javafx.event.ActionEvent> event = new EventHandler<javafx.event.ActionEvent>() {
            public void handle(javafx.event.ActionEvent e) {
                try {m.changeScene("Resource/delete.fxml");}
                catch (IOException event) {throw new RuntimeException(event);}
            }
        };
        Delete.setOnAction(event);
    }

    @FXML
    public  void  Edit() throws IOException{
        GUI m = new GUI();
        EventHandler<javafx.event.ActionEvent> event = new EventHandler<javafx.event.ActionEvent>() {
            public void handle(javafx.event.ActionEvent e) {
                try {m.changeScene("Resource/edit.fxml");}
                catch (IOException event) {throw new RuntimeException(event);}
            }
        };
        Edit.setOnAction(event);
    }


    @FXML
    public  void  AddM() throws IOException{
        GUI m = new GUI();
        EventHandler<javafx.event.ActionEvent> event = new EventHandler<javafx.event.ActionEvent>() {
            public void handle(javafx.event.ActionEvent e) {
                try {m.changeScene("Resource/addM.fxml");}
                catch (IOException event) {throw new RuntimeException(event);}
            }
        };
        AddM.setOnAction(event);
    }

    @FXML
    public  void  Find() throws IOException{
        GUI m = new GUI();
        EventHandler<javafx.event.ActionEvent> event = new EventHandler<javafx.event.ActionEvent>() {
            public void handle(javafx.event.ActionEvent e) {
                try {m.changeScene("Resource/find.fxml");}
                catch (IOException event) {throw new RuntimeException(event);}
            }
        };
        Find.setOnAction(event);
    }
}