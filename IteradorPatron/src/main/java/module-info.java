module co.edu.uniquindio.poo.iteradorpatron {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.edu.uniquindio.poo.iteradorpatron to javafx.fxml;
    opens co.edu.uniquindio.poo.iteradorpatron.model to javafx.fxml;
    opens co.edu.uniquindio.poo.iteradorpatron.viewController to javafx.fxml;

    exports co.edu.uniquindio.poo.iteradorpatron;
    exports co.edu.uniquindio.poo.iteradorpatron.model;
}
