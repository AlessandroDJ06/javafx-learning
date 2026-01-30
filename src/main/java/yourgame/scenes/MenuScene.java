package yourgame.scenes;

import javafx.scene.Scene;
import javafx.stage.*;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import yourgame.core.Router;
import yourgame.core.Scenetype;

public class MenuScene implements GameScene{
    public Scene create(Router router, Stage stage){
        stage.setTitle("Menu page");
        Button startButton = new Button("Start Game");
        startButton.setOnAction(e -> router.goTo(Scenetype.MENU));

        VBox layout = new VBox(20, startButton);
        layout.setStyle("-fx-alignment: center; -fx-padding: 50");

        return new Scene(layout, 800, 600);

    }
}
