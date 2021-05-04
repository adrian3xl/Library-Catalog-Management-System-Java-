/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Domain.Documenttype;
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
public class IDocumenttypeServiceTest {
    
    public IDocumenttypeServiceTest() {
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
     * Test of addDocumenttype method, of class IDocumenttypeService.
     */
    @Test
    public void testAddDocumenttype() throws Exception {
        System.out.println("addDocumenttype");
        Documenttype documenttype = null;
        IDocumenttypeService instance = new IDocumenttypeServiceImpl();
        instance.addDocumenttype(documenttype);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateDocumenttype method, of class IDocumenttypeService.
     */
    @Test
    public void testUpdateDocumenttype() throws Exception {
        System.out.println("updateDocumenttype");
        Documenttype documenttype = null;
        IDocumenttypeService instance = new IDocumenttypeServiceImpl();
        instance.updateDocumenttype(documenttype);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDocumenttype method, of class IDocumenttypeService.
     */
    @Test
    public void testGetDocumenttype() throws Exception {
        System.out.println("getDocumenttype");
        int id = 0;
        IDocumenttypeService instance = new IDocumenttypeServiceImpl();
        Documenttype expResult = null;
        Documenttype result = instance.getDocumenttype(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllDocumenttype method, of class IDocumenttypeService.
     */
    @Test
    public void testGetAllDocumenttype() throws Exception {
        System.out.println("getAllDocumenttype");
        IDocumenttypeService instance = new IDocumenttypeServiceImpl();
        List expResult = null;
        List result = instance.getAllDocumenttype();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteDocumenttype method, of class IDocumenttypeService.
     */
    @Test
    public void testDeleteDocumenttype() throws Exception {
        System.out.println("deleteDocumenttype");
        Class Documenttype = null;
        int documenttypeId = 0;
        IDocumenttypeService instance = new IDocumenttypeServiceImpl();
        instance.deleteDocumenttype(Documenttype, documenttypeId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addDocumenttypeJDBC method, of class IDocumenttypeService.
     */
    @Test
    public void testAddDocumenttypeJDBC() throws Exception {
        System.out.println("addDocumenttypeJDBC");
        Documenttype documenttype = null;
        IDocumenttypeService instance = new IDocumenttypeServiceImpl();
        instance.addDocumenttypeJDBC(documenttype);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateDocumenttypeJDBC method, of class IDocumenttypeService.
     */
    @Test
    public void testUpdateDocumenttypeJDBC() throws Exception {
        System.out.println("updateDocumenttypeJDBC");
        Documenttype documenttype = null;
        IDocumenttypeService instance = new IDocumenttypeServiceImpl();
        instance.updateDocumenttypeJDBC(documenttype);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDocumenttypeJDBC method, of class IDocumenttypeService.
     */
    @Test
    public void testGetDocumenttypeJDBC() throws Exception {
        System.out.println("getDocumenttypeJDBC");
        int id = 0;
        IDocumenttypeService instance = new IDocumenttypeServiceImpl();
        Documenttype expResult = null;
        Documenttype result = instance.getDocumenttypeJDBC(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllDocumenttypeJDBC method, of class IDocumenttypeService.
     */
    @Test
    public void testGetAllDocumenttypeJDBC() throws Exception {
        System.out.println("getAllDocumenttypeJDBC");
        IDocumenttypeService instance = new IDocumenttypeServiceImpl();
        ResultSet expResult = null;
        ResultSet result = instance.getAllDocumenttypeJDBC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteDocumenttypeJDBC method, of class IDocumenttypeService.
     */
    @Test
    public void testDeleteDocumenttypeJDBC() throws Exception {
        System.out.println("deleteDocumenttypeJDBC");
        int id = 0;
        IDocumenttypeService instance = new IDocumenttypeServiceImpl();
        instance.deleteDocumenttypeJDBC(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IDocumenttypeServiceImpl implements IDocumenttypeService {

        public void addDocumenttype(Documenttype documenttype) throws Exception {
        }

        public void updateDocumenttype(Documenttype documenttype) throws Exception {
        }

        public Documenttype getDocumenttype(int id) throws Exception {
            return null;
        }

        public List getAllDocumenttype() throws Exception {
            return null;
        }

        public void deleteDocumenttype(Class<?> Documenttype, int documenttypeId) throws Exception {
        }

        public void addDocumenttypeJDBC(Documenttype documenttype) throws Exception {
        }

        public void updateDocumenttypeJDBC(Documenttype documenttype) throws Exception {
        }

        public Documenttype getDocumenttypeJDBC(int id) throws Exception {
            return null;
        }

        public ResultSet getAllDocumenttypeJDBC() throws Exception {
            return null;
        }

        public void deleteDocumenttypeJDBC(int id) throws Exception {
        }
    }
    
}
