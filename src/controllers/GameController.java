package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GameController {
    int justPrice = 10;

    @FXML
    private TextField tfInputPrice;

    @FXML
    private Label displayResult;

    @FXML
    void submitPrice(ActionEvent event) {
        int inputPrice = Integer.parseInt(tfInputPrice.getText());
        if (inputPrice < justPrice) {
            displayResult.setText("C'est plus !");
        } else {
            displayResult.setText("C'est moins !");
        }

    }
}
