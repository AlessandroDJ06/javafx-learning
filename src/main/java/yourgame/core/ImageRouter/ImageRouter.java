package yourgame.core.ImageRouter;

import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Objects;

public class











































ImageRouter {
    private final HashMap<ImagePaths,Image> loadedImages;
    private final Stage stage;

    public ImageRouter(Stage stage){
        this.stage = stage;
        this.loadedImages = new HashMap<>();
    }
    public Image getImage(ImagePaths path){
        Image image = loadedImages.get(path);
        if (image == null){
            image = new Image(Objects.requireNonNull(getClass().getResourceAsStream(path.getPath())));
            loadedImages.put(path,image);
        }
        return image;
    }
}
