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
public class PublisherTest {
    
    public PublisherTest() {
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
     * Test of setPublishercode method, of class Publisher.
     */
    @Test
    public void testSetPublishercode() {
        System.out.println("setPublishercode");
        String publishercode = "";
        Publisher instance = new Publisher();
        instance.setPublishercode(publishercode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPublishercode method, of class Publisher.
     */
    @Test
    public void testGetPublishercode() {
        System.out.println("getPublishercode");
        Publisher instance = new Publisher();
        String expResult = "";
        String result = instance.getPublishercode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCatalogrecords method, of class Publisher.
     */
    @Test
    public void testSetCatalogrecords() {
        System.out.println("setCatalogrecords");
        Set<Catalogrecord> Catalogrecords = null;
        Publisher instance = new Publisher();
        instance.setCatalogrecords(Catalogrecords);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Publisher.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Publisher instance = new Publisher();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
