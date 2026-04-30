package edu.masanz.da.juegored.controller;

import edu.masanz.da.juegored.service.NavigationService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;

public class LobbyBrowserController {

    @FXML
    private TableView<?> tbvSalas;

    @FXML
    void crearSala(ActionEvent event) {
        NavigationService.getInstance().navigateTo("hostconfig.fxml");
    }

    @FXML
    void unir(ActionEvent event) {

    }

    @FXML
    void volver(ActionEvent event) {
        NavigationService.getInstance().navigateTo("launcher.fxml");
    }

}
