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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Adrian
 */
public class table extends JDBCMainConfiguration {
    
    
    public void fillAuthorJtable(JTable table,String valueToSearch){
     String SelectAll=("SELECT * FROM author WHERE CONCAT(`firstname`,`lastname`,`authorcode`)LIKE ?");
    
           
              
              try {
                  Connection con=getConnection();
                 PreparedStatement ps=con.prepareStatement(SelectAll);
                    ps.setString(1,"%"+valueToSearch);
                    
                    
                    
                       ResultSet rs=ps.executeQuery();
                       DefaultTableModel model=(DefaultTableModel)table.getModel();
                       
                       Object[] row;
                       
                       while(rs.next()){
                       
                       row= new Object[4];
                       
                       row[0]=rs.getInt(1);
                        row[1]=rs.getString(2);
                       row[2]=rs.getString(3);
                       row[3]=rs.getString(4);
                       
                       model.addRow(row);
                       }
                       
              } catch (SQLException ex) {
                  Logger.getLogger(JIFAddAuthor.class.getName()).log(Level.SEVERE, null, ex);
              }
    
    
    
    
    }
    
}
