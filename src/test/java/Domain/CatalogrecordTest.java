/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.Date;
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
public class CatalogrecordTest {
    
    public CatalogrecordTest() {
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
     * Test of getCatalogloanrecords method, of class Catalogrecord.
     */
    @Test
    public void testGetCatalogloanrecords() {
        System.out.println("getCatalogloanrecords");
        Catalogrecord instance = new Catalogrecord();
        Set<Catalogloanrecord> expResult = null;
        Set<Catalogloanrecord> result = instance.getCatalogloanrecords();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Catalogrecord.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Catalogrecord instance = new Catalogrecord();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitle method, of class Catalogrecord.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Catalogrecord instance = new Catalogrecord();
        String expResult = "";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDatereleased method, of class Catalogrecord.
     */
    @Test
    public void testGetDatereleased() {
        System.out.println("getDatereleased");
        Catalogrecord instance = new Catalogrecord();
        Date expResult = null;
        Date result = instance.getDatereleased();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConditionstatement method, of class Catalogrecord.
     */
    @Test
    public void testGetConditionstatement() {
        System.out.println("getConditionstatement");
        Catalogrecord instance = new Catalogrecord();
        String expResult = "";
        String result = instance.getConditionstatement();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCatalogcode method, of class Catalogrecord.
     */
    @Test
    public void testGetCatalogcode() {
        System.out.println("getCatalogcode");
        Catalogrecord instance = new Catalogrecord();
        String expResult = "";
        String result = instance.getCatalogcode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGenre method, of class Catalogrecord.
     */
    @Test
    public void testGetGenre() {
        System.out.println("getGenre");
        Catalogrecord instance = new Catalogrecord();
        Genre expResult = null;
        Genre result = instance.getGenre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDocumenttype method, of class Catalogrecord.
     */
    @Test
    public void testGetDocumenttype() {
        System.out.println("getDocumenttype");
        Catalogrecord instance = new Catalogrecord();
        Documenttype expResult = null;
        Documenttype result = instance.getDocumenttype();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthor method, of class Catalogrecord.
     */
    @Test
    public void testGetAuthor() {
        System.out.println("getAuthor");
        Catalogrecord instance = new Catalogrecord();
        Author expResult = null;
        Author result = instance.getAuthor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPublisher method, of class Catalogrecord.
     */
    @Test
    public void testGetPublisher() {
        System.out.println("getPublisher");
        Catalogrecord instance = new Catalogrecord();
        Publisher expResult = null;
        Publisher result = instance.getPublisher();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCatalogloanrecords method, of class Catalogrecord.
     */
    @Test
    public void testSetCatalogloanrecords() {
        System.out.println("setCatalogloanrecords");
        Set<Catalogloanrecord> catalogloanrecords = null;
        Catalogrecord instance = new Catalogrecord();
        instance.setCatalogloanrecords(catalogloanrecords);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGenre method, of class Catalogrecord.
     */
    @Test
    public void testSetGenre() {
        System.out.println("setGenre");
        Genre genre = null;
        Catalogrecord instance = new Catalogrecord();
        instance.setGenre(genre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDocumenttype method, of class Catalogrecord.
     */
    @Test
    public void testSetDocumenttype() {
        System.out.println("setDocumenttype");
        Documenttype documenttype = null;
        Catalogrecord instance = new Catalogrecord();
        instance.setDocumenttype(documenttype);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAuthor method, of class Catalogrecord.
     */
    @Test
    public void testSetAuthor() {
        System.out.println("setAuthor");
        Author author = null;
        Catalogrecord instance = new Catalogrecord();
        instance.setAuthor(author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPublisher method, of class Catalogrecord.
     */
    @Test
    public void testSetPublisher() {
        System.out.println("setPublisher");
        Publisher publisher = null;
        Catalogrecord instance = new Catalogrecord();
        instance.setPublisher(publisher);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitle method, of class Catalogrecord.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "";
        Catalogrecord instance = new Catalogrecord();
        instance.setTitle(title);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDatereleased method, of class Catalogrecord.
     */
    @Test
    public void testSetDatereleased() {
        System.out.println("setDatereleased");
        Date datereleased = null;
        Catalogrecord instance = new Catalogrecord();
        instance.setDatereleased(datereleased);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConditionstatement method, of class Catalogrecord.
     */
    @Test
    public void testSetConditionstatement() {
        System.out.println("setConditionstatement");
        String conditionstatement = "";
        Catalogrecord instance = new Catalogrecord();
        instance.setConditionstatement(conditionstatement);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Catalogrecord.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Catalogrecord instance = new Catalogrecord();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCatalogcode method, of class Catalogrecord.
     */
    @Test
    public void testSetCatalogcode() {
        System.out.println("setCatalogcode");
        String catalogcode = "";
        Catalogrecord instance = new Catalogrecord();
        instance.setCatalogcode(catalogcode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
