/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import Domain.Employee;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Adrian
 */
@Ignore
public class LCMS_ClientTest {
    
    public LCMS_ClientTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createConnection method, of class LCMS_Client.
     */
@Ignore
    public void testCreateConnection() {
        System.out.println("createConnection");
        LCMS_Client instance = null;
        instance.createConnection();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStreams method, of class LCMS_Client.
     */
    @Ignore
    public void testGetStreams() {
        System.out.println("getStreams");
        LCMS_Client instance = null;
        instance.getStreams();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of closeStreams method, of class LCMS_Client.
     */
   @Ignore
    public void testCloseStreams() {
        System.out.println("closeStreams");
        LCMS_Client instance = null;
        instance.closeStreams();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sendEmpllogin method, of class LCMS_Client.
     */
    @Test
    public void testSendEmpllogin() {
        System.out.println("send Employee login");
     
        Employee employee = new Employee("EMP1","password");
        LCMS_Client instance = new LCMS_Client();
        instance.sendEmpllogin(employee);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
 
    /**
     * Test of receiveResponse method, of class LCMS_Client.
     */
    @Test
    public void testReceiveResponse() {
        System.out.println("receiveResponse");
        LCMS_Client instance = new LCMS_Client();
        String expResult = "Welcome";
        String result = instance.receiveResponse();
        assertEquals(expResult, result);
        
        
        
       
        
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
  