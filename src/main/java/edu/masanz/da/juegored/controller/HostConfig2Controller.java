package edu.masanz.da.juegored.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

import java.io.IOException;

public class HostConfig2Controller {

    @FXML
    private ComboBox<?> cmbNivel;

    @FXML
    private RadioButton rbtPrivado;

    @FXML
    private RadioButton rbtPublico;

    @FXML
    private ToggleGroup tipo;

    @FXML
    private TextField txtNombreSala;

    @FXML
    private TextField txtNumeroJugadores;

    @FXML
    void crearSala(ActionEvent event) {

//
//        String nickname = txtNickname.getText();
//        System.out.println("LauncherController");
//        System.out.println("Nickname: " + nickname);
//        UserSession.getInstance().setNickname(nickname);
//
//        FXMLLoader loader = new FXMLLoader(getClass().getResource("/edu/masanz/da/juegored/hostconfig.fxml"));
//
//        Parent root = null;
//        try {
//            root = loader.load();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        Scene scene = new Scene(root);
//
//        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        stage.setScene(scene);
//        stage.show();
    }

    @FXML
    void cancelar(ActionEvent event) {

    }

}
