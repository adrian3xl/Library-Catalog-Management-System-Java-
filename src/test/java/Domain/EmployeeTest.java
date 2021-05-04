/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.Set;
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
public class EmployeeTest {
    
    public EmployeeTest() {
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
     * Test of getCatalogloanrecords method, of class Employee.
     */
    @Test
    public void testGetCatalogloanrecords() {
        System.out.println("getCatalogloanrecords");
        Employee instance = new Employee();
        Set<Catalogloanrecord> expResult = null;
        Set<Catalogloanrecord> result = instance.getCatalogloanrecords();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJobtitle method, of class Employee.
     */
    @Test
    public void testSetJobtitle() {
        System.out.println("setJobtitle");
        String jobtitle = "";
        Employee instance = new Employee();
        instance.setJobtitle(jobtitle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmployeecode method, of class Employee.
     */
    @Test
    public void testSetEmployeecode() {
        System.out.println("setEmployeecode");
        String employeecode = "";
        Employee instance = new Employee();
        instance.setEmployeecode(employeecode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class Employee.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        Employee instance = new Employee();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJobtitle method, of class Employee.
     */
    @Test
    public void testGetJobtitle() {
        System.out.println("getJobtitle");
        Employee instance = new Employee();
        String expResult = "";
        String result = instance.getJobtitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmployeecode method, of class Employee.
     */
    @Test
    public void testGetEmployeecode() {
        System.out.println("getEmployeecode");
        Employee instance = new Employee();
        String expResult = "";
        String result = instance.getEmployeecode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class Employee.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Employee instance = new Employee();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Employee.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Employee instance = new Employee();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Employee.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Employee instance = new Employee();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Employee.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Employee instance = new Employee();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
