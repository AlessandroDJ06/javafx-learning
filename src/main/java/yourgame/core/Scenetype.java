package yourgame.core;
import yourgame.scenes.*;

public enum Scenetype {

    MENU {
        public GameScene createScene(){
            return new MenuScene();
        }
    };

    public abstract GameScene createScene();

}
