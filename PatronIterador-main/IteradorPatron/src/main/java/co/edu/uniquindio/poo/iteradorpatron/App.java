package co.edu.uniquindio.poo.iteradorpatron;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("primary.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 820, 520);
        var cssUrl = App.class.getResource("styles.css");
        if (cssUrl != null) {
            scene.getStylesheets().add(cssUrl.toExternalForm());
        }
        stage.setTitle("Patron Iterator - Playlist");
        stage.setScene(scene);
        stage.setMinWidth(720);
        stage.setMinHeight(440);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}