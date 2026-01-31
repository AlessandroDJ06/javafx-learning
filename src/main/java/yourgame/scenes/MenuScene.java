package yourgame.scenes;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import yourgame.core.ImageRouter.ImagePaths;
import yourgame.core.ImageRouter.ImageRouter;
import yourgame.core.SceneRouter.Router;
import yourgame.core.SceneRouter.Scenetype;
import yourgame.ui.UniversalRectangleButton;

public class MenuScene implements GameScene{
    public Scene create(Router router,ImageRouter imageRouter){

        UniversalRectangleButton startButton = new UniversalRectangleButton(imageRouter,"SETTINGS");
        startButton.setOnAction(e -> router.goTo(Scenetype.SETTINGS));

        VBox layout = new VBox(20, startButton);
        layout.setStyle("-fx-alignment: center; -fx-padding: 50");

        return new Scene(layout, 800, 600);

    }
}
