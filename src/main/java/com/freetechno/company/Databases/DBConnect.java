package com.freetechno.company.Databases;
import java.sql.*;

public class DBConnect {

    Connection conn = null;
    String url = "jdbc:mysql://localhost/company";
    String user_name = "Freeman";
    String user_pass = "Swaandiswa12";

    public Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user_name, user_pass);
            System.out.println("Connected to database ");
        }catch(Exception e){
            System.err.println("Cannot connect to database!");
            e.printStackTrace();
        }
        return conn;
        }

    }

