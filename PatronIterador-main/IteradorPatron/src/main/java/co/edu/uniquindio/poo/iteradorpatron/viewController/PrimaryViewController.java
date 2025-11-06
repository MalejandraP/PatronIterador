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
    private Button btnSiguiente, btnAnterior, btnReset;

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
        actualizarEstadoBotones();
    }

    @FXML
    public void initialize() {
        primaryController = new PrimaryController();
        onReset(); // Inicia mostrando la primera canción
    }

    @FXML
    public void onSiguienteCancion() {
        if (primaryController.tieneSiguiente()) {
            mostrarSiguienteCancion();
        }
        actualizarEstadoBotones();
    }

    @FXML
    public void onReset() {
        var cancion = primaryController.obtenerPrimeraCancion();
        if (cancion != null) {
            lblTitulo.setText(cancion.getTitulo());
            lblArtista.setText(cancion.getArtista());
        }
        actualizarEstadoBotones();
    }

    private void mostrarSiguienteCancion() {
        var cancion = primaryController.siguienteCancion();

        if (cancion != null) {
            lblTitulo.setText(cancion.getTitulo());
            lblArtista.setText(cancion.getArtista());
        } else {
            lblTitulo.setText("Final de la playlist");
            lblArtista.setText("Presiona reiniciar para volver a escuchar.");
        }
    }

    private void actualizarEstadoBotones() {
        btnSiguiente.setDisable(!primaryController.tieneSiguiente());
        btnAnterior.setDisable(!primaryController.tieneAnterior());
    }
}
