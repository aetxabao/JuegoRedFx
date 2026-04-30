package edu.masanz.da.juegored.controller;

import edu.masanz.da.juegored.model.UserSession;
import edu.masanz.da.juegored.service.NavigationService;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LauncherController {

    @FXML
    private TextField txtNickname;

    @FXML
    void crearSala(ActionEvent event) {
        getNickname();

////        FXMLLoader loader = new FXMLLoader(getClass().getResource("/edu/masanz/da/juegored/view/hostconfig.fxml"));
////
////        Parent root = null;
////        try {
////            root = loader.load();
////        } catch (IOException e) {
////            throw new RuntimeException(e);
////        }
////        Scene scene = new Scene(root);
////
////        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
////        stage.setScene(scene);
////        stage.show();

        NavigationService.getInstance().navigateTo("hostconfig.fxml");

    }

    @FXML
    void unirSala(ActionEvent event) {
        getNickname();

        NavigationService.getInstance().navigateTo("hostconfig.fxml");
    }


    @FXML
    void jugarSolo(ActionEvent event) {

    }

    @FXML
    void salir(ActionEvent event) {
        Platform.exit();
    }

    private void getNickname() {
        String nickname = txtNickname.getText();
        System.out.println("Nickname: " + nickname);
        UserSession.getInstance().setNickname(nickname);
    }

}
