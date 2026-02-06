package yourgame.scenes;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;

public class TestScene extends BorderPane {
    public TestScene(){
        GridPane board = new GridPane();

        for (int row = 0; row < 4 ; row++){
            for (int column = 0; column < 10 ; column++){
                if (row < 2){
                    if (column%2 != 0 && column != 9){
                        board.add(new Circle(20),column,row);
                    }
                } else {
                    if (column%2  == 0){
                        board.add(new Circle(20),column,row);
                    }
                }
            }
        }
        board.maxWidth(200);
        board.setHgap(15);
        board.setVgap(15);
        setCenter(board);
    }
}
