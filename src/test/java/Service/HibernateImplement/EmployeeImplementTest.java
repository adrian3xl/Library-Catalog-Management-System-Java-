/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.HibernateImplement;

import Domain.Employee;
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
public class EmployeeImplementTest {
    
    public EmployeeImplementTest() {
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
     * Test of addEmployee method, of class EmployeeImplement.
     */
    @Test
    public void testAddEmployee() throws Exception {
        System.out.println("addEmployee");
        Employee employee = null;
        EmployeeImplement instance = new EmployeeImplement();
        instance.addEmployee(employee);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateEmployee method, of class EmployeeImplement.
     */
    @Test
    public void testUpdateEmployee() throws Exception {
        System.out.println("updateEmployee");
        Employee employee = null;
        EmployeeImplement instance = new EmployeeImplement();
        instance.updateEmployee(employee);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmployee method, of class EmployeeImplement.
     */
    @Test
    public void testGetEmployee() throws Exception {
        System.out.println("getEmployee");
        int id = 0;
        EmployeeImplement instance = new EmployeeImplement();
        Employee expResult = null;
        Employee result = instance.getEmployee(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllEmployee method, of class EmployeeImplement.
     */
    @Test
    public void testGetAllEmployee() throws Exception {
        System.out.println("getAllEmployee");
        EmployeeImplement instance = new EmployeeImplement();
        List<Employee> expResult = null;
        List<Employee> result = instance.getAllEmployee();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteEmployee method, of class EmployeeImplement.
     */
    @Test
    public void testDeleteEmployee() throws Exception {
        System.out.println("deleteEmployee");
        Class Employee = null;
        int employeeId = 0;
        EmployeeImplement instance = new EmployeeImplement();
        instance.deleteEmployee(Employee, employeeId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
