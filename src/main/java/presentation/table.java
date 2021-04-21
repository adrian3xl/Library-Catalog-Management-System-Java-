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
     String SelectAll=("SELECT * FROM author WHERE CONCAT(`id`,`firstname`,`lastname`,`authorcode`)LIKE ?");
    
           
              
              try {
                  Connection con=getConnection();
                 PreparedStatement ps=con.prepareStatement(SelectAll);
                    ps.setString(1,"%"+valueToSearch+"%");
                    
                    
                    
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
                  Logger.getLogger(JIFManageAuthor.class.getName()).log(Level.SEVERE, null, ex);
              }
    
    
    
    
    }
    
    public void fillPublisherJTable (JTable table,String valueToSearch){
     String SelectAll=("SELECT * FROM publisher WHERE CONCAT(`id`,`firstname`,`lastname`,`publishercode`)LIKE ?");
    
           
              
              try {
                  Connection con=getConnection();
                 PreparedStatement ps=con.prepareStatement(SelectAll);
                    ps.setString(1,"%"+valueToSearch+"%");
                    
                    
                    
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
                  Logger.getLogger(JIFManagePublisher.class.getName()).log(Level.SEVERE, null, ex);
              }

    }
    
    
    public void fillGenreJTable (JTable table,String valueToSearch){
     String SelectAll=("SELECT * FROM genre WHERE CONCAT(`id`,`name`)LIKE ?");
    
           
              
              try {
                  Connection con=getConnection();
                 PreparedStatement ps=con.prepareStatement(SelectAll);
                    ps.setString(1,"%"+valueToSearch+"%");
                    
                    
                    
                       ResultSet rs=ps.executeQuery();
                       DefaultTableModel model=(DefaultTableModel)table.getModel();
                       
                       Object[] row;
                       
                       while(rs.next()){
                       
                       row= new Object[2];
                       
                       row[0]=rs.getInt(1);
                        row[1]=rs.getString(2);        
                       model.addRow(row);
                       }
                       
              } catch (SQLException ex) {
                  Logger.getLogger(JIFManageGenre.class.getName()).log(Level.SEVERE, null, ex);
              }

    }
    
            
            
            
            public void fillDocTypeJTable (JTable table,String valueToSearch){
     String SelectAll=("SELECT * FROM documenttype WHERE CONCAT(`id`,`name`)LIKE ?");
    
           
              
              try {
                  Connection con=getConnection();
                 PreparedStatement ps=con.prepareStatement(SelectAll);
                    ps.setString(1,"%"+valueToSearch+"%");
                    
                    
                    
                       ResultSet rs=ps.executeQuery();
                       DefaultTableModel model=(DefaultTableModel)table.getModel();
                       
                       Object[] row;
                       
                       while(rs.next()){
                       
                       row= new Object[2];
                       
                       row[0]=rs.getInt(1);
                        row[1]=rs.getString(2);        
                       model.addRow(row);
                       }
                       
              } catch (SQLException ex) {
                  Logger.getLogger(JIFManageDocType.class.getName()).log(Level.SEVERE, null, ex);
              }

    }
                    
            public void fillCustomerJTable (JTable table,String valueToSearch){
     String SelectAll=("SELECT * FROM customer WHERE CONCAT(`id`,`firstname`,`lastname`,`phonenumber`,`address`,`customercode`)LIKE ?");
    
           
              
              try {
                  Connection con=getConnection();
                 PreparedStatement ps=con.prepareStatement(SelectAll);
                    ps.setString(1,"%"+valueToSearch+"%");
                    
                    
                    
                       ResultSet rs=ps.executeQuery();
                       DefaultTableModel model=(DefaultTableModel)table.getModel();
                       
                       Object[] row;
                       
                       while(rs.next()){
                       
                       row= new Object[6];
                       
                       row[0]=rs.getInt(1);
                        row[1]=rs.getString(2);
                       row[2]=rs.getString(3);
                       row[3]=rs.getString(4);
                        row[4]=rs.getString(5);
                         row[5]=rs.getString(6);
                       model.addRow(row);
                       }
                       
              } catch (SQLException ex) {
                  Logger.getLogger(JIFManageCustomer.class.getName()).log(Level.SEVERE, null, ex);
              }

    }
      
                    
            public void fillEmployeeJTable  (JTable table,String valueToSearch){
     String SelectAll=("SELECT * FROM employee WHERE CONCAT(`id`,`firstname`,`lastname`,`jobtitle`,`employeecode`,`password`)LIKE ?");
    
           
              
              try {
                  Connection con=getConnection();
                 PreparedStatement ps=con.prepareStatement(SelectAll);
                    ps.setString(1,"%"+valueToSearch+"%");
                    
                    
                    
                       ResultSet rs=ps.executeQuery();
                       DefaultTableModel model=(DefaultTableModel)table.getModel();
                       
                       Object[] row;
                       
                       while(rs.next()){
                       
                       row= new Object[6];
                       
                       row[0]=rs.getInt(1);
                        row[1]=rs.getString(2);
                       row[2]=rs.getString(3);
                       row[3]=rs.getString(4);
                        row[4]=rs.getString(5);
                         row[5]=rs.getString(6);
                       model.addRow(row);
                       }
                       
              } catch (SQLException ex) {
                  Logger.getLogger(table.class.getName()).log(Level.SEVERE, null, ex);
              }

    }
                   
        public void fillCatalogRecordJTable (JTable table,String valueToSearch){
     String SelectAll=("SELECT * FROM catalogrecord WHERE CONCAT(`id`,`title`,`genre_id`,`documenttype_id`,`author_id`,`publisher_id`,`datereleased`,`conditionstatement`)LIKE ?");
    
           
              
              try {
                  Connection con=getConnection();
                 PreparedStatement ps=con.prepareStatement(SelectAll);
                    ps.setString(1,"%"+valueToSearch+"%");
                    
                    
                    
                       ResultSet rs=ps.executeQuery();
                       DefaultTableModel model=(DefaultTableModel)table.getModel();
                       
                       Object[] row;
                       
                       while(rs.next()){
                       
                       row= new Object[8];
                       
                       row[0]=rs.getInt(1);
                        row[1]=rs.getString(2);
                       row[2]=rs.getString(3);
                       row[3]=rs.getString(4);
                        row[4]=rs.getString(5);
                         row[5]=rs.getString(6);
                          row[6]=rs.getString(7); 
                            row[7]=rs.getString(8);
                       model.addRow(row);
                       }
                       
              } catch (SQLException ex) {
                  Logger.getLogger(JIFManageCatalogrecord.class.getName()).log(Level.SEVERE, null, ex);
              }

    }
                            
       public void fillCatalogloanJTable (JTable table,String valueToSearch){
     String SelectAll=("SELECT * FROM catalogloan WHERE CONCAT(`id`,catalogRecord_id`,`Customer_id`,`loandate`,`recieveddate`,`loancode`,`employee_id`)LIKE ?");
    
           
              
              try {
                  Connection con=getConnection();
                 PreparedStatement ps=con.prepareStatement(SelectAll);
                    ps.setString(1,"%"+valueToSearch+"%");
                    
                    
                    
                       ResultSet rs=ps.executeQuery();
                       DefaultTableModel model=(DefaultTableModel)table.getModel();
                       
                       Object[] row;
                       
                       while(rs.next()){
                       
                       row= new Object[7];
                       
                       row[0]=rs.getInt(1);
                        row[1]=rs.getString(2);
                       row[2]=rs.getString(3);
                       row[3]=rs.getString(4);
                        row[4]=rs.getString(5);
                         row[5]=rs.getString(6);
                         row[6]=rs.getString(7);
                       model.addRow(row);
                       }
                       
              } catch (SQLException ex) {
                  Logger.getLogger(JIFManageCatalogloan.class.getName()).log(Level.SEVERE, null, ex);
              }

    }
                    
}

