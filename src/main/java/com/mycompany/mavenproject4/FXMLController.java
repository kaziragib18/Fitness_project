package com.mycompany.mavenproject4;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class FXMLController implements Initializable {
    @FXML
    private Button back2;
    
    @FXML
    private Button up;
    
    @FXML
    private Button diet;
    
     @FXML
    private Button Next;
   
    @FXML
    private Button in;

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
          if (event.getSource() == Next) {
            ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/male.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(root);
            scene.getStylesheets().add("/styles/Styles.css");

            stage.setTitle("JavaFX and Maven");
            stage.setScene(scene);
            stage.show();
        }
        
        if (event.getSource() == up) {
            ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/up.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(root);
            scene.getStylesheets().add("/styles/Styles.css");

            stage.setTitle("JavaFX and Maven");
            stage.setScene(scene);
            stage.show();
        }

        if (event.getSource() == in) {
            ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/in.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(root);
            scene.getStylesheets().add("/styles/Styles.css");

            stage.setTitle("JavaFX and Maven");
            stage.setScene(scene);
            stage.show();

        }

     

        
         if (event.getSource() == back2) {
            ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/in.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(root);
            scene.getStylesheets().add("/styles/Styles.css");

            stage.setTitle("JavaFX and Maven");
            stage.setScene(scene);
            stage.show();
        }
    
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
