/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.HibernateImplement;

import Domain.Catalogrecord;
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
public class CatalogrecordImplementTest {
    
    public CatalogrecordImplementTest() {
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
     * Test of addCatalogrecord method, of class CatalogrecordImplement.
     */
    @Test
    public void testAddCatalogrecord() throws Exception {
        System.out.println("addCatalogrecord");
        Catalogrecord catalogrecord = null;
        CatalogrecordImplement instance = new CatalogrecordImplement();
        instance.addCatalogrecord(catalogrecord);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCatalogrecord method, of class CatalogrecordImplement.
     */
    @Test
    public void testUpdateCatalogrecord() throws Exception {
        System.out.println("updateCatalogrecord");
        Catalogrecord catalogrecord = null;
        CatalogrecordImplement instance = new CatalogrecordImplement();
        instance.updateCatalogrecord(catalogrecord);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCatalogrecord method, of class CatalogrecordImplement.
     */
    @Test
    public void testGetCatalogrecord() throws Exception {
        System.out.println("getCatalogrecord");
        int catalogrecordID = 0;
        CatalogrecordImplement instance = new CatalogrecordImplement();
        Catalogrecord expResult = null;
        Catalogrecord result = instance.getCatalogrecord(catalogrecordID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllCatalogrecord method, of class CatalogrecordImplement.
     */
    @Test
    public void testGetAllCatalogrecord() throws Exception {
        System.out.println("getAllCatalogrecord");
        CatalogrecordImplement instance = new CatalogrecordImplement();
        List<Catalogrecord> expResult = null;
        List<Catalogrecord> result = instance.getAllCatalogrecord();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteCatalogrecord method, of class CatalogrecordImplement.
     */
    @Test
    public void testDeleteCatalogrecord() throws Exception {
        System.out.println("deleteCatalogrecord");
        Class Catalogrecord = null;
        int catalogrecordId = 0;
        CatalogrecordImplement instance = new CatalogrecordImplement();
        instance.deleteCatalogrecord(Catalogrecord, catalogrecordId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
