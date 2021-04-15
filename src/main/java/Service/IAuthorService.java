/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Domain.Author;
import java.sql.ResultSet;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author adrian
 */
@Component
public interface IAuthorService extends IService {
    
    public final String NAME="IAuthorService";
    
    public void addAuthor(Author author) throws Exception ; //method for adding book
    
    public void updateAuthor(Author author) throws Exception ; //method for updating a book
    
    public Author getAuthor(int authorID) throws Exception ; //method to select book
    
    public List<Author> getAllAuthors() throws Exception;
    
    public void deleteAuthor(Class<?> Author, int authorId) throws Exception;
    
        
    public void addAuthorJDBC(Author author) throws Exception ; //method for adding author
    
    public void updateAuthorJDBC(Author author) throws Exception ; //method for updating a author
    
    public Author getAuthorJDBC(int id) throws Exception ; //method to select author
    
    public ResultSet getAllAuthorsJDBC() throws Exception;
    
    public void deleteAuthorJDBC(int id) throws Exception;
    
}
