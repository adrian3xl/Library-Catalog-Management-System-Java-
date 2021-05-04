/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Domain.Customer;
import java.sql.ResultSet;
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
public class ICustomerServiceJDBCTest {
    
    public ICustomerServiceJDBCTest() {
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
     * Test of addCustomerJDBC method, of class ICustomerServiceJDBC.
     */
    @Test
    public void testAddCustomerJDBC() throws Exception {
        System.out.println("addCustomerJDBC");
        Customer customer = null;
        ICustomerServiceJDBC instance = new ICustomerServiceJDBCImpl();
        instance.addCustomerJDBC(customer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCustomerJDBC method, of class ICustomerServiceJDBC.
     */
    @Test
    public void testUpdateCustomerJDBC() throws Exception {
        System.out.println("updateCustomerJDBC");
        Customer customer = null;
        ICustomerServiceJDBC instance = new ICustomerServiceJDBCImpl();
        instance.updateCustomerJDBC(customer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomerJDBC method, of class ICustomerServiceJDBC.
     */
    @Test
    public void testGetCustomerJDBC() throws Exception {
        System.out.println("getCustomerJDBC");
        int id = 0;
        ICustomerServiceJDBC instance = new ICustomerServiceJDBCImpl();
        Customer expResult = null;
        Customer result = instance.getCustomerJDBC(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllCustomerJDBC method, of class ICustomerServiceJDBC.
     */
    @Test
    public void testGetAllCustomerJDBC() throws Exception {
        System.out.println("getAllCustomerJDBC");
        ICustomerServiceJDBC instance = new ICustomerServiceJDBCImpl();
        ResultSet expResult = null;
        ResultSet result = instance.getAllCustomerJDBC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteCustomerJDBC method, of class ICustomerServiceJDBC.
     */
    @Test
    public void testDeleteCustomerJDBC() throws Exception {
        System.out.println("deleteCustomerJDBC");
        int id = 0;
        ICustomerServiceJDBC instance = new ICustomerServiceJDBCImpl();
        instance.deleteCustomerJDBC(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ICustomerServiceJDBCImpl implements ICustomerServiceJDBC {

        public void addCustomerJDBC(Customer customer) throws Exception {
        }

        public void updateCustomerJDBC(Customer customer) throws Exception {
        }

        public Customer getCustomerJDBC(int id) throws Exception {
            return null;
        }

        public ResultSet getAllCustomerJDBC() throws Exception {
            return null;
        }

        public void deleteCustomerJDBC(int id) throws Exception {
        }
    }
    
}
