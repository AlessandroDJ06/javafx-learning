package yourgame.scenes;

import javafx.scene.Scene;
import yourgame.core.ImageRouter.ImageRouter;
import yourgame.core.SceneRouter.Router;

public interface GameScene {
    Scene create(Router router,ImageRouter imageRouter);
}
