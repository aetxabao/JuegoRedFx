package edu.masanz.da.juegored.controller;

import edu.masanz.da.juegored.model.UserSession;
import edu.masanz.da.juegored.service.NavigationService;
import edu.masanz.da.juegored.util.Validator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class HostConfigController {

    @FXML
    private ComboBox<?> cmbLevel;

    @FXML
    private ImageView imvRoom;

    @FXML
    private RadioButton rbtPrivate;

    @FXML
    private RadioButton rbtPublic;

    @FXML
    private Spinner<Integer> spnNumero;

    @FXML
    private ToggleGroup tipo;

    @FXML
    private TextField txtSala;

    @FXML
    private Label lblError;

    @FXML
    public void initialize() {
        System.out.println("HostConfigController.initialize()");
        String nickname = UserSession.getInstance().getNickname();
        System.out.println("Nickname: " + nickname);
    }

    @FXML
    void cancelarHostConfig(ActionEvent event) {

        NavigationService.getInstance().navigateTo("launcher.fxml");

    }

    @FXML
    void crearSala(ActionEvent event) {

        if(Validator.hashText(txtSala)){
            String nombreSala;
            int numeroJugadores;
            boolean esPrivada;
            String password;
            String nivel;

            NavigationService.getInstance().navigateTo("pregamelobby.fxml");
        } else {
            lblError.setVisible(true);
        }


    }

}

