package yourgame.scenes;

import javafx.scene.Scene;
import javafx.stage.Stage;
import yourgame.core.Router;

public interface GameScene {
    Scene create(Router router, Stage stage);
}
