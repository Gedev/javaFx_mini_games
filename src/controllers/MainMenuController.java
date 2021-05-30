package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MainMenuController {

    @FXML
    private Button ButtonLaunchTheJustPrice;

    @FXML
    void launchTheJustPrice(ActionEvent event) throws IOException {
        Parent menu = FXMLLoader.load(getClass().getClassLoader().getResource("UI/TheJustPrice/menu.fxml"));

        Scene menuScene = new Scene(menu);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setTitle("The Fair Price - game");
        window.setScene(menuScene);
        window.show();
    }

}

