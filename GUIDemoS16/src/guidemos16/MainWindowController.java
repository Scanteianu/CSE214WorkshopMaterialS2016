/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guidemos16;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author Dan
 */
public class MainWindowController implements Initializable {
    
    @FXML
    private Label nameLabel;
    
    @FXML
    private void selectProf(ActionEvent event) {
        nameLabel.setText(p.getRandomProf());
    }
    @FXML
    private void addProf(ActionEvent e){
        Stage stage= new Stage();
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("ProfAdder.fxml"));
            Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        } catch (IOException ex) {
            Logger.getLogger(MainWindowController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        p=GUIDemoS16.getP();
    }    
    ProfModel p;
}
