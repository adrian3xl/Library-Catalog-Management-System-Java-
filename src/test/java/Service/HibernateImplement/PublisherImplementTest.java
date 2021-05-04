/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.HibernateImplement;

import Domain.Publisher;
import java.sql.ResultSet;
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
public class PublisherImplementTest {
    
    public PublisherImplementTest() {
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
     * Test of addPublisher method, of class PublisherImplement.
     */
    @Test
    public void testAddPublisher() throws Exception {
        System.out.println("addPublisher");
        Publisher publisher = null;
        PublisherImplement instance = new PublisherImplement();
        instance.addPublisher(publisher);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePublisher method, of class PublisherImplement.
     */
    @Test
    public void testUpdatePublisher() throws Exception {
        System.out.println("updatePublisher");
        Publisher publisher = null;
        PublisherImplement instance = new PublisherImplement();
        instance.updatePublisher(publisher);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPublisher method, of class PublisherImplement.
     */
    @Test
    public void testGetPublisher() throws Exception {
        System.out.println("getPublisher");
        int publisherID = 0;
        PublisherImplement instance = new PublisherImplement();
        Publisher expResult = null;
        Publisher result = instance.getPublisher(publisherID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllPublishers method, of class PublisherImplement.
     */
    @Test
    public void testGetAllPublishers() throws Exception {
        System.out.println("getAllPublishers");
        PublisherImplement instance = new PublisherImplement();
        List<Publisher> expResult = null;
        List<Publisher> result = instance.getAllPublishers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletePublisher method, of class PublisherImplement.
     */
    @Test
    public void testDeletePublisher() {
        System.out.println("deletePublisher");
        Class Publisher = null;
        int publisherId = 0;
        PublisherImplement instance = new PublisherImplement();
        instance.deletePublisher(Publisher, publisherId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPublisherJDBC method, of class PublisherImplement.
     */
    @Test
    public void testAddPublisherJDBC() throws Exception {
        System.out.println("addPublisherJDBC");
        Publisher publisher = null;
        PublisherImplement instance = new PublisherImplement();
        instance.addPublisherJDBC(publisher);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePublisherJDBC method, of class PublisherImplement.
     */
    @Test
    public void testUpdatePublisherJDBC() throws Exception {
        System.out.println("updatePublisherJDBC");
        Publisher publisher = null;
        PublisherImplement instance = new PublisherImplement();
        instance.updatePublisherJDBC(publisher);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPublisherJDBC method, of class PublisherImplement.
     */
    @Test
    public void testGetPublisherJDBC() throws Exception {
        System.out.println("getPublisherJDBC");
        int id = 0;
        PublisherImplement instance = new PublisherImplement();
        Publisher expResult = null;
        Publisher result = instance.getPublisherJDBC(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllPublishersJDBC method, of class PublisherImplement.
     */
    @Test
    public void testGetAllPublishersJDBC() throws Exception {
        System.out.println("getAllPublishersJDBC");
        PublisherImplement instance = new PublisherImplement();
        ResultSet expResult = null;
        ResultSet result = instance.getAllPublishersJDBC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletePublisherJDBC method, of class PublisherImplement.
     */
    @Test
    public void testDeletePublisherJDBC() throws Exception {
        System.out.println("deletePublisherJDBC");
        int id = 0;
        PublisherImplement instance = new PublisherImplement();
        instance.deletePublisherJDBC(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
