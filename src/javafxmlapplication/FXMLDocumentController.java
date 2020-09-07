/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxmlapplication;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author pc
 */
public class FXMLDocumentController implements Initializable {
islemler yenislemler=new islemler();
    @FXML
    private PasswordField parola;
    @FXML
    private TextField Username;
    @FXML
    private Label Hata_alani;
    
    
  
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Giris_btn(MouseEvent event) {
        
     String user_name=Username.getText();
     String pass=parola.getText();
     yenislemler.GirisYap(user_name, pass,Hata_alani);
     
        
    }

  
    
}
