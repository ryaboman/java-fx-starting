package ru.ryaboman.javaFX.DocSystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Launcher extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)  throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Launcher.class.getResource("main-view-doc-system.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        primaryStage.setTitle("DocSystem");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}