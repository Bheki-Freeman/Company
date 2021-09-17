package com.freetechno.company;

import com.freetechno.company.Databases.DBConnect;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


import java.io.IOException;
import java.sql.Connection;

public class Controller implements CloseWindows{
    private Connection conn = null;
    private DBConnect connect = new DBConnect();
    private FXMLLoader loader;
    private Stage stage;
    private  Scene scene;
    private Functions functions = new Functions();

    @FXML
    protected Button btn_continue;

    @FXML
    protected Button btn_employee;

    @FXML
    private ImageView img_techno;


    @FXML
    protected void closeWindow(){
        System.exit(0);
    }

    @FXML
    protected void openMainView() throws IOException {
        //Close window
        closeCurrentWindow(btn_continue);
        //Create a new Window (Stage)
        functions.openWindow(stage, "MainAppView.fxml", 800, 500);
    }

    //Close the current window method
    @Override
    public void closeCurrentWindow(Button btn){
        stage = (Stage) btn.getScene().getWindow();
        stage.close();
    }

    //show EmployeeController screen
    @FXML
    private void showEmployeeScreen(ActionEvent event) throws IOException{
        Parent loader = FXMLLoader.load(getClass().getResource("EmployeeView.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(loader);
        stage.setScene(scene);
        stage.show();

        //
    }


}