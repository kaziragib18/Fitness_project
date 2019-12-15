package com.mycompany.mavenproject4;

import java.io.IOException;
import java.net.URL;
import static java.time.temporal.TemporalAdjusters.next;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class NextController implements Initializable {

   
    @FXML
    private Button Back;
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
       
        
         if (event.getSource() == Back) {
            ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/Scene.fxml"));
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
