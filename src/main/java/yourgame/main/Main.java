package yourgame.main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import yourgame.core.ImageRouter.ImageRouter;
import yourgame.core.SceneRouter.Router;
import yourgame.core.SceneRouter.Scenetype;
import yourgame.scenes.TestScene;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        ImageRouter imageRouter = new ImageRouter(stage);
        Router router = new Router(stage,imageRouter);
        stage.setTitle("TestApplication");
        Scene scene = new Scene(new TestScene());
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args){
        launch(args);
    }


}
