package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class Controller {

    @FXML
    private TextArea mitTextFelt;

    @FXML
    protected void minAction(ActionEvent event) {
        int a = 2;
        int b = 3;
        int res = a + b;
        System.out.println("Hello World");
        mitTextFelt.appendText("Hello World"+ res +"\n");

    }


}
