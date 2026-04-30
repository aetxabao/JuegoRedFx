package edu.masanz.da.juegored.controller;

import edu.masanz.da.juegored.model.UserSession;
import edu.masanz.da.juegored.service.NavigationService;
import edu.masanz.da.juegored.util.Validator;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LauncherController {

    @FXML
    private TextField txtNickname;
    @FXML
    private Label lblError;

    @FXML
    void crearSala(ActionEvent event) {

        if(Validator.hashText(txtNickname)){
            getNickname();
            NavigationService.getInstance().navigateTo("hostconfig.fxml");
        } else {
            lblError.setVisible(true);
        }

    }

    @FXML
    void unirSala(ActionEvent event) {
        if(Validator.hashText(txtNickname)){
            getNickname();
            NavigationService.getInstance().navigateTo("lobbybrowser.fxml");
        } else {
            lblError.setVisible(true);
        }
    }


    @FXML
    void jugarSolo(ActionEvent event) {
        if(Validator.hashText(txtNickname)){

        } else {
            lblError.setVisible(true);
        }
    }

    @FXML
    void salir(ActionEvent event) {
        Platform.exit();
    }

    public void initialize(){
        if(UserSession.getInstance().getNickname()!=null){
            txtNickname.setText(UserSession.getInstance().getNickname());
        }
    }

    private void getNickname() {
        String nickname = txtNickname.getText();
        System.out.println("Nickname: " + nickname);
        UserSession.getInstance().setNickname(nickname);
    }

}
