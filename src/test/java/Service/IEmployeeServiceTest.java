/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Domain.Employee;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adrian
 */
public class IEmployeeServiceTest {
    
    public IEmployeeServiceTest() {
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
     * Test of addEmployee method, of class IEmployeeService.
     */
    @Test
    public void testAddEmployee() throws Exception {
        System.out.println("addEmployee");
        Employee employee = null;
        IEmployeeService instance = new IEmployeeServiceImpl();
        instance.addEmployee(employee);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateEmployee method, of class IEmployeeService.
     */
    @Test
    public void testUpdateEmployee() throws Exception {
        System.out.println("updateEmployee");
        Employee employee = null;
        IEmployeeService instance = new IEmployeeServiceImpl();
        instance.updateEmployee(employee);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmployee method, of class IEmployeeService.
     */
    @Test
    public void testGetEmployee() throws Exception {
        System.out.println("getEmployee");
        int id = 0;
        IEmployeeService instance = new IEmployeeServiceImpl();
        Employee expResult = null;
        Employee result = instance.getEmployee(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllEmployee method, of class IEmployeeService.
     */
    @Test
    public void testGetAllEmployee() throws Exception {
        System.out.println("getAllEmployee");
        IEmployeeService instance = new IEmployeeServiceImpl();
        List expResult = null;
        List result = instance.getAllEmployee();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteEmployee method, of class IEmployeeService.
     */
    @Test
    public void testDeleteEmployee() throws Exception {
        System.out.println("deleteEmployee");
        Class Employee = null;
        int employeeId = 0;
        IEmployeeService instance = new IEmployeeServiceImpl();
        instance.deleteEmployee(Employee, employeeId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IEmployeeServiceImpl implements IEmployeeService {

        public void addEmployee(Employee employee) throws Exception {
        }

        public void updateEmployee(Employee employee) throws Exception {
        }

        public Employee getEmployee(int id) throws Exception {
            return null;
        }

        public List getAllEmployee() throws Exception {
            return null;
        }

        public void deleteEmployee(Class<?> Employee, int employeeId) throws Exception {
        }
    }
    
}
