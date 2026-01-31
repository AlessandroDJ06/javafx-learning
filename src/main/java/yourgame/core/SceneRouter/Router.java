package yourgame.core.SceneRouter;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import yourgame.core.ImageRouter.ImagePaths;
import yourgame.core.ImageRouter.ImageRouter;
import yourgame.scenes.GameScene;

import java.util.HashMap;

public class Router {
    private final Stage stage;
    private final HashMap<Scenetype, Scene> loadedScenes = new HashMap<>();
    private final ImageRouter imageRouter;

    public Router(Stage stage, ImageRouter imageRouter){
        this.stage = stage;
        this.imageRouter = imageRouter;
    }

    public void goTo(Scenetype type){
        Scene scene = loadedScenes.get(type);
        if (scene == null) {
            GameScene gameScene = type.createScene();
            scene = gameScene.create(this,imageRouter);
            loadedScenes.put(type,scene);
        }

        stage.setScene(scene);
        stage.setTitle("Application");
        stage.getIcons().add(imageRouter.getImage(ImagePaths.LOGO));
        stage.show();
    }
}
