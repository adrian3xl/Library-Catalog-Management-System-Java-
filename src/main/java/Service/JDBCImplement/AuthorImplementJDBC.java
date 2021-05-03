/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.JDBCImplement;

import Service.HibernateImplement.*;
import Domain.Author;
import Service.IAuthorService;
import java.util.ArrayList;
import java.util.List;
import Service.IAuthorServiceJDBC;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import org.springframework.stereotype.Component;

/**
 *
 * @author Abailey
 */

@Component("JDBC")
public class AuthorImplementJDBC extends JDBCMainConfiguration implements IAuthorService {
    
 Statement statement;
 
 @Override 
    public void addAuthorJDBC(Author author) throws Exception {
        
        String insertAuthor = "INSERT INTO author(id, authorcode, firstname, lastname) "
                + "values('" + author.getId() + 
                "', '" + author.getAuthorcode()+
                "', '" + author.getFname() + 
                "', '" + author.getLname() + "')";    
        
        statement=this.getConnection().createStatement();        
        statement.execute(insertAuthor);      
        
        this.getConnection().close();       
    }

    @Override
    public void updateAuthorJDBC(Author author) throws Exception {
           
        String updateAuthor = "UPDATE author SET authorcode = '" + author.getAuthorcode()+ 
                "', firstname = '" + author.getFname() + 
                "', lastname = '" + author.getFname() + 
                
                "' WHERE ID = '"+ author.getId() +"'";        
        
        statement = this.getConnection().createStatement();
        
        int rowsUpdated = statement.executeUpdate(updateAuthor);
        if (rowsUpdated > 0) {
            System.out.println("Update Successful");
        }
        
        this.getConnection().close();  
    }

    @Override
    public Author getAuthorJDBC(int authorID) throws Exception {
        String selectAuthor = "Select * From author Where id = " + authorID;
        statement=this.getConnection().createStatement();
        
        ResultSet rs=statement.executeQuery(selectAuthor);
        
        Author author=new Author();
        author.setId(authorID);
       
        author.setFname(rs.getString("firstname"));
        author.setLname(rs.getString("lastname"));
        author.setAuthorcode(rs.getString("authorcode"));
        
        return author;
        
    }

    @Override
    public ResultSet getAllAuthorsJDBC() throws Exception {
        ResultSet rs=null;
        PreparedStatement ps;
        
        String SelectAll="Select * From authors";
        //statement=this.getConnection().createStatement();
        ps=this.getConnection().prepareStatement(SelectAll, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        rs=ps.executeQuery(SelectAll);
        
        
        return rs;
    }


    @Override
    public void deleteAuthorJDBC(int authorId) throws Exception {
        statement=this.getConnection().createStatement();
        statement.execute("Delete From author Where id = " + authorId);
    }

    @Override
    public void addAuthor(Author author) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateAuthor(Author author) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Author getAuthor(int authorID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Author> getAllAuthors() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteAuthor(Class<?> Author, int authorId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
