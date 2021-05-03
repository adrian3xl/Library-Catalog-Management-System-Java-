/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import Domain.Author;
import Domain.Catalogrecord;
import Domain.Customer;
import Domain.Documenttype;
import Domain.Employee;
import Domain.Genre;
import Domain.Publisher;
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
    
        public HashMap<String, Integer>getDocMap(){
    
    HashMap<String, Integer> map = new HashMap<>();
    String SelectAll= "Select * FROM `documenttype`";
         
       Documenttype documenttype;
       PreparedStatement ps; 
       ResultSet rs;
        try {
            rs=jdbc.getConnection().createStatement().executeQuery(SelectAll);
             while (rs.next()){
           
               documenttype = new  Documenttype(rs.getInt("id"),rs.getString("name"));
               map.put(documenttype.getName(),documenttype.getId());
                 //genrecombo.addItem(rs.getString("name"));
             } 
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(combobox.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return map;
    }
        
   
     public HashMap<String, Integer>getAuthMap(){
    
    HashMap<String, Integer> map = new HashMap<>();
    String SelectAll= "Select * FROM `author`";
         
       Author author;
       PreparedStatement ps; 
       ResultSet rs;
        try {
            rs=jdbc.getConnection().createStatement().executeQuery(SelectAll);
             while (rs.next()){
           
               author = new Author(rs.getInt("id"),rs.getString("authorcode"));
               map.put(author.getAuthorcode(),author.getId());
                 //genrecombo.addItem(rs.getString("name"));
             } 
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(combobox.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return map;
    }
        
    
    public HashMap<String, Integer>getpubMap(){
    
    HashMap<String, Integer> map = new HashMap<>();
    String SelectAll= "Select * FROM `publisher`";
         
       Publisher publisher;
       PreparedStatement ps; 
       ResultSet rs;
        try {
            rs=jdbc.getConnection().createStatement().executeQuery(SelectAll);
             while (rs.next()){
           
               publisher = new Publisher(rs.getInt("id"),rs.getString("publishercode"));
               map.put(publisher.getPublishercode(),publisher.getId());
                 //genrecombo.addItem(rs.getString("name"));
             } 
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(combobox.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return map;
    }
        
     public HashMap<String, Integer>getCustMap(){
    
    HashMap<String, Integer> map = new HashMap<>();
    String SelectAll= "Select * FROM `customer`";
         
       Customer customer;
       PreparedStatement ps; 
       ResultSet rs;
        try {
            rs=jdbc.getConnection().createStatement().executeQuery(SelectAll);
             while (rs.next()){
           
               customer = new Customer(rs.getInt("id"),rs.getString("customercode"));
               map.put(customer.getCustomercode(),customer.getId());
                 //genrecombo.addItem(rs.getString("name"));
             } 
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(combobox.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return map;
    }
    
    
    public HashMap<String, Integer>getEmpMap(){
    
    HashMap<String, Integer> map = new HashMap<>();
    String SelectAll= "Select * FROM `employee`";
         
       Employee employee;
       PreparedStatement ps; 
       ResultSet rs;
        try {
            rs=jdbc.getConnection().createStatement().executeQuery(SelectAll);
             while (rs.next()){
           
               employee = new Employee(rs.getInt("id"),rs.getString("employeecode"));
               map.put(employee.getEmployeecode(),employee.getId());
                 //genrecombo.addItem(rs.getString("name"));
             } 
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(combobox.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return map;
    }
    
    
    public HashMap<String, Integer>getcatrecMap(){
    
    HashMap<String, Integer> map = new HashMap<>();
    String SelectAll= "Select * FROM `catalogrecord`";
         
       Catalogrecord catalogrecord;
       PreparedStatement ps; 
       ResultSet rs;
        try {
            rs=jdbc.getConnection().createStatement().executeQuery(SelectAll);
             while (rs.next()){
           
               catalogrecord = new Catalogrecord(rs.getInt("id"),rs.getString("title"));
               map.put(catalogrecord.getTitle(),catalogrecord.getId());
                 //genrecombo.addItem(rs.getString("name"));
             } 
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(combobox.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return map;
    }
    
    
    
//  Below was what i was using in the jframe for catalogloan to display data in combo box    
/////////////////////////////////////////////////////////////////////////////////////////////////////////////    
 
    /*
    
        public void doctypecombobox(){

String SelectAll= "Select name FROM documenttype";
         
       
       PreparedStatement ps; 
       ResultSet rs;
        try {
            rs=jdbc.getConnection().createStatement().executeQuery(SelectAll);
             while (rs.next()){
             //doccombo.addItem(rs.getString("name"));
             } 
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(JIFManageCatalogloan.class.getName()).log(Level.SEVERE, null, ex);
        }


}
 
 public void pubcombobox(){

String SelectAll= "Select publishercode FROM publisher";
         
       
       PreparedStatement ps; 
       ResultSet rs;
        try {
            rs=jdbc.getConnection().createStatement().executeQuery(SelectAll);
             while (rs.next()){
            // pubcombo.addItem(rs.getString("publishercode"));
             } 
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(JIFManageCatalogloan.class.getName()).log(Level.SEVERE, null, ex);
        }


}
    
    
   public void authcombobox(){

String SelectAll= "Select authorcode FROM author";
         
       
       PreparedStatement ps; 
       ResultSet rs;
        try {
            rs=jdbc.getConnection().createStatement().executeQuery(SelectAll);
             while (rs.next()){
          //   authcombo1.addItem(rs.getString("authorcode"));
             } 
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(JIFManageCatalogloan.class.getName()).log(Level.SEVERE, null, ex);
        }


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
    
     public void titlecombobox(){

String SelectAll= "Select title FROM catalogrecord";
         
       
       PreparedStatement ps; 
       ResultSet rs;
        try {
            rs=jdbc.getConnection().createStatement().executeQuery(SelectAll);
             while (rs.next()){
         //   catcombo.addItem(rs.getString("title"));
             } 
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(JIFManageCatalogloan.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    } 
  public void employeecombobox(){

String SelectAll= "Select employeecode FROM employee";
         
       
       PreparedStatement ps; 
       ResultSet rs;
        try {
            rs=jdbc.getConnection().createStatement().executeQuery(SelectAll);
             while (rs.next()){
          //  empcombo.addItem(rs.getString("employeecode"));
             } 
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(JIFManageCatalogloan.class.getName()).log(Level.SEVERE, null, ex);
        }


}
   
            
public void customercombobox(){

String SelectAll= "Select customercode FROM customer";
         
       
       PreparedStatement ps; 
       ResultSet rs;
        try {
            rs=jdbc.getConnection().createStatement().executeQuery(SelectAll);
             while (rs.next()){
            // custcombo1.addItem(rs.getString("customercode"));
             } 
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(JIFManageCatalogloan.class.getName()).log(Level.SEVERE, null, ex);
        }


}
    
    
    
 */
    
}
