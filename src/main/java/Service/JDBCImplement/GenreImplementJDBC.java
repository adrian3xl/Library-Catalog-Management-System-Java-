/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.JDBCImplement;

import Domain.Genre;
import Service.IGenreServiceJDBC;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Adrian
 */
public class GenreImplementJDBC extends JDBCMainConfiguration implements IGenreServiceJDBC {

     Statement statement;
     
    @Override
    public void addGenreJDBC(Genre genre) throws Exception {
        String insertGenre = "INSERT INTO genre(name) "
                + "values('" + genre.getName()+ "')";    
        
        statement=this.getConnection().createStatement();        
        statement.execute(insertGenre);      
        
        this.getConnection().close();       
    }

    @Override
    public void updateGenreJDBC(Genre genre) throws Exception {
        String updateGenre = "UPDATE author SET  name = '" + genre.getName()+ 
                
                "' WHERE ID = '"+ genre.getId() +"'";        
        
        statement = this.getConnection().createStatement();
        
        int rowsUpdated = statement.executeUpdate(updateGenre);
        if (rowsUpdated > 0) {
            System.out.println("Update Successful");
        }
        
        this.getConnection().close();  
    }

    @Override
    public Genre getGenreJDBC(int genreID) throws Exception {
          String selectGenre = "Select * From genre Where id = " + genreID;
        statement=this.getConnection().createStatement();
        
        ResultSet rs=statement.executeQuery(selectGenre);
        
        Genre genre=new Genre();
        genre.setId(genreID);
       
        genre.setName(rs.getString("lastname"));
      
        
        return genre;
    }

    @Override
    public ResultSet getAllGenreJDBC() throws Exception {
        ResultSet rs=null;
        
        String SelectAll="Select * From genre";
        statement=this.getConnection().createStatement();
        rs=statement.executeQuery(SelectAll);
        
        return rs;
    }

    @Override
    public void deleteGenreJDBC(int genreId) throws Exception {
        statement=this.getConnection().createStatement();
        statement.execute("Delete From author Where id = " + genreId);
    }
    
}
