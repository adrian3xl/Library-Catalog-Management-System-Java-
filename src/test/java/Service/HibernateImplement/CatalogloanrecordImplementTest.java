/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.HibernateImplement;

import Domain.Catalogloanrecord;
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
public class CatalogloanrecordImplementTest {
    
    public CatalogloanrecordImplementTest() {
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
     * Test of addCatalogloanrecord method, of class CatalogloanrecordImplement.
     */
    @Test
    public void testAddCatalogloanrecord() throws Exception {
        System.out.println("addCatalogloanrecord");
        Catalogloanrecord catalogloanrecord = null;
        CatalogloanrecordImplement instance = new CatalogloanrecordImplement();
        instance.addCatalogloanrecord(catalogloanrecord);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCatalogloanrecord method, of class CatalogloanrecordImplement.
     */
    @Test
    public void testUpdateCatalogloanrecord() throws Exception {
        System.out.println("updateCatalogloanrecord");
        Catalogloanrecord catalogloanrecord = null;
        CatalogloanrecordImplement instance = new CatalogloanrecordImplement();
        instance.updateCatalogloanrecord(catalogloanrecord);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteCatalogloanrecord method, of class CatalogloanrecordImplement.
     */
    @Test
    public void testDeleteCatalogloanrecord_Class_int() throws Exception {
        System.out.println("deleteCatalogloanrecord");
        Class Catalogloanrecord = null;
        int catalogloanrecordId = 0;
        CatalogloanrecordImplement instance = new CatalogloanrecordImplement();
        instance.deleteCatalogloanrecord(Catalogloanrecord, catalogloanrecordId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCatalogloanrecord method, of class CatalogloanrecordImplement.
     */
    @Test
    public void testGetCatalogloanrecord() throws Exception {
        System.out.println("getCatalogloanrecord");
        int catalogloanrecordID = 0;
        CatalogloanrecordImplement instance = new CatalogloanrecordImplement();
        Catalogloanrecord expResult = null;
        Catalogloanrecord result = instance.getCatalogloanrecord(catalogloanrecordID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllCatalogloanrecord method, of class CatalogloanrecordImplement.
     */
    @Test
    public void testGetAllCatalogloanrecord() throws Exception {
        System.out.println("getAllCatalogloanrecord");
        CatalogloanrecordImplement instance = new CatalogloanrecordImplement();
        List<Catalogloanrecord> expResult = null;
        List<Catalogloanrecord> result = instance.getAllCatalogloanrecord();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteCatalogloanrecord method, of class CatalogloanrecordImplement.
     */
    @Test
    public void testDeleteCatalogloanrecord_int() throws Exception {
        System.out.println("deleteCatalogloanrecord");
        int id = 0;
        CatalogloanrecordImplement instance = new CatalogloanrecordImplement();
        instance.deleteCatalogloanrecord(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
