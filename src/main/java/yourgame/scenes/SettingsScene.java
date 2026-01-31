package yourgame.scenes;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import yourgame.core.ImageRouter.ImageRouter;
import yourgame.core.SceneRouter.Router;
import yourgame.core.SceneRouter.Scenetype;

public class SettingsScene implements GameScene{
    public Scene create(Router router, ImageRouter imageRouter){
        Button startButton = new Button("MENU PAGE");
        startButton.setOnAction(e -> router.goTo(Scenetype.MENU));

        VBox layout = new VBox(20, startButton);
        layout.setStyle("-fx-alignment: center; -fx-padding: 50");

        return new Scene(layout, 800, 600);

    }
}
