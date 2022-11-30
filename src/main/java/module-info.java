module com.example.snakebite {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.snakebite to javafx.fxml;
    exports com.example.snakebite;
}