package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MenuController {
    @FXML
    private Button easyDifficultyButton;

    @FXML
    private Button mediumDifficultyButton;

    @FXML
    private Button hardDifficultyButton;
    private Object Node;

    public void changeSceneFromDifficultyButton(javafx.event.ActionEvent event) throws Exception {
        Parent game = FXMLLoader.load(getClass().getResource("../UI/TheJustPrice/game.fxml"));
        Scene gameScene = new Scene(game);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setTitle("The Fair Price - game");
        window.setScene(gameScene);
        window.show();
    }
}