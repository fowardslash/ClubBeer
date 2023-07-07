package com.example.project_ver1.controller;

import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.DataFormat;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField height;
    @FXML
    private ListView lvUsser;
    public void Submit (ActionEvent event){
    }
    @FXML
    private AnchorPane pane1, pane2;
    @FXML
    private Label menu;

    @FXML
    private ImageView img_exit;

    @FXML
    private Label drawerImage;


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        img_exit.setOnMouseClicked(event -> {
            System.exit(0);
        });



    }
}