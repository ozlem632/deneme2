module com.example.gituppull {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gituppull to javafx.fxml;
    exports com.example.gituppull;
}