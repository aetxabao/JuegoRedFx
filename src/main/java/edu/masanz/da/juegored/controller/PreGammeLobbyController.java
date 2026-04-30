package edu.masanz.da.juegored.controller;

import edu.masanz.da.juegored.model.UserSession;
import edu.masanz.da.juegored.service.NavigationService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class PreGammeLobbyController {

    @FXML
    private TableView<?> tbvJugadores;

    @FXML
    private TextArea txaChat;

    @FXML
    private TextField txtMessage;

    @FXML
    void ready(ActionEvent event) {

    }

    @FXML
    void chatear(ActionEvent event) {

    }

    @FXML
    void abandonar(ActionEvent event) {
        NavigationService.getInstance().navigateTo("launcher.fxml");
    }

}
