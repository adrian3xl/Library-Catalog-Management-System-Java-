/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;
//import CrudManager.ConnectionManager;
import CrudManager.EmployeeManager;
import Domain.Employee;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StreamCorruptedException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
/**
 *
 * @author Adrian
 */
public class LCMS_Client {
    
    private Socket connection;
    private static ObjectInputStream is;
    private static ObjectOutputStream os;  
    
    
     public LCMS_Client()
    {     
        this.createConnection();
        this.getStreams();
    }
    
     
    public void createConnection()
    {
        try
        {
          connection= new Socket(InetAddress.getLocalHost(),49999);
           System.out.println("Client Connection Established with Server");
        }
         catch(UnknownHostException ex)
        {
            ex.printStackTrace();
        }
        catch(IOException ex)
        {
            ex.printStackTrace();;
        } 
    }  
    
    
    
    
    
     public void getStreams()
    {
        try
        {
            
            this.os = new ObjectOutputStream(connection.getOutputStream());
            this.is = new ObjectInputStream(connection.getInputStream());
            System.out.println("Client streams connected to Server streams");
          
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }
   
    
       public void closeStreams()
    {
        try
        {
            os.close();
            is.close();
            connection.close();
            System.out.println("Client ends connection with server");
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }
    
    
 

    public void sendEmpllogin(Employee employee){
        
        try
        {
            System.out.println("creating employee on client");
            os.writeObject(employee);
            
            System.out.println("Employee sent to server");
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }
    
public String receiveResponse()
    {
        String response="";
        try
        {
            response = (String)is.readObject();
            System.out.println("Server's response "+response);
            
        }
        catch(ClassCastException ex)
        {
            ex.printStackTrace();
        }
        catch(ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
       return response;
    }
    
    
}
