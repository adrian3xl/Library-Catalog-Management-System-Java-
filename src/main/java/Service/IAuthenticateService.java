/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Domain.Employee;
import org.springframework.stereotype.Component;



/**
 *
 * @author DELL
 */

@Component
public interface IAuthenticateService extends IService {
    public final String  NAME = "IAuthenticateService";
    
    public Boolean validateUser(String username) throws Exception;
    public Boolean validateUsernameAndPwd(Employee user) throws Exception;
    public Boolean addUser(Employee user) throws Exception;
    public Boolean updateUser(Employee user) throws Exception;
    
}
