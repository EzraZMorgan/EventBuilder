module com.example.stringbuilder {
    requires javafx.controls;
    requires javafx.fxml;


    exports com.example.EventBuilder;
    opens com.example.EventBuilder to javafx.fxml;
}