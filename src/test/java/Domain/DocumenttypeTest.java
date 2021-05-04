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
public class DocumenttypeTest {
    
    public DocumenttypeTest() {
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
     * Test of getCatalogrecords method, of class Documenttype.
     */
    @Test
    public void testGetCatalogrecords() {
        System.out.println("getCatalogrecords");
        Documenttype instance = new Documenttype();
        Set<Catalogrecord> expResult = null;
        Set<Catalogrecord> result = instance.getCatalogrecords();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Documenttype.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Documenttype instance = new Documenttype();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Documenttype.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Documenttype instance = new Documenttype();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Documenttype.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Documenttype instance = new Documenttype();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Documenttype.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Documenttype instance = new Documenttype();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Documenttype.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Documenttype instance = new Documenttype();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
