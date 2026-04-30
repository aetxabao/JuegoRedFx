package edu.masanz.da.juegored;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import edu.masanz.da.juegored.service.NavigationService;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        NavigationService nav = NavigationService.getInstance();
        nav.setStage(stage);

        FXMLLoader fxmlLoader = new FXMLLoader(getClass()
                .getResource("/edu/masanz/da/juegored/view/launcher.fxml"));
        Scene scene = null; // crear la escena
        try {
            scene = new Scene(fxmlLoader.load());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setScene(scene);
        stage.setTitle("- Ejemplo de aplicación JavaFX -");
        stage.setResizable(false);
        stage.show();
    }

}
