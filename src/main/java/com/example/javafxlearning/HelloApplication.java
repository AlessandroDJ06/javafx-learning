package com.example.javafxlearning;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);

        Image icon = new Image(HelloApplication.class.getResource("/images/img.png").toExternalForm());
        stage.getIcons().add(icon);

        stage.setTitle("testJavaFx");
        stage.setWidth(420);
        stage.setHeight(420);
        stage.setScene(scene);

//        stage.setX(50);
//        stage.setY(50);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("YOU CANT ESCAPE unless you press q");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
        stage.show();
    }
}

