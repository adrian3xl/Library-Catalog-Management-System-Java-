/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudManager;

import static CrudManager.AuthorJDBCManager.logger;
import Domain.Author;
import java.util.ArrayList;
import java.util.List;
import Service.Factory;
import Service.IAuthorService;
import Service.Exceptions.ServiceLoadException;
import Service.IAuthorServiceJDBC;
import Service.SpringConfig;
import java.sql.ResultSet;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author ab
 */
public class AuthorManager {
    
   ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
      final static Logger logger = Logger.getLogger(AuthorManager.class); 
      
    public void addAuthor(Author anAuthor, String using)
    {
        System.out.println("In Business Layer addAuthor(Author author, String using) method");
        try {            
            ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
            IAuthorService iAuthorMgr=null;            
            //loose coupling
            if(using.equals("JDBC")){
                iAuthorMgr=(IAuthorService) context.getBean("JDBC");
                iAuthorMgr.addAuthorJDBC(anAuthor);
            }
            else if(using.equals("HIBER"))
                iAuthorMgr=(IAuthorService) context.getBean("HIBER");
                iAuthorMgr.addAuthor(anAuthor);
            
        } catch (ServiceLoadException ex) {
         
           System.out.print(ex.getMessage());
        } catch (Exception ex) {
            
            System.out.print(ex.getMessage());
             logger.error(ex.getMessage());
        }
    }
    public Author getAuthor(int authorId,String using)
    {       
        Author anAuthor=new Author();
        System.out.println("In Business Layer getAuthor(int authorId,String using) method");
            ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        try {            
           // Factory factory = new Factory();           
          //  IAuthorService iAuthorMgr = (IAuthorService) factory.getTheService(IAuthorService.NAME);
          if(using.equals("HIBER")){
              System.out.println("getting author using Hibernate");
           IAuthorService iAuthorMgr = (IAuthorService) context.getBean("HIBER");
           anAuthor=iAuthorMgr.getAuthor(authorId);
          }
          else if(using.equals("JDBC"))
          {
             System.out.println("getting author using JDBC"); 
              IAuthorService iAuthorMgr = (IAuthorService) context.getBean("JDBC");
              anAuthor=iAuthorMgr.getAuthorJDBC(authorId);
          }
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
             logger.error(ex.getMessage());
            
        }
        return anAuthor;
    }
    
    public void updateAuthor(Author anAuthor,String using)
    {
        System.out.println("In Business Layer updateAuthor(Author anAuthor, String using) method");
       try {            
            ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
            // Factory factory = new Factory();            
           // IAuthorService iAuthorMgr = (IAuthorService) factory.getTheService(IAuthorService.NAME);
           if(using.equals("HIBER")){
           IAuthorService iAuthorMgr = (IAuthorService)context.getBean("HIBER");           
           iAuthorMgr.updateAuthor(anAuthor);
           }
           else if(using.equals("JDBC"))
           {
               IAuthorService iAuthorMgr = (IAuthorService)context.getBean("JDBC");           
               iAuthorMgr.updateAuthorJDBC(anAuthor);
           }          
            
        } catch (ServiceLoadException ex) {
          
           System.out.println(ex.getMessage()); 
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
            logger.error(ex.getMessage());
        }
}     
  
        
    public List<Author> getAllAuthors(String using)
    {
        List<Author> authorsList = new ArrayList<>();
        ResultSet rs=null;        
        System.out.println("In Business Layer getAllAthors(String using) method");
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
           try {
               if(using.equals("JDBC")){
                IAuthorService iAuthorMgr = (IAuthorService) context.getBean("JDBC");
               // Factory factory = new Factory();
                //IAuthorService iAuthorMgr = (IAuthorService) factory.getTheService(IAuthorService.NAME);
                 rs=iAuthorMgr.getAllAuthorsJDBC();
                 //convert resultset to list
                 int i=0;
                 while(rs.next()) {
                     authorsList.add(rs.getObject(i,Author.class));
                     i++;
                     }         
               }               
               else if(using.equals("HIBER"))
               {
                   IAuthorService iAuthorMgr = (IAuthorService) context.getBean("HIBER");
                  authorsList=iAuthorMgr.getAllAuthors();                 
               }
            } catch (ServiceLoadException ex) {
              System.out.println(ex.getMessage());

            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                 logger.error(ex.getMessage());
            }              
        return authorsList;
    }
    
    public ResultSet getAllAuthorsJDBC()
    {
        ResultSet rs=null;
        List<Author> authorsList = new ArrayList<>();
        try {
            logger.info("In Business Layer getAllAthors JDBC method");
            System.out.println("In Business Layer getAllAthors JDBC method");
            Factory factory = new Factory();
            IAuthorServiceJDBC iAuthorMgrJDBC = (IAuthorServiceJDBC) factory.getTheService(IAuthorServiceJDBC.NAME);
            rs=iAuthorMgrJDBC.getAllAuthorsJDBC();
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
             logger.error(ex.getMessage());
             
        }
        return rs;
    }
    
    
    public void deleteAuthor(Class<?> Author, int authorId,String using)
    {
        try {
            System.out.println("In Business Layer deleteAuhor method");
            //Factory factory = new Factory();
            //IAuthorService iAuthorMgr = (IAuthorService) factory.getTheService(IAuthorService.NAME);
            ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
            
            if(using.equals("HIBER"))
            {
            IAuthorService iAuthorMgr = (IAuthorService) context.getBean("HIBER");
            iAuthorMgr.deleteAuthor(Author, authorId);            
            }
            else if(using.equals("JDBC"))
            {
               IAuthorService iAuthorMgr = (IAuthorService) context.getBean("HIBER");
               iAuthorMgr.deleteAuthorJDBC(authorId);             
            }
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            
            System.out.println(ex.getMessage());
             logger.error(ex.getMessage());
        }
    }

    public AuthorManager() {
    }
    
    
    
}
