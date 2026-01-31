package yourgame.core.ImageRouter;

import javafx.scene.image.Image;

import java.util.Objects;

public class ImageRouter {
    public Image getImage(ImagePaths path){
        return new Image(Objects.requireNonNull(getClass().getResourceAsStream(ImagePaths.LOGO.getPath())));
    }
}
