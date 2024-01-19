module com.example.week02java {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.week02java to javafx.fxml;
    exports com.example.week02java;
}