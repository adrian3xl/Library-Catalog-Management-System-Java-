/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudManager;

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
public class DocumenttypeManagerTest {
    
    public DocumenttypeManagerTest() {
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
     * Test of addDocumenttype method, of class DocumenttypeManager.
     */
    @Test
    public void testAddDocumenttype() {
        System.out.println("addDocumenttype");
        Documenttype anDocumenttype = null;
        DocumenttypeManager instance = new DocumenttypeManager();
        instance.addDocumenttype(anDocumenttype,"HIBER11");
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDocumenttype method, of class DocumenttypeManager.
     */
    @Test
    public void testGetDocumenttype() {
        System.out.println("getDocumenttype");
        int documenttypeId = 0;
        DocumenttypeManager instance = new DocumenttypeManager();
        Documenttype expResult = null;
        Documenttype result = instance.getDocumenttype(documenttypeId,"HIBER11");
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateDocumenttype method, of class DocumenttypeManager.
     */
    @Test
    public void testUpdateDocumenttype() {
        System.out.println("updateDocumenttype");
        Documenttype anDocumenttype = null;
        DocumenttypeManager instance = new DocumenttypeManager();
        instance.updateDocumenttype(anDocumenttype,"HIBER11");
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllDocumenttype method, of class DocumenttypeManager.
     */
    @Test
    public void testGetAllDocumenttype() {
        System.out.println("getAllDocumenttype");
        DocumenttypeManager instance = new DocumenttypeManager();
         List<Documenttype> expResult = null;
        List<Documenttype>result = instance.getAllDocumenttypes("HIBER11");
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteDocumenttype method, of class DocumenttypeManager.
     */
    @Test
    public void testDeleteDocumenttype() {
        System.out.println("deleteDocumenttype");
        Class Documenttype = null;
        int documenttypeId = 0;
        DocumenttypeManager instance = new DocumenttypeManager();
        instance.deleteDocumenttype(Documenttype, documenttypeId,"HIBER11");
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllDocumenttypes method, of class DocumenttypeManager.
     */
    @Test
    public void testGetAllDocumenttypes() {
        System.out.println("getAllDocumenttypes");
        String using = "";
        DocumenttypeManager instance = new DocumenttypeManager();
        List<Documenttype> expResult = null;
        List<Documenttype> result = instance.getAllDocumenttypes(using);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllDocumenttypesJDBC method, of class DocumenttypeManager.
     */
    @Test
    public void testGetAllDocumenttypesJDBC() {
        System.out.println("getAllDocumenttypesJDBC");
        DocumenttypeManager instance = new DocumenttypeManager();
        ResultSet expResult = null;
        ResultSet result = instance.getAllDocumenttypesJDBC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
