module CowsAndBuls {
    requires javafx.controls;
    requires javafx.fxml;
    exports cab to javafx.fxml, javafx.graphics;
    opens cab to javafx.fxml, javafx.base;

}