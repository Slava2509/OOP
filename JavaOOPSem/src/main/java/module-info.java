module com.example.javaoopsem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javaoopsem to javafx.fxml;
    exports com.example.javaoopsem;
}