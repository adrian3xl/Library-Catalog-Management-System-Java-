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
public class CustomerTest {
    
    public CustomerTest() {
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
     * Test of getCatalogloanrecords method, of class Customer.
     */
    @Test
    public void testGetCatalogloanrecords() {
        System.out.println("getCatalogloanrecords");
        Customer instance = new Customer();
        Set<Catalogloanrecord> expResult = null;
        Set<Catalogloanrecord> result = instance.getCatalogloanrecords();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhonenumber method, of class Customer.
     */
    @Test
    public void testSetPhonenumber() {
        System.out.println("setPhonenumber");
        String phonenumber = "";
        Customer instance = new Customer();
        instance.setPhonenumber(phonenumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAddress method, of class Customer.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "";
        Customer instance = new Customer();
        instance.setAddress(address);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomercode method, of class Customer.
     */
    @Test
    public void testSetCustomercode() {
        System.out.println("setCustomercode");
        String customercode = "";
        Customer instance = new Customer();
        instance.setCustomercode(customercode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPhonenumber method, of class Customer.
     */
    @Test
    public void testGetPhonenumber() {
        System.out.println("getPhonenumber");
        Customer instance = new Customer();
        String expResult = "";
        String result = instance.getPhonenumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAddress method, of class Customer.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Customer instance = new Customer();
        String expResult = "";
        String result = instance.getAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomercode method, of class Customer.
     */
    @Test
    public void testGetCustomercode() {
        System.out.println("getCustomercode");
        Customer instance = new Customer();
        String expResult = "";
        String result = instance.getCustomercode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Customer.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Customer instance = new Customer();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
