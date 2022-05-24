module pl.lublin.wsei.java.cwiczenia.lab3a {
    requires javafx.controls;
    requires javafx.fxml;


    opens pl.lublin.wsei.java.cwiczenia.lab3a to javafx.fxml;
    exports pl.lublin.wsei.java.cwiczenia.lab3a;
}