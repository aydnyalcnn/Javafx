/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxmlapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Label;

/**
 *
 * @author pc
 */
public class islemler {
     private Connection con=null;
    private Statement statement=null;
    private PreparedStatement preparedStatement=null;
    JavaFXMLApplication application=new JavaFXMLApplication();
    
     public void GirisYap(String Kullanici_adi,String parola,Label Hata_alani){
    String sorgu="Select * From adminler where username = ? and password = ?";
     Hata_alani.setText("");
        try {
            preparedStatement =con.prepareStatement(sorgu);
            preparedStatement.setString(1, Kullanici_adi);
            preparedStatement.setString(2, parola);
            
            ResultSet rs=preparedStatement.executeQuery();
         if(rs.next()==true){
         Hata_alani.setText("başarılı");
         
         }else{
          Hata_alani.setText("Başarısız");}
          
           
        } catch (SQLException ex) {
            Logger.getLogger(islemler.class.getName()).log(Level.SEVERE, null, ex);
           
          
        }
        
        
         
    
  }
     
      public islemler(){
      String url = "jdbc:mysql://" + DBConnection.host + ":" +DBConnection.port + "/" + DBConnection.db_ismi + "?useUnicode=true&characterEncoding=utf8";

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı..");
        }

        try {
            con = DriverManager.getConnection(url, DBConnection.kullanici_adi, DBConnection.parola);
            System.out.println("Bağlantı Başarılı...");

        } catch (SQLException ex) {
            System.out.println("Bağlantı başarısız....");
        }
    
    
    
    }
    
    
}
