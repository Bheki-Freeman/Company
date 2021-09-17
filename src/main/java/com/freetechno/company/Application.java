package com.freetechno.company;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("View.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 500);
        stage.setTitle("The Company");
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED); //Remove the default closing  and maximising buttons
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}