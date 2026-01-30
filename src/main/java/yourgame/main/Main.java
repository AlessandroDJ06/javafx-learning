package yourgame.main;

import javafx.application.Application;
import javafx.stage.Stage;
import yourgame.core.Router;
import yourgame.core.Scenetype;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Router router = new Router(stage);
        stage.setTitle("TestApplication");
        router.goTo(Scenetype.MENU);
    }

    public static void main(String[] args){
        launch(args);
    }


}
