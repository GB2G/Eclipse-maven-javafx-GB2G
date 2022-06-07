module login.css {
    requires javafx.controls;
    requires javafx.fxml;

    opens login.css to javafx.fxml;
    exports login.css;
}
