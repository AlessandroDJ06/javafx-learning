package yourgame.core;

import javafx.scene.Scene;
import javafx.stage.Stage;
import yourgame.scenes.GameScene;

import java.util.HashMap;

public class Router {
    private final Stage stage;
    private final HashMap<Scenetype, Scene> loadedScenes = new HashMap<>();

    public Router(Stage stage){
        this.stage = new Stage();
    }

    public void goTo(Scenetype type){
        Scene scene = loadedScenes.get(type);
        if (scene == null) {
            GameScene gameScene = type.createScene();
            scene = gameScene.create(this);
            loadedScenes.put(type,scene);
        }

        stage.setScene(scene);
        stage.show();
    }
}
