/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.HibernateImplement;

import Domain.Employee;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
//import static Service.HibernateImplement.AuthorImplement.logger;
import Service.IAuthenticateService;
import org.springframework.stereotype.Component;

/**
 *
 * @author AB
 */
@Component("IAuthenticateImplement")
public class AuthenticateImplement extends HibernateMainConfig implements IAuthenticateService{
    
    @Override
    public Boolean validateUser(String username) throws Exception{
     
       Boolean existOrNot=null;
        Session session = this.getSession();
         Transaction transact=null;       
          
         try{
             transact=session.beginTransaction();
                     
              Query theUser =  session.createQuery("SELECT a FROM Employee a WHERE a.username LIKE:Employee_code");
              theUser.setParameter("Employee_code", username);              
              List<Employee> aUser =  theUser.list();                        
             transact.commit();            
             
             if(aUser.isEmpty()==false) //shouldn't be necessary because once you've gotton pass the commit the user was found
             existOrNot=true;
             else if(aUser.isEmpty()==true) //shouldn't be necessary because once you've gotton pass the commit the user was found
             existOrNot=false;
             
             
         }
         catch(HibernateException hex){
             if(session!=null)
             {
                existOrNot=false;
                 transact.rollback();
                throw new HibernateException("Username or password incorrect rolling back transaction " + hex.getMessage());
             }
             
         }
        finally {
                 //   session.flush();
               //      session.close();
                   }
         
        return existOrNot;
    }

    @Override
    public Boolean addUser(Employee user) throws Exception {  //registering user
        
        Session session = this.getSession();
         Transaction transact=null;
         Boolean addedOrNot=false;
         
         try{
             
             transact=session.beginTransaction();             
             session.save(user);             
             transact.commit();
             addedOrNot=true;
         }
         catch(HibernateException hex){
             if(session!=null)
             {
                 addedOrNot=false;
                 transact.rollback();
                 throw new HibernateException("Not able to save user; rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                    //  session.flush();
                   //   session.close();
                     }
         return addedOrNot;
        
    }

    @Override
    public Boolean updateUser(Employee user) throws Exception {
        
        Boolean updatedOrNot=null;
        Session session = this.getSession();
         Transaction transact=null;       
          
         try{
             transact=session.beginTransaction();
             session.update(user);             
             transact.commit();
             updatedOrNot=true;
         }
         catch(HibernateException hex){
             if(session!=null)
             {
                 updatedOrNot=false;
                 transact.rollback();
                 throw new HibernateException("Username or password incorrect rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                  //   session.flush();
                   //  session.close();
                     }
         
        return updatedOrNot;
        
       
    }
    
  public Boolean validateUsernameAndPwd(Employee user) throws Exception
  {
      Boolean existOrNot=null;
        Session session = this.getSession();
         Transaction transact=null;       
          
         try{
             transact=session.beginTransaction();
             
             Query theUser =  session.createQuery("SELECT a FROM Students a WHERE a.employeecode LIKE:Employee_code");
              theUser.setParameter("Employee_code", user.getEmployeecode());           
              List<Employee> aUser =  theUser.list(); 
                                      
             transact.commit();             
             
             if(aUser.get(0).getPassword().toString().trim().equals(user.getPassword().toString().trim())) //user name would be the same here we compare password
             {                                                                                             //passwrd from Object Vs Password from DB
                 System.out.println("if statement works");
                 existOrNot=true;
             }
            
         }
         catch(HibernateException hex){
             if(session!=null)
             {
               
                 transact.rollback();
                 throw new HibernateException("Username or password incorrect rolling back transaction " + hex.getMessage());
             }
             
         }
         finally {
                  //   session.flush();
                   //  session.close();
                     }
         
        return existOrNot;
  }
    
    
}
