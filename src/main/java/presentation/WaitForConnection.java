/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import Service.Exceptions.ServiceLoadException;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author DELL
 */


public class WaitForConnection {
    
    public static void main(String args[]){
    
        LCMS_Server lcms_server= new LCMS_Server();
       lcms_server.start();
 
    }
}
