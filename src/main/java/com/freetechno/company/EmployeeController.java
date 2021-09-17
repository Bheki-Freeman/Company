package com.freetechno.company;

import com.freetechno.company.Databases.DBConnect;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class EmployeeController implements Initializable, CloseWindows {
    private Stage stage;
    private Scene scene;
    private DBConnect connect  = new DBConnect();

    //Work with table
    @FXML
    private TableView<ModelTable> tbl_employees;
    @FXML
    private TableColumn<ModelTable, String> col_firstname;
    @FXML
    private TableColumn<ModelTable, String> col_m_name;
    @FXML
    private TableColumn<ModelTable, String> col_last_name;
    @FXML
    private TableColumn<ModelTable, String> col_ssn;
    @FXML
    private TableColumn<ModelTable, String> col_birthday;
    @FXML
    private  TableColumn<ModelTable, String> col_address;
    @FXML
    private TableColumn<ModelTable, String> col_gender;
    @FXML
    private TableColumn<ModelTable, Integer> col_mgr_ssn;
    @FXML
    private TableColumn<ModelTable, Double> col_salary;
    @FXML
    private  TableColumn<ModelTable, Integer> col_department_no;

    @FXML
    private TextField txt_name;
    @FXML
    private TextField txt_m_name;
    @FXML
    private TextField txt_lastname;

    //Constructor
    public EmployeeController(){
//        connectToDatabase();
    }

    //Make the Table Model an observable List
    ObservableList<ModelTable> observableList = FXCollections.observableArrayList();

    //Connect Database and Retrieve Data
    @FXML
    public void connectToDatabase(){
        retrieveData();
    }

    //Retr
    private void retrieveData(){
        try {
            Statement statement = connect.getConnection().createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM employees");
            while(rs.next()){
                String f_name = rs.getString("fname");
                String m_name = rs.getString("mname");
                String l_name = rs.getString("lname");
                String ss_n = rs.getString("ssn");
                String b_day = rs.getString("bdate");
                String address = rs.getString("main_address");
                char gender = rs.getString("gender").charAt(0);
                double salary = rs.getDouble("salary");
                String mgr_number = rs.getString("mgr_ssn");
                int department = rs.getInt("department_no");

                //print
                System.out.println("The values are: \n" + b_day + "\n" + mgr_number + "\n" + department + "\n" + salary);

                //Then now put data into table - we gonna use the observable list(table model)
                observableList.add(new ModelTable(f_name, m_name, l_name, ss_n, b_day, address, gender, mgr_number, salary, department));

                //set values into textfields
                txt_name.setText(f_name);
                txt_m_name.setText(m_name);
                txt_lastname.setText(l_name);

                //Add values to table
                tbl_employees.setItems(observableList);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    //Return back home
    @FXML
    protected void switchBackHome(ActionEvent event) throws IOException {
        Parent loader = FXMLLoader.load(getClass().getResource("MainAppView.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(loader);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        connectToDatabase();
        col_firstname.setCellValueFactory(new PropertyValueFactory<>("first_name"));
        col_m_name.setCellValueFactory(new PropertyValueFactory<>("middle_name"));
        col_last_name.setCellValueFactory(new PropertyValueFactory<>("last_name"));
        col_ssn.setCellValueFactory(new PropertyValueFactory<>("ssn"));
        col_birthday.setCellValueFactory(new PropertyValueFactory<>("birthday"));
        col_address.setCellValueFactory(new PropertyValueFactory<>("address"));
        col_gender.setCellValueFactory(new PropertyValueFactory<>("gender"));
        col_mgr_ssn.setCellValueFactory(new PropertyValueFactory<>("mgr_ssn"));
        col_salary.setCellValueFactory(new PropertyValueFactory<>("salary"));
        col_department_no.setCellValueFactory(new PropertyValueFactory<>("department_no"));
    }

    @Override
    public void closeCurrentWindow(Button btn) {
        stage = (Stage) btn.getScene().getWindow();
        stage.close();
    }

    //Logout


}
