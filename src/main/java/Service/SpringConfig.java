/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Adrian
 */

@Configuration
@ComponentScan ({"CrudManager","Domain","Service","Service.HibernateImplement","Service.JDBCImplementation","presentation"})

public class SpringConfig {
    
}
