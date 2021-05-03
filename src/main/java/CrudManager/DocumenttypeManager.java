/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudManager;
import Domain.Documenttype;
import java.util.ArrayList;
import java.util.List;
import Service.Factory;
import Service.IDocumenttypeService;
import Service.Exceptions.ServiceLoadException;
import Service.IDocumenttypeServiceJDBC;
import Service.SpringConfig;
import java.sql.ResultSet;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 *
 * @author Adrian
 */
public class DocumenttypeManager {
    ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    final static Logger logger = Logger.getLogger(DocumenttypeManager.class); 
public void addDocumenttype (Documenttype anDocumenttype, String using)
    {
        System.out.println("In Business Layer addDocumenttype(Documenttype documenttype, String using) method");
        try {            
            ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
            IDocumenttypeService iDocumenttypeMgr=null;            
           
            if(using.equals("JDBC11")){
                iDocumenttypeMgr=(IDocumenttypeService) context.getBean("JDBC11");
                iDocumenttypeMgr.addDocumenttypeJDBC(anDocumenttype);
            }
            else if(using.equals("HIBER11"))
                iDocumenttypeMgr=(IDocumenttypeService) context.getBean("HIBER11");
                iDocumenttypeMgr.addDocumenttype(anDocumenttype);
            
        } catch (ServiceLoadException ex) {
         
           System.out.print(ex.getMessage());
        } catch (Exception ex) {
            
            System.out.print(ex.getMessage());
             logger.error(ex.getMessage());
        }
    }
    
     public Documenttype getDocumenttype(int documenttypeId,String using)
    {       
        Documenttype anDocumenttype=new Documenttype();
        System.out.println("In Business Layer getDocumenttype(int documenttypeId,String using) method");
            ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        try {            
           // Factory factory = new Factory();           
          //  IDocumenttypeService iDocumenttypeMgr = (IDocumenttypeService) factory.getTheService(IDocumenttypeService.NAME);
          if(using.equals("HIBER11")){
              System.out.println("getting Documenttype using Hibernate");
           IDocumenttypeService iDocumenttypeMgr = (IDocumenttypeService) context.getBean("HIBER11");
           anDocumenttype=iDocumenttypeMgr.getDocumenttype(documenttypeId);
          }
          else if(using.equals("JDBC11"))
          {
             System.out.println("getting Documenttype using JDBC"); 
              IDocumenttypeService iDocumenttypeMgr = (IDocumenttypeService) context.getBean("JDBC11");
              anDocumenttype=iDocumenttypeMgr.getDocumenttypeJDBC(documenttypeId);
          }
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
             logger.error(ex.getMessage());
            
        }
        return anDocumenttype;
    }
    
    public void updateDocumenttype(Documenttype anDocumenttype,String using)
    {
        System.out.println("In Business Layer updateDocumenttype(Documenttype anDocumenttype, String using) method");
       try {            
            ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
            // Factory factory = new Factory();            
           // IDocumenttypeService iDocumenttypeMgr = (IDocumenttypeService) factory.getTheService(IDocumenttypeService.NAME);
           if(using.equals("HIBER11")){
           IDocumenttypeService iDocumenttypeMgr = (IDocumenttypeService)context.getBean("HIBER11");           
           iDocumenttypeMgr.updateDocumenttype(anDocumenttype);
           }
           else if(using.equals("JDBC11"))
           {
               IDocumenttypeService iDocumenttypeMgr = (IDocumenttypeService)context.getBean("JDBC11");           
               iDocumenttypeMgr.updateDocumenttypeJDBC(anDocumenttype);
           }          
            
        } catch (ServiceLoadException ex) {
          
           System.out.println(ex.getMessage()); 
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
            logger.error(ex.getMessage());
        }
}     
  
        
    public List<Documenttype> getAllDocumenttypes(String using)
    {
        List<Documenttype> documenttypesList = new ArrayList<>();
        ResultSet rs=null;        
        System.out.println("In Business Layer getAllAthors(String using) method");
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
           try {
               if(using.equals("JDBC11")){
                IDocumenttypeService iDocumenttypeMgr = (IDocumenttypeService) context.getBean("JDBC11");
               // Factory factory = new Factory();
                //IDocumenttypeService iDocumenttypeMgr = (IDocumenttypeService) factory.getTheService(IDocumenttypeService.NAME);
                 rs=iDocumenttypeMgr.getAllDocumenttypeJDBC();
                 //convert resultset to list
                 int i=0;
                 while(rs.next()) {
                     documenttypesList.add(rs.getObject(i,Documenttype.class));
                     i++;
                     }         
               }               
               else if(using.equals("HIBER11"))
               {
                   IDocumenttypeService iDocumenttypeMgr = (IDocumenttypeService) context.getBean("HIBER11");
                  documenttypesList=iDocumenttypeMgr.getAllDocumenttype();                 
               }
            } catch (ServiceLoadException ex) {
              System.out.println(ex.getMessage());

            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                 logger.error(ex.getMessage());
            }              
        return documenttypesList;
    }
    
    public ResultSet getAllDocumenttypesJDBC()
    {
        ResultSet rs=null;
        List<Documenttype> DocumenttypesList = new ArrayList<>();
        try {
            logger.info("In Business Layer getAllAthors JDBC method");
            System.out.println("In Business Layer getAllAthors JDBC method");
            Factory factory = new Factory();
            IDocumenttypeServiceJDBC iDocumenttypeMgrJDBC = (IDocumenttypeServiceJDBC) factory.getTheService(IDocumenttypeServiceJDBC.NAME);
            rs=iDocumenttypeMgrJDBC.getAllDocumenttypeJDBC();
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
             logger.error(ex.getMessage());
             
        }
        return rs;
    }
    
    
    public void deleteDocumenttype(Class<?> Documenttype, int DocumenttypeId,String using)
    {
        try {
            System.out.println("In Business Layer deleteAuhor method");
            //Factory factory = new Factory();
            //IDocumenttypeService iDocumenttypeMgr = (IDocumenttypeService) factory.getTheService(IDocumenttypeService.NAME);
            ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
            
            if(using.equals("HIBER11"))
            {
            IDocumenttypeService iDocumenttypeMgr = (IDocumenttypeService) context.getBean("HIBER11");
            iDocumenttypeMgr.deleteDocumenttype(Documenttype, DocumenttypeId);            
            }
            else if(using.equals("JDBC11"))
            {
               IDocumenttypeService iDocumenttypeMgr = (IDocumenttypeService) context.getBean("HIBER11");
               iDocumenttypeMgr.deleteDocumenttypeJDBC(DocumenttypeId);             
            }
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            
            System.out.println(ex.getMessage());
             logger.error(ex.getMessage());
        }
    }

    public DocumenttypeManager() {
    }
    
    
    
}
