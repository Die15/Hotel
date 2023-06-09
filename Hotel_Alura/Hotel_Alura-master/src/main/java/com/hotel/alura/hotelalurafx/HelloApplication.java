package com.hotel.alura.hotelalurafx;

import ConexionBD.conexionBD;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.io.IOException;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
       FXMLLoader fxmlLoader;
       // fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Menu_Principal.fxml"));
        fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.setTitle("Hello!");
        stage.setResizable(false);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
    }

    @Override
    public void init() {
        new conexionBD().recuperaConexion();
    }

    @Override
    public void stop() {
        System.out.println("hasta la proxima");
    }
    public static void main(String[] args) {
        launch(args);
    }
}