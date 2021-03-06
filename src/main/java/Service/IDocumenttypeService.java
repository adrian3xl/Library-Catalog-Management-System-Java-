/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Domain.Documenttype;
import java.sql.ResultSet;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author Adrian
 */

@Component
public interface IDocumenttypeService extends IService {
    
public final String NAME="IDocumenttypeService";
    
    public void addDocumenttype (Documenttype documenttype) throws Exception ; //method for adding Documenttype
    
    public void updateDocumenttype (Documenttype documenttype) throws Exception ; //method for updating a Documenttype
    
    public Documenttype getDocumenttype (int id) throws Exception ; //method to select Documenttype
    
    public List getAllDocumenttype () throws Exception;
    
    public void deleteDocumenttype (Class<?> Documenttype, int documenttypeId) throws Exception; 
    
     public void addDocumenttypeJDBC(Documenttype documenttype) throws Exception ; //method for adding Documenttype
    
    public void updateDocumenttypeJDBC(Documenttype documenttype) throws Exception ; //method for updating a Documenttype
    
    public Documenttype getDocumenttypeJDBC(int id) throws Exception ; //method to select Documenttype
    
    public ResultSet getAllDocumenttypeJDBC() throws Exception;
    
    public void deleteDocumenttypeJDBC(int id) throws Exception; 
    
    
}