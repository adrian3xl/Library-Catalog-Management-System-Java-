/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudManager;

import Domain.Author;
import java.util.ArrayList;
import java.util.List;
import Service.Factory;
import Service.IAuthorService;
import Service.Exceptions.ServiceLoadException;
import Service.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author KRichards
 */
public class AuthorManager {
    
    ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
   
    
    public void addAuthor(Author anAuthor, String using)
    {
        try {
            System.out.println("In Business Layer addAuthor(Author author) method");
          //  Factory factory = new Factory();            
          //  IAuthorService iAuthorMgr = (IAuthorService) factory.getTheService(IAuthorService.NAME);
          
          IAuthorService iAuthorMgr=null;
          if(using.equals("JDBC"))
             iAuthorMgr=(IAuthorService) context.getBean("JDBC");
                     
                     else if(using.equals("HIBER"))
                        iAuthorMgr=(IAuthorService) context.getBean("HIBER");  
          
          iAuthorMgr.addAuthor(anAuthor);
            
        } catch (ServiceLoadException ex) {
         
           System.out.print(ex.getMessage());
        } catch (Exception ex) {
            
            System.out.print(ex.getMessage());
        }
    }
    public Author getAuthor(int authorId,String using)
    {
        Author anAuthor=new Author();
          IAuthorService iAuthorMgr=null;
        try {
            System.out.println("In Business Layer getAuthor(int authorId) method");
          //  Factory factory = new Factory();           
           // IAuthorService iAuthorMgr = (IAuthorService) factory.getTheService(IAuthorService.NAME);
           
            if(using.equals("JDBC"))
             iAuthorMgr=(IAuthorService) context.getBean("JDBC");
                     
           else if(using.equals("HIBER"))
           iAuthorMgr=(IAuthorService) context.getBean("HIBER");  
           
           
            anAuthor=iAuthorMgr.getAuthor(authorId);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            
        }
        return anAuthor;
    }
    
    public void updateAuthor(Author anAuthor,String using)
    {
        try {
            System.out.println("In Business Layer updateAuthor(Author anAuthor) method");
           // Factory factory = new Factory();            
          //  IAuthorService iAuthorMgr = (IAuthorService) factory.getTheService(IAuthorService.NAME);
            IAuthorService iAuthorMgr=null;
            
            if(using.equals("JDBC"))
             iAuthorMgr=(IAuthorService) context.getBean("JDBC");
                     
           else if(using.equals("HIBER"))
           iAuthorMgr=(IAuthorService) context.getBean("HIBER");  
           
          
          iAuthorMgr.updateAuthor(anAuthor);
            
        } catch (ServiceLoadException ex) {
          
           System.out.println(ex.getMessage()); 
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
        }
    }
    
    public List<Author> getAllAuthors(String using)
    {
        List<Author> authorsList = new ArrayList<>();
        try {
            System.out.println("In Business Layer getAllAthors method");
          //  Factory factory = new Factory();
            //IAuthorService iAuthorMgr = (IAuthorService) factory.getTheService(IAuthorService.NAME);
           
             IAuthorService iAuthorMgr=null;
            
            if(using.equals("JDBC"))
             iAuthorMgr=(IAuthorService) context.getBean("JDBC");
                     
           else if(using.equals("HIBER"))
           iAuthorMgr=(IAuthorService) context.getBean("HIBER");  
           
            
            authorsList=iAuthorMgr.getAllAuthors();
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            
        }
        return authorsList;
    }
    
    
    public void deleteAuthor(Class<?> Author, int authorId, String using)
    {
        try {
            System.out.println("In Business Layer deleteAuhor method");
         //   Factory factory = new Factory();
           // IAuthorService iAuthorMgr = (IAuthorService) factory.getTheService(IAuthorService.NAME);
            
              IAuthorService iAuthorMgr=null;
            
            if(using.equals("JDBC"))
             iAuthorMgr=(IAuthorService) context.getBean("JDBC");
                     
           else if(using.equals("HIBER"))
           iAuthorMgr=(IAuthorService) context.getBean("HIBER");  
           
           
           
           
           iAuthorMgr.deleteAuthor(Author, authorId);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            
            System.out.println(ex.getMessage());
        }
    }

    public AuthorManager() {
    }
    
    
    
}
