/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.HibernateImplement;

import Domain.Customer;
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
public class CustomerImplementTest {
    
    public CustomerImplementTest() {
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
     * Test of addCustomer method, of class CustomerImplement.
     */
    @Test
    public void testAddCustomer() throws Exception {
        System.out.println("addCustomer");
        Customer customer = null;
        CustomerImplement instance = new CustomerImplement();
        instance.addCustomer(customer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCustomer method, of class CustomerImplement.
     */
    @Test
    public void testUpdateCustomer() throws Exception {
        System.out.println("updateCustomer");
        Customer customer = null;
        CustomerImplement instance = new CustomerImplement();
        instance.updateCustomer(customer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomer method, of class CustomerImplement.
     */
    @Test
    public void testGetCustomer() throws Exception {
        System.out.println("getCustomer");
        int customerID = 0;
        CustomerImplement instance = new CustomerImplement();
        Customer expResult = null;
        Customer result = instance.getCustomer(customerID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllCustomer method, of class CustomerImplement.
     */
    @Test
    public void testGetAllCustomer() throws Exception {
        System.out.println("getAllCustomer");
        CustomerImplement instance = new CustomerImplement();
        List<Customer> expResult = null;
        List<Customer> result = instance.getAllCustomer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteCustomer method, of class CustomerImplement.
     */
    @Test
    public void testDeleteCustomer() {
        System.out.println("deleteCustomer");
        Class Customer = null;
        int customerId = 0;
        CustomerImplement instance = new CustomerImplement();
        instance.deleteCustomer(Customer, customerId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
