package guidemos16;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import guidemos16.GUIDemoS16;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Dan
 */
public class ProfAdderController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML TextField field;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    @FXML void okClicked(ActionEvent e){
        GUIDemoS16.getP().addProf(field.getText());
        ((Stage)((Button)e.getSource()).getScene().getWindow()).close();
    }
    @FXML void cancelClicked(ActionEvent e){
        ((Stage)((Button)e.getSource()).getScene().getWindow()).close();
    }
    
}
