package yourgame.ui;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import yourgame.core.ImageRouter.ImagePaths;
import yourgame.core.ImageRouter.ImageRouter;

public class UniversalRectangleButton extends Button {
    public UniversalRectangleButton(ImageRouter imageRouter,String name){
        super(name);
        Image image = imageRouter.getImage(ImagePaths.BUTTON_RECTANGLE_BORDER);
        ImageView backgroundImage = new ImageView(image);
        setGraphic(backgroundImage);
        setStyle("-fx-content-display: center; -fx-text-fill: black; -fx-font-weight: bold;");
    }

}
