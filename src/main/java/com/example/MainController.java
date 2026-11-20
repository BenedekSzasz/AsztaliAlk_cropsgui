/*
* File: MainController.java
* Author: Szász Benedek
* Copyright: 2026, Szász Benedek
* Group: Szoft II-N
* Date: 2026-11-20
* Github: https://github.com/BenedekSzasz
* Licenc: MIT
*/

package com.example;

import java.util.List;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;

public class MainController {

    @FXML
    private TableView<Crop> cropTable;

    @FXML
    private TableColumn<Crop, Boolean> forageCol;

    @FXML
    private TableColumn<Crop, Integer> idCol;

    @FXML
    private TableColumn<Crop, String> nameCol;

    @FXML
    private TableColumn<Crop, Integer> quantityCol;

    @FXML 
    private void initialize() {
        System.out.println("Előkészítés.....");
        initCols();
        initTable();
    }

    private void initCols() {
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        forageCol.setCellValueFactory(new PropertyValueFactory<>("forage"));
        quantityCol.setCellValueFactory(new PropertyValueFactory<>("quantity"));
    }

    private void initTable() {
        CropRepository cropRep = new CropRepository();
        List<Crop> cropList = cropRep.findAll();
        cropTable.getItems().addAll(cropList);
    }

    @FXML
    void onClickAboutButton(ActionEvent event) {
        showAbout();
    }

    private void showAbout() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Névjegy");
        alert.setHeaderText("cropsgui");
        alert.setContentText("Készítette: Szász Benedek\n2026.11.20.\nVerzió: 0.0.1\nSzoft II-N");
        alert.initOwner(App.currentStage);
        alert.showAndWait();
        
    }

    @FXML
    void onClickExitButton(ActionEvent event) {
        Platform.exit();
    }

}
