/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Domain.Publisher;
import java.sql.ResultSet;
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
public class IPublisherServiceTest {
    
    public IPublisherServiceTest() {
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
     * Test of addPublisher method, of class IPublisherService.
     */
    @Test
    public void testAddPublisher() throws Exception {
        System.out.println("addPublisher");
        Publisher publisher = null;
        IPublisherService instance = new IPublisherServiceImpl();
        instance.addPublisher(publisher);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePublisher method, of class IPublisherService.
     */
    @Test
    public void testUpdatePublisher() throws Exception {
        System.out.println("updatePublisher");
        Publisher publisher = null;
        IPublisherService instance = new IPublisherServiceImpl();
        instance.updatePublisher(publisher);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPublisher method, of class IPublisherService.
     */
    @Test
    public void testGetPublisher() throws Exception {
        System.out.println("getPublisher");
        int id = 0;
        IPublisherService instance = new IPublisherServiceImpl();
        Publisher expResult = null;
        Publisher result = instance.getPublisher(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllPublishers method, of class IPublisherService.
     */
    @Test
    public void testGetAllPublishers() throws Exception {
        System.out.println("getAllPublishers");
        IPublisherService instance = new IPublisherServiceImpl();
        List expResult = null;
        List result = instance.getAllPublishers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletePublisher method, of class IPublisherService.
     */
    @Test
    public void testDeletePublisher() {
        System.out.println("deletePublisher");
        Class Publisher = null;
        int publisherId = 0;
        IPublisherService instance = new IPublisherServiceImpl();
        instance.deletePublisher(Publisher, publisherId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPublisherJDBC method, of class IPublisherService.
     */
    @Test
    public void testAddPublisherJDBC() throws Exception {
        System.out.println("addPublisherJDBC");
        Publisher publisher = null;
        IPublisherService instance = new IPublisherServiceImpl();
        instance.addPublisherJDBC(publisher);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePublisherJDBC method, of class IPublisherService.
     */
    @Test
    public void testUpdatePublisherJDBC() throws Exception {
        System.out.println("updatePublisherJDBC");
        Publisher publisher = null;
        IPublisherService instance = new IPublisherServiceImpl();
        instance.updatePublisherJDBC(publisher);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPublisherJDBC method, of class IPublisherService.
     */
    @Test
    public void testGetPublisherJDBC() throws Exception {
        System.out.println("getPublisherJDBC");
        int id = 0;
        IPublisherService instance = new IPublisherServiceImpl();
        Publisher expResult = null;
        Publisher result = instance.getPublisherJDBC(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllPublishersJDBC method, of class IPublisherService.
     */
    @Test
    public void testGetAllPublishersJDBC() throws Exception {
        System.out.println("getAllPublishersJDBC");
        IPublisherService instance = new IPublisherServiceImpl();
        ResultSet expResult = null;
        ResultSet result = instance.getAllPublishersJDBC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletePublisherJDBC method, of class IPublisherService.
     */
    @Test
    public void testDeletePublisherJDBC() throws Exception {
        System.out.println("deletePublisherJDBC");
        int id = 0;
        IPublisherService instance = new IPublisherServiceImpl();
        instance.deletePublisherJDBC(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IPublisherServiceImpl implements IPublisherService {

        public void addPublisher(Publisher publisher) throws Exception {
        }

        public void updatePublisher(Publisher publisher) throws Exception {
        }

        public Publisher getPublisher(int id) throws Exception {
            return null;
        }

        public List getAllPublishers() throws Exception {
            return null;
        }

        public void deletePublisher(Class<?> Publisher, int publisherId) {
        }

        public void addPublisherJDBC(Publisher publisher) throws Exception {
        }

        public void updatePublisherJDBC(Publisher publisher) throws Exception {
        }

        public Publisher getPublisherJDBC(int id) throws Exception {
            return null;
        }

        public ResultSet getAllPublishersJDBC() throws Exception {
            return null;
        }

        public void deletePublisherJDBC(int id) throws Exception {
        }
    }
    
}
