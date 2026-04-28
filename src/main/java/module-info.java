module org.example.parqueatracciones {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.parqueatracciones to javafx.fxml;
    exports org.example.parqueatracciones;
}