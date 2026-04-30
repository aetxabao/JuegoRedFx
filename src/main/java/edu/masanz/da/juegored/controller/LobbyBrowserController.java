package edu.masanz.da.juegored.controller;

import edu.masanz.da.juegored.model.Sala;
import edu.masanz.da.juegored.service.NavigationService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class LobbyBrowserController {

    @FXML
    private TableView<Sala> tbvSalas;

    @FXML
    private TableColumn<Sala, String> colNombre;
    @FXML
    private TableColumn<Sala, Integer> colJugadores;
    @FXML
    private TableColumn<Sala, Boolean> colPrivacidad;
    @FXML
    private TableColumn<Sala, String> colDificultad;
    @FXML
    private TableColumn<Sala, Integer> colPing;

    private ObservableList<Sala> listaSalas;

    public void initialize(){

        // PASO 1: Vincular cada columna al atributo del POJO
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombreSala"));
        colJugadores.setCellValueFactory(new PropertyValueFactory<>("numeroJugadores"));
        colPrivacidad.setCellValueFactory(new PropertyValueFactory<>("esPrivada"));
        colDificultad.setCellValueFactory(new PropertyValueFactory<>("dificultad"));
        colPing.setCellValueFactory(new PropertyValueFactory<>("ping"));

        // PASO 2: Poblar la lista con datos de ejemplo
        listaSalas = FXCollections.observableArrayList(
                new Sala("Bosque Oscuro", 4, true, "Media", 45),
                new Sala("Dojo Pro", 2, true, "Hardcore", 20),
                new Sala("Chill Zone", 8, false, "Fácil", 60)
        );

        // PASO 3: Asignar la lista a la TableView
        tbvSalas.setItems(listaSalas);
    }

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
