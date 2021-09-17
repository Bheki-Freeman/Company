package com.freetechno.company;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Functions { //To cover in all the repeating functions
    private FXMLLoader loader;
    private Scene scene;
    //open Window function
    public void openWindow(Stage stage, String file, int stage_width, int stage_height) throws IOException {
        stage = new Stage();
        loader = new FXMLLoader(Application.class.getResource(file));
        scene = new Scene(loader.load(), stage_width, stage_height);
        stage.setScene(scene);
        stage.show();
    }
}
