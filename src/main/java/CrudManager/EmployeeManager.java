/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudManager;
import Domain.Employee;
import java.util.ArrayList;
import java.util.List;
import Service.Factory;
import Service.IEmployeeService;
import Service.Exceptions.ServiceLoadException;
import Service.IAuthenticateService;
import Service.IEmployeeServiceJDBC;
import Service.SpringConfig;
import java.sql.ResultSet;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 *
 * @author Adrian
 */
public class EmployeeManager {
    final static Logger logger = Logger.getLogger(EmployeeManager.class); 
    
       public EmployeeManager() {
    }
    public void addEmployee (Employee anEmployee)
    {
        try {
            logger.info("In Business Layer addEmployee(Employee employee) method");
            System.out.println("In Business Layer addEmployee(Employee employee) method");
            Factory factory = new Factory();            
            IEmployeeService  iEmployeeMgr  = (IEmployeeService ) factory.getTheService(IEmployeeService .NAME);
            iEmployeeMgr .addEmployee (anEmployee);
            
        } catch (ServiceLoadException ex) {
         System.out.println(ex.getMessage());
           
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
           logger.error(ex.getMessage()); 
        }
    }
    
    
    public Boolean validateUser(String username) //check if user exist, does not check password
    {
        Boolean exist=false;
        
        try {
           // Factory factory = new Factory();                        
         //   IAuthenticateService iAuthenticate = (IAuthenticateService) factory.getTheService(IAuthenticateService.NAME);
            ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
            IAuthenticateService iAuthenticate = (IAuthenticateService) context.getBean("IAuthenticateImplement");
            exist=iAuthenticate.validateUser(username);  //check only username  
        } catch (ServiceLoadException ex) {          
            System.out.println("Could not load Service (Service oad Exception): "+ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Could not load Service (Base Exception): "+ex.getMessage());
             logger.error(ex.getMessage());
        }
        return exist;
    }
    
    public Boolean validateUsernameAndPwd(Employee user)//same as validateUser Service layer IAuthenticateService would check the pasword
    {
        Boolean exist=false;        
        try {
           // Factory factory = new Factory();                        
           // IAuthenticateService iAuthenticate = (IAuthenticateService) factory.getTheService(IAuthenticateService.NAME);
           ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
           IAuthenticateService iAuthenticate = (IAuthenticateService) context.getBean("IAuthenticateImplement");
            exist=iAuthenticate.validateUsernameAndPwd(user);     //check username and password       
        } catch (ServiceLoadException ex) {          
            System.out.println("Could not load Service (Service oad Exception): "+ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Could not load Service (Base Exception): "+ex.getMessage());
             logger.error(ex.getMessage());
        }
        return exist;
    }
    
    
    
    
    

    public Employee getEmployee (int employeeId)
    {
        Employee anEmployee=new Employee();
        try {
            logger.info("In Business Layer getEmployee (int employeeId) method");
            System.out.println("In Business Layer getEmployee (int employeeId) method");
            Factory factory = new Factory();           
            IEmployeeService  iEmployeeMgr  = (IEmployeeService ) factory.getTheService(IEmployeeService .NAME);
            anEmployee=iEmployeeMgr .getEmployee (employeeId);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
               logger.error(ex.getMessage()); 
        }
        return anEmployee;
    }
    
    public void updateEmployee (Employee anEmployee)
    {
        try {
            logger.info("In Business Layer  updateEmployee (Employee anEmployee) method");
            System.out.println("In Business Layer  updateEmployee (Employee anEmployee) method");
            Factory factory = new Factory();            
            IEmployeeService  iEmployeeMgr  = (IEmployeeService ) factory.getTheService(IEmployeeService .NAME);
            iEmployeeMgr .updateEmployee (anEmployee);
            
        } catch (ServiceLoadException ex) {
          
           System.out.println(ex.getMessage()); 
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
              logger.error(ex.getMessage()); 
        }
    }
    
    public List <Employee> getAllEmployees ()
    {
        List<Employee> employeesList = new ArrayList<>();
        try {
            logger.info("In Business Layer getAllAthors   method");
            System.out.println("In Business Layer getAllAthors   method");
            Factory factory = new Factory();
            IEmployeeService  iEmployeeMgr  = (IEmployeeService ) factory.getTheService(IEmployeeService .NAME);
          employeesList=iEmployeeMgr .getAllEmployee ();
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());   
               logger.error(ex.getMessage()); 
        }
        return employeesList;
    }
    
    
    public void deleteEmployee (Class<?> Employee, int employeeId)
    {
        try {
            logger.info("In Business Layer deleteEmployee  method");
            System.out.println("In Business Layer deleteEmployee  method");
            Factory factory = new Factory();
            IEmployeeService  iEmployeeMgr  = (IEmployeeService ) factory.getTheService(IEmployeeService .NAME);
            iEmployeeMgr .deleteEmployee (Employee,employeeId);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            
            System.out.println(ex.getMessage());
               logger.error(ex.getMessage()); 
        }
    }

 

    public Boolean validateEmpCodeAndPwd(Employee employee) {
         Boolean exist=false;        
        try {
           // Factory factory = new Factory();                        
           // IAuthenticateService iAuthenticate = (IAuthenticateService) factory.getTheService(IAuthenticateService.NAME);
           ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
           IAuthenticateService iAuthenticate = (IAuthenticateService) context.getBean("IAuthenticateImplement");
            exist=iAuthenticate.validateUsernameAndPwd(employee);     //check username and password       
        } catch (ServiceLoadException ex) {          
            System.out.println("Could not load Service (Service oad Exception): "+ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Could not load Service (Base Exception): "+ex.getMessage());
            
        }
        return exist;
    }
    
    
    
}
