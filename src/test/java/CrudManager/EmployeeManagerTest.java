/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudManager;

import Domain.Employee;
import java.sql.ResultSet;
import java.util.List;
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
public class EmployeeManagerTest {
    
    public EmployeeManagerTest() {
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
     * Test of addEmployee method, of class EmployeeManager.
     */
    @Test
    public void testAddEmployee() {
        System.out.println("addEmployee");
        Employee anEmployee = null;
        EmployeeManager instance = new EmployeeManager();
        instance.addEmployee(anEmployee);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmployee method, of class EmployeeManager.
     */
    @Test
    public void testGetEmployee() {
        System.out.println("getEmployee");
        int employeeId = 0;
        EmployeeManager instance = new EmployeeManager();
        Employee expResult = null;
        Employee result = instance.getEmployee(employeeId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateEmployee method, of class EmployeeManager.
     */
    @Test
    public void testUpdateEmployee() {
        System.out.println("updateEmployee");
        Employee anEmployee = null;
        EmployeeManager instance = new EmployeeManager();
        instance.updateEmployee(anEmployee);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllEmployees method, of class EmployeeManager.
     */
    @Test
    public void testGetAllEmployees() {
        System.out.println("getAllEmployees");
        EmployeeManager instance = new EmployeeManager();
        List<Employee> expResult = null;
         List<Employee> result = instance.getAllEmployees();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteEmployee method, of class EmployeeManager.
     */
    @Test
    public void testDeleteEmployee() {
        System.out.println("deleteEmployee");
        Class Employee = null;
        int employeeId = 0;
        EmployeeManager instance = new EmployeeManager();
        instance.deleteEmployee(Employee, employeeId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validateUser method, of class EmployeeManager.
     */
    @Test
    public void testValidateUser() {
        System.out.println("validateUser");
        String username = "";
        EmployeeManager instance = new EmployeeManager();
        Boolean expResult = null;
        Boolean result = instance.validateUser(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validateUsernameAndPwd method, of class EmployeeManager.
     */
    @Test
    public void testValidateUsernameAndPwd() {
        System.out.println("validateUsernameAndPwd");
        Employee user = null;
        EmployeeManager instance = new EmployeeManager();
        Boolean expResult = null;
        Boolean result = instance.validateUsernameAndPwd(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validateEmpCodeAndPwd method, of class EmployeeManager.
     */
    @Test
    public void testValidateEmpCodeAndPwd() {
        System.out.println("validateEmpCodeAndPwd");
        Employee employee = null;
        EmployeeManager instance = new EmployeeManager();
        Boolean expResult = null;
        Boolean result = instance.validateEmpCodeAndPwd(employee);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
