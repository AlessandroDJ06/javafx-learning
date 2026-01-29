package com.example.javafxlearning;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root,800,800,Color.SKYBLUE);
        Text text = new Text();
        text.setText("WHOOOOOOA!");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Verdana",50));
        text.setFill(Color.LIMEGREEN);

        Line line = new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(200);
        line.setStrokeWidth(5);
        line.setStroke(Color.RED);
        line.setOpacity(0.5);
        line.setRotate(45);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(100);
        rectangle.setY(100);
        rectangle.setWidth(100);
        rectangle.setHeight(100);
        rectangle.setFill(Color.BLUE);
        rectangle.setStrokeWidth(5);
        rectangle.setStroke(Color.BLACK);

        root.getChildren().add(rectangle);
        root.getChildren().add(line);
        root.getChildren().add(text);



        Image icon = new Image(HelloApplication.class.getResource("/images/img.png").toExternalForm());
        stage.getIcons().add(icon);

        stage.setTitle("testJavaFx");
        stage.setWidth(420);
        stage.setHeight(420);
        stage.setScene(scene);

//        stage.setX(50);
//        stage.setY(50);
        stage.setFullScreen(false);
        stage.setFullScreenExitHint("YOU CANT ESCAPE unless you press q");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
        stage.show();
    }
}

