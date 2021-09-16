package com.freetechno.company;

import com.freetechno.company.Databases.DBConnect;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.sql.Connection;

public class Controller {
    private Connection conn = null;
    private DBConnect connect = new DBConnect();

    @FXML
    protected void closeWindow(){
        System.exit(0);
    }

    @FXML
    protected void openMainView() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("MainAppView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 500);
        stage.setTitle("The Company");
        stage.setScene(scene);
//        stage.initStyle(StageStyle.UNDECORATED); //To remove the default closing  and maximising buttons
        stage.show();
    }
}