module rz.demo.optimalwigglestereoscopy {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires eu.hansolo.tilesfx;

    opens rz.demo.optimalwigglestereoscopy to javafx.fxml;
    exports rz.demo.optimalwigglestereoscopy;
}