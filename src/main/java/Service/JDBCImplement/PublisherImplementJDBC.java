/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.JDBCImplement;

import Domain.Publisher;
import Service.IPublisherService;
import Service.IPublisherServiceJDBC;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author Adrian
 */
@Component("JDBC1")
public class PublisherImplementJDBC extends JDBCMainConfiguration implements IPublisherService {

    Statement statement;
    
    @Override
    public void addPublisherJDBC(Publisher publisher) throws Exception {
          String insertAuthor = "INSERT INTO publisher(id, publishercode, firstname, lastname) "
                + "values('" + publisher.getId() + 
                "', '" + publisher.getPublishercode()+
                "', '" + publisher.getFname() + 
                "', '" + publisher.getLname() + "')";    
        
        statement=this.getConnection().createStatement();        
        statement.execute(insertAuthor);      
        
        this.getConnection().close();       
    }


    @Override
    public void updatePublisherJDBC(Publisher publisher) throws Exception  
    {  String updatePublisher = "UPDATE publisher SET publishercode = '" + publisher.getPublishercode()+ 
                "', firstname = '" + publisher.getFname() + 
                "', lastname = '" + publisher.getFname() + 
                
                "' WHERE ID = '"+ publisher.getId() +"'";        
        
        statement = this.getConnection().createStatement();
        
        int rowsUpdated = statement.executeUpdate(updatePublisher);
        if (rowsUpdated > 0) {
            System.out.println("Update Successful");
        }
        
        this.getConnection().close();  
    }

    @Override
    public Publisher getPublisherJDBC(int publisherID) throws Exception {
        String selectPublisher = "Select * From publisher Where id = " + publisherID;
        statement=this.getConnection().createStatement();
        
        ResultSet rs=statement.executeQuery(selectPublisher);
        
        Publisher publisher =new Publisher();
        publisher.setId(publisherID);
        publisher.setPublishercode(rs.getString("publishercode"));
        publisher.setFname(rs.getString("firstname"));
        publisher.setLname(rs.getString("lastname"));
             
        
        return publisher ;
        
    }

    @Override
    public ResultSet getAllPublishersJDBC() throws Exception {
     ResultSet rs=null;
        
        String SelectAll="Select * From publisher";
        statement=this.getConnection().createStatement();
        rs=statement.executeQuery(SelectAll);
        
        return rs;
    }

    @Override
    public void deletePublisherJDBC(int publisherId) throws Exception {
     statement=this.getConnection().createStatement();
        statement.execute("Delete From publisher Where id = " + publisherId);
    }

    @Override
    public void addPublisher(Publisher publisher) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updatePublisher(Publisher publisher) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Publisher getPublisher(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List getAllPublishers() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletePublisher(Class<?> Publisher, int publisherId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
