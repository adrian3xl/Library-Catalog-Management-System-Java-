/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import Service.JDBCImplement.JDBCMainConfiguration;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Adrian
 */
public class combobox extends JDBCMainConfiguration {
    
     public void authorcombo(){
String SelectAll= "Select * FROM author";
         
         try {
             con = getConnection();
         } catch (SQLException ex) {
             Logger.getLogger(combobox.class.getName()).log(Level.SEVERE, null, ex);
         }
      
      // ResultSet rs;
        try{
       PreparedStatement ps=con.prepareStatement(SelectAll);
        //String sql="select * from author";
       // ps=con.prepareStatement(sql);
        ResultSet rs=ps.executeQuery();
        //rs=jdbc.getConnection().createStatement().executeQuery(SelectAll);
        while (rs.next()){
      
    //    combobox.addItem(Integer.toString(rs.getInt("author_id")));
      
        
        }
        }catch(Exception e){
        
        
        JOptionPane.showMessageDialog(null, e);
        
        }


}
    
    
    
    
    
}
