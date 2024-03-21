module org.example.module5 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens org.example.module5 to javafx.fxml;
    exports org.example.module5;
}