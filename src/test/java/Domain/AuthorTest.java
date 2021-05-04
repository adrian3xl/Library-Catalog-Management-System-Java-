/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

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
public class AuthorTest {
    
    public AuthorTest() {
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
     * Test of getCatalogrecords method, of class Author.
     */
    @Test
    public void testGetCatalogrecords() {
        System.out.println("getCatalogrecords");
        Author instance = new Author();
        List<Catalogrecord> expResult = null;
        List<Catalogrecord> result = instance.getCatalogrecords();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorcode method, of class Author.
     */
    @Test
    public void testGetAuthorcode() {
        System.out.println("getAuthorcode");
        Author instance = new Author();
        String expResult = "";
        String result = instance.getAuthorcode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAuthorcode method, of class Author.
     */
    @Test
    public void testSetAuthorcode() {
        System.out.println("setAuthorcode");
        String authorcode = "";
        Author instance = new Author();
        instance.setAuthorcode(authorcode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCatalogrecords method, of class Author.
     */
    @Test
    public void testSetCatalogrecords() {
        System.out.println("setCatalogrecords");
        List<Catalogrecord> catalogrecords = null;
        Author instance = new Author();
        instance.setCatalogrecords(catalogrecords);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Author.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Author instance = new Author();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
