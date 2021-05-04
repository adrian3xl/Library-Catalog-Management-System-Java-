/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.HibernateImplement;

import Domain.Documenttype;
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
public class DocumenttypeImplementTest {
    
    public DocumenttypeImplementTest() {
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
     * Test of addDocumenttype method, of class DocumenttypeImplement.
     */
    @Test
    public void testAddDocumenttype() throws Exception {
        System.out.println("addDocumenttype");
        Documenttype documenttype = null;
        DocumenttypeImplement instance = new DocumenttypeImplement();
        instance.addDocumenttype(documenttype);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateDocumenttype method, of class DocumenttypeImplement.
     */
    @Test
    public void testUpdateDocumenttype() throws Exception {
        System.out.println("updateDocumenttype");
        Documenttype documenttype = null;
        DocumenttypeImplement instance = new DocumenttypeImplement();
        instance.updateDocumenttype(documenttype);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDocumenttype method, of class DocumenttypeImplement.
     */
    @Test
    public void testGetDocumenttype() throws Exception {
        System.out.println("getDocumenttype");
        int id = 0;
        DocumenttypeImplement instance = new DocumenttypeImplement();
        Documenttype expResult = null;
        Documenttype result = instance.getDocumenttype(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllDocumenttype method, of class DocumenttypeImplement.
     */
    @Test
    public void testGetAllDocumenttype() throws Exception {
        System.out.println("getAllDocumenttype");
        DocumenttypeImplement instance = new DocumenttypeImplement();
        List<Documenttype> expResult = null;
        List<Documenttype> result = instance.getAllDocumenttype();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteDocumenttype method, of class DocumenttypeImplement.
     */
    @Test
    public void testDeleteDocumenttype() throws Exception {
        System.out.println("deleteDocumenttype");
        Class Documenttype = null;
        int documenttypeId = 0;
        DocumenttypeImplement instance = new DocumenttypeImplement();
        instance.deleteDocumenttype(Documenttype, documenttypeId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addDocumenttypeJDBC method, of class DocumenttypeImplement.
     */
    @Test
    public void testAddDocumenttypeJDBC() throws Exception {
        System.out.println("addDocumenttypeJDBC");
        Documenttype documenttype = null;
        DocumenttypeImplement instance = new DocumenttypeImplement();
        instance.addDocumenttypeJDBC(documenttype);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateDocumenttypeJDBC method, of class DocumenttypeImplement.
     */
    @Test
    public void testUpdateDocumenttypeJDBC() throws Exception {
        System.out.println("updateDocumenttypeJDBC");
        Documenttype documenttype = null;
        DocumenttypeImplement instance = new DocumenttypeImplement();
        instance.updateDocumenttypeJDBC(documenttype);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDocumenttypeJDBC method, of class DocumenttypeImplement.
     */
    @Test
    public void testGetDocumenttypeJDBC() throws Exception {
        System.out.println("getDocumenttypeJDBC");
        int id = 0;
        DocumenttypeImplement instance = new DocumenttypeImplement();
        Documenttype expResult = null;
        Documenttype result = instance.getDocumenttypeJDBC(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllDocumenttypeJDBC method, of class DocumenttypeImplement.
     */
    @Test
    public void testGetAllDocumenttypeJDBC() throws Exception {
        System.out.println("getAllDocumenttypeJDBC");
        DocumenttypeImplement instance = new DocumenttypeImplement();
        ResultSet expResult = null;
        ResultSet result = instance.getAllDocumenttypeJDBC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteDocumenttypeJDBC method, of class DocumenttypeImplement.
     */
    @Test
    public void testDeleteDocumenttypeJDBC() throws Exception {
        System.out.println("deleteDocumenttypeJDBC");
        int id = 0;
        DocumenttypeImplement instance = new DocumenttypeImplement();
        instance.deleteDocumenttypeJDBC(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
