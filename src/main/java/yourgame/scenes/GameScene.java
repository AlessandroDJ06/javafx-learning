package yourgame.scenes;

import javafx.scene.Scene;
import yourgame.core.Router;

public interface GameScene {
    Scene create(Router router);
}
