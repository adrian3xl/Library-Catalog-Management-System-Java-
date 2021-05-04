/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.Date;
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
public class CatalogloanrecordTest {
    
    public CatalogloanrecordTest() {
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
     * Test of getId method, of class Catalogloanrecord.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Catalogloanrecord instance = new Catalogloanrecord();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomer method, of class Catalogloanrecord.
     */
    @Test
    public void testGetCustomer() {
        System.out.println("getCustomer");
        Catalogloanrecord instance = new Catalogloanrecord();
        Customer expResult = null;
        Customer result = instance.getCustomer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmployee method, of class Catalogloanrecord.
     */
    @Test
    public void testGetEmployee() {
        System.out.println("getEmployee");
        Catalogloanrecord instance = new Catalogloanrecord();
        Employee expResult = null;
        Employee result = instance.getEmployee();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCatalogrecord method, of class Catalogloanrecord.
     */
    @Test
    public void testGetCatalogrecord() {
        System.out.println("getCatalogrecord");
        Catalogloanrecord instance = new Catalogloanrecord();
        Catalogrecord expResult = null;
        Catalogrecord result = instance.getCatalogrecord();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLoancode method, of class Catalogloanrecord.
     */
    @Test
    public void testGetLoancode() {
        System.out.println("getLoancode");
        Catalogloanrecord instance = new Catalogloanrecord();
        String expResult = "";
        String result = instance.getLoancode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLoandate method, of class Catalogloanrecord.
     */
    @Test
    public void testGetLoandate() {
        System.out.println("getLoandate");
        Catalogloanrecord instance = new Catalogloanrecord();
        Date expResult = null;
        Date result = instance.getLoandate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRecieveddate method, of class Catalogloanrecord.
     */
    @Test
    public void testGetRecieveddate() {
        System.out.println("getRecieveddate");
        Catalogloanrecord instance = new Catalogloanrecord();
        Date expResult = null;
        Date result = instance.getRecieveddate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLoancode method, of class Catalogloanrecord.
     */
    @Test
    public void testSetLoancode() {
        System.out.println("setLoancode");
        String loancode = "";
        Catalogloanrecord instance = new Catalogloanrecord();
        instance.setLoancode(loancode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLoandate method, of class Catalogloanrecord.
     */
    @Test
    public void testSetLoandate() {
        System.out.println("setLoandate");
        Date loandate = null;
        Catalogloanrecord instance = new Catalogloanrecord();
        instance.setLoandate(loandate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRecieveddate method, of class Catalogloanrecord.
     */
    @Test
    public void testSetRecieveddate() {
        System.out.println("setRecieveddate");
        Date recieveddate = null;
        Catalogloanrecord instance = new Catalogloanrecord();
        instance.setRecieveddate(recieveddate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Catalogloanrecord.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Catalogloanrecord instance = new Catalogloanrecord();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCatalogrecord method, of class Catalogloanrecord.
     */
    @Test
    public void testSetCatalogrecord() {
        System.out.println("setCatalogrecord");
        Catalogrecord catalogrecord = null;
        Catalogloanrecord instance = new Catalogloanrecord();
        instance.setCatalogrecord(catalogrecord);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomer method, of class Catalogloanrecord.
     */
    @Test
    public void testSetCustomer() {
        System.out.println("setCustomer");
        Customer customer = null;
        Catalogloanrecord instance = new Catalogloanrecord();
        instance.setCustomer(customer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmployee method, of class Catalogloanrecord.
     */
    @Test
    public void testSetEmployee() {
        System.out.println("setEmployee");
        Employee employee = null;
        Catalogloanrecord instance = new Catalogloanrecord();
        instance.setEmployee(employee);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
