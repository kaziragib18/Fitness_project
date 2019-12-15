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

public class dietcontroller implements Initializable {

    @FXML
    private Button diet;

    @FXML
    private Button Next;

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
   
   if (event.getSource() == diet) {
            ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/foodforlossweight.fxml"));
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
