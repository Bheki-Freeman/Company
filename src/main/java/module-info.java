module com.freetechno.company {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;

    opens com.freetechno.company to javafx.fxml;
    exports com.freetechno.company;
}