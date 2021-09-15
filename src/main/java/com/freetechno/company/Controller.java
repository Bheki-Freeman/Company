package com.freetechno.company;

import com.freetechno.company.Databases.DBConnect;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Awuuuuu, Awuuuuu!");
        DBConnect connect = new DBConnect();
        connect.getConnection();
    }
}