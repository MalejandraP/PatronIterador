package co.edu.uniquindio.poo.iteradorpatron.viewController;

import co.edu.uniquindio.poo.iteradorpatron.controller.PrimaryController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class PrimaryViewController {
    @FXML
    private Label lblTitulo;

    @FXML
    private Label lblArtista;

    @FXML
    private Button btnSiguiente, btnAnterior;

    private PrimaryController primaryController;

    @FXML
    public void onAnteriorCancion() {
        var cancion = primaryController.anteriorCancion();
        if (cancion != null) {
            lblTitulo.setText(cancion.getTitulo());
            lblArtista.setText(cancion.getArtista());
        } else {
            lblTitulo.setText("Inicio de la playlist");
            lblArtista.setText("No hay canciones anteriores");
        }
    }

    @FXML
    public void initialize() {
        primaryController = new PrimaryController();
        mostrarSiguienteCancion();
    }

    @FXML
    public void onSiguienteCancion() {
        mostrarSiguienteCancion();
    }

    private void mostrarSiguienteCancion() {
        var cancion = primaryController.siguienteCancion();

        if (cancion != null) {
            lblTitulo.setText(cancion.getTitulo());
            lblArtista.setText(cancion.getArtista());
        } else {
            lblTitulo.setText("Final de la playlist");
            lblArtista.setText("Presiona reiniciar para volver a escuchar.");
            primaryController.reiniciarIterador();
        }
    }
}
