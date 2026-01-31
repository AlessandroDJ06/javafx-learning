package yourgame.core.SceneRouter;
import yourgame.scenes.*;

public enum Scenetype {

    MENU {
        public GameScene createScene(){
            return new MenuScene();
        }
    },
    SETTINGS{
        @Override
        public GameScene createScene() {
            return new SettingsScene();
        }
    };

    public abstract GameScene createScene();

}
