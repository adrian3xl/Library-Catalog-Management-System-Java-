/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.HibernateImplement;
import Domain.Documenttype;
import Service.HibernateImplement.HibernateMainConfig;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import Service.IDocumenttypeService;
import Service.IAuthorService;
import com.mysql.cj.protocol.Resultset;
import java.sql.ResultSet;
import java.sql.Statement;
import org.springframework.stereotype.Component;
/**
 *
 * @author Adrian
 */
@Component("HIBER11")
public class DocumenttypeImplement extends HibernateMainConfig implements IDocumenttypeService {

     Statement statement;
     
    @Override
    public void addDocumenttype(Documenttype documenttype) throws Exception {
                
        Session session = this.getSession();
         Transaction transact=null;
         try{
             transact=session.beginTransaction();
             session.save(documenttype);
             transact.commit();
         }
         catch(HibernateException hex){
             if(session!=null)
             {
                 transact.rollback();
                 throw new HibernateException("Not able to save documenttype; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                    //  session.flush();
                   //   session.close();
                     }      
         
         
     }
    

    @Override
    public void updateDocumenttype(Documenttype documenttype) throws Exception {
       Session session = DocumenttypeImplement.getSession();
         Transaction transact=null;
         try{
            
             transact=session.beginTransaction();
             session.update(documenttype);
             transact.commit();
         }
         catch(HibernateException hex){
             if(session!=null)
             {
                 transact.rollback();
                 throw new HibernateException("Not able to update Documenttype; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                     // session.flush();
                      //session.close();
                     }
    }

    @Override
    public Documenttype getDocumenttype(int id) throws Exception {
        Session session = DocumenttypeImplement.getSession();
         Transaction transact=null;
        
          Documenttype anDocumenttype=null;
         try{
             transact=session.beginTransaction();
             anDocumenttype = (Documenttype) session.load(Documenttype.class, id);             
             transact.commit();
         }
         catch(HibernateException hex){
             if(session!=null)
             {
                 transact.rollback();
                 throw new HibernateException("Not able to load Documenttype with id " + id + "; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                  //   session.flush();
                   //  session.close();
                     }
         
        return anDocumenttype;
    }

    @Override
    public List<Documenttype> getAllDocumenttype() throws Exception {
        Session session1 = this.getSession();
         Transaction transact=null;
         List<Documenttype> documenttypeList =  new ArrayList<>();
         try{
             transact=session1.beginTransaction();
             documenttypeList = (List<Documenttype>) session1.createQuery("from Documenttype").list();
             transact.commit();
             }
         catch(HibernateException hex){
             if(session1!=null)
             {
                 transact.rollback();
                 throw new HibernateException("Not able to load all Documenttype; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                      //session1.flush();
                      //session1.close();
                     }
         return  documenttypeList;
    }

    @Override
    public void deleteDocumenttype(Class<?> Documenttype, int documenttypeId) throws Exception {
        Session session = DocumenttypeImplement.getSession();
         Transaction transact=null;
         try{
             transact=session.beginTransaction();
             Object persistentInstance = session.load(Documenttype, documenttypeId);
             
                      session.delete(persistentInstance);
                      transact.commit(); 
              }
         catch(HibernateException hex){
             if(session!=null)
             {
                 transact.rollback();
                 throw new HibernateException("Not able to delete Documenttype; rolling back transaction " + hex.getMessage());
             }
         }
         finally {
                      session.flush();
                      session.close();
                     }
    }

    @Override
    public void addDocumenttypeJDBC(Documenttype documenttype) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateDocumenttypeJDBC(Documenttype documenttype) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Documenttype getDocumenttypeJDBC(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet getAllDocumenttypeJDBC() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteDocumenttypeJDBC(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
