 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudManager;
import Domain.Publisher;
import java.util.ArrayList;
import java.util.List;
import Service.Factory;
import Service.IPublisherService;
import Service.Exceptions.ServiceLoadException;
import Service.IPublisherServiceJDBC;
import Service.SpringConfig;
import java.sql.ResultSet;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 *
 * @author Adrian
 */
public class PublisherManager {
  final static Logger logger = Logger.getLogger(PublisherManager.class);  
ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

  public void addPublisher(Publisher anPublisher, String using){
   System.out.println("In Business Layer addPublisher(Publisher Publisher, String using) method");
    logger.info("In Business Layer addPublisher(Publisher Publisher, String using) method");    
  
    try {            
            ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
            IPublisherService iPublisherMgr=null;            
           
            if(using.equals("JDBC1")){
                iPublisherMgr=(IPublisherService) context.getBean("JDBC1");
                iPublisherMgr.addPublisherJDBC(anPublisher);
            }
            else if(using.equals("HIBER1"))
                iPublisherMgr=(IPublisherService) context.getBean("HIBER1");
                iPublisherMgr.addPublisher(anPublisher);
            
        } catch (ServiceLoadException ex) {
         
           System.out.print(ex.getMessage());
        } catch (Exception ex) {
            
            System.out.print(ex.getMessage());
             logger.error(ex.getMessage());
        }
    }

 public Publisher getPublisher(int PublisherId,String using)
    {       
        Publisher anPublisher=new Publisher();
        System.out.println("In Business Layer getPublisher(int PublisherId,String using) method");
            ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        try {            
           // Factory factory = new Factory();           
          //  IPublisherService iPublisherMgr = (IPublisherService) factory.getTheService(IPublisherService.NAME);
          if(using.equals("HIBER1")){
              System.out.println("getting Publisher using Hibernate");
           IPublisherService iPublisherMgr = (IPublisherService) context.getBean("HIBER");
           anPublisher=iPublisherMgr.getPublisher(PublisherId);
          }
          else if(using.equals("JDBC1"))
          {
             System.out.println("getting Publisher using JDBC"); 
              IPublisherService iPublisherMgr = (IPublisherService) context.getBean("JDBC1");
              anPublisher=iPublisherMgr.getPublisherJDBC(PublisherId);
          }
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
             logger.error(ex.getMessage());
            
        }
        return anPublisher;
    }
    
    public void updatePublisher(Publisher anPublisher,String using)
    {
        System.out.println("In Business Layer updatePublisher(Publisher anPublisher, String using) method");
       try {            
            ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
            // Factory factory = new Factory();            
           // IPublisherService iPublisherMgr = (IPublisherService) factory.getTheService(IPublisherService.NAME);
           if(using.equals("HIBER1")){
           IPublisherService iPublisherMgr = (IPublisherService)context.getBean("HIBER1");           
           iPublisherMgr.updatePublisher(anPublisher);
           }
           else if(using.equals("JDBC1"))
           {
               IPublisherService iPublisherMgr = (IPublisherService)context.getBean("JDBC1");           
               iPublisherMgr.updatePublisherJDBC(anPublisher);
           }          
            
        } catch (ServiceLoadException ex) {
          
           System.out.println(ex.getMessage()); 
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
            logger.error(ex.getMessage());
        }
}     
  
        
    public List<Publisher> getAllPublishers(String using)
    {
        List<Publisher> PublishersList = new ArrayList<>();
        ResultSet rs=null;        
        System.out.println("In Business Layer getAllAthors(String using) method");
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
           try {
               if(using.equals("JDBC1")){
                IPublisherService iPublisherMgr = (IPublisherService) context.getBean("JDBC1");
               // Factory factory = new Factory();
                //IPublisherService iPublisherMgr = (IPublisherService) factory.getTheService(IPublisherService.NAME);
                 rs=iPublisherMgr.getAllPublishersJDBC();
                 //convert resultset to list
                 int i=0;
                 while(rs.next()) {
                     PublishersList.add(rs.getObject(i,Publisher.class));
                     i++;
                     }         
               }               
               else if(using.equals("HIBER1"))
               {
                   IPublisherService iPublisherMgr = (IPublisherService) context.getBean("HIBER1");
                  PublishersList=iPublisherMgr.getAllPublishers();                 
               }
            } catch (ServiceLoadException ex) {
              System.out.println(ex.getMessage());

            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                 logger.error(ex.getMessage());
            }              
        return PublishersList;
    }
    
    public ResultSet getAllPublishersJDBC()
    {
        ResultSet rs=null;
        List<Publisher> PublishersList = new ArrayList<>();
        try {
            logger.info("In Business Layer getAllAthors JDBC method");
            System.out.println("In Business Layer getAllAthors JDBC method");
            Factory factory = new Factory();
            IPublisherServiceJDBC iPublisherMgrJDBC = (IPublisherServiceJDBC) factory.getTheService(IPublisherServiceJDBC.NAME);
            rs=iPublisherMgrJDBC.getAllPublishersJDBC();
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
             logger.error(ex.getMessage());
             
        }
        return rs;
    }
    
    
    public void deletePublisher(Class<?> Publisher, int PublisherId,String using)
    {
        try {
            System.out.println("In Business Layer deleteAuhor method");
            //Factory factory = new Factory();
            //IPublisherService iPublisherMgr = (IPublisherService) factory.getTheService(IPublisherService.NAME);
            ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
            
            if(using.equals("HIBER1"))
            {
            IPublisherService iPublisherMgr = (IPublisherService) context.getBean("HIBER1");
            iPublisherMgr.deletePublisher(Publisher, PublisherId);            
            }
            else if(using.equals("JDBC1"))
            {
               IPublisherService iPublisherMgr = (IPublisherService) context.getBean("HIBER1");
               iPublisherMgr.deletePublisherJDBC(PublisherId);             
            }
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            
            System.out.println(ex.getMessage());
             logger.error(ex.getMessage());
        }
    }

    public PublisherManager() {
    }
    
    
    
}
