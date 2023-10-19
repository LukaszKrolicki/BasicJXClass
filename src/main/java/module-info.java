module com.properties.properites {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.properties.properites to javafx.fxml;
    exports com.properties.properites;
}