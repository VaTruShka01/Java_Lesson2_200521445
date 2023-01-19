module com.example.lesson {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lesson to javafx.fxml;
    exports com.example.lesson;
}