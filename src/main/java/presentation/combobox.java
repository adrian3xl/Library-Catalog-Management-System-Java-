/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import Domain.Genre;
import Service.JDBCImplement.JDBCMainConfiguration;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Adrian
 */
public class combobox extends JDBCMainConfiguration {
    JDBCMainConfiguration jdbc = new JDBCMainConfiguration();
    public HashMap<String, Integer>getGenreMap(){
    
    HashMap<String, Integer> map = new HashMap<>();
    String SelectAll= "Select * FROM `genre`";
         
       Genre genre;
       PreparedStatement ps; 
       ResultSet rs;
        try {
            rs=jdbc.getConnection().createStatement().executeQuery(SelectAll);
             while (rs.next()){
           
               genre = new  Genre(rs.getInt("id"),rs.getString("name"));
               map.put(genre.getName(),genre.getId());
                 //genrecombo.addItem(rs.getString("name"));
             } 
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(combobox.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return map;
    }
    
    
    public void genrecombobox(){

String SelectAll= "Select name FROM genre";
         
       
       PreparedStatement ps; 
       ResultSet rs;
        try {
            rs=jdbc.getConnection().createStatement().executeQuery(SelectAll);
             while (rs.next()){
            // genrecombo.addItem(rs.getString("name"));
             } 
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(JIFManageCatalogloan.class.getName()).log(Level.SEVERE, null, ex);
        }


}
}
