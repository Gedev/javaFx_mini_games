import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent game = FXMLLoader.load(getClass().getResource("game.fxml"));
        Scene gameScene = new Scene(game);

        //Setting the stage
        stage.setTitle("The Fair Price");
        stage.setScene(gameScene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }

}
