module edu.masanz.da.juegored {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens edu.masanz.da.juegored to javafx.fxml;
    opens edu.masanz.da.juegored.controller to javafx.fxml;

    exports edu.masanz.da.juegored;
    exports edu.masanz.da.juegored.controller;
}