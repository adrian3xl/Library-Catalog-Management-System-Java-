/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

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
public class ICatalogrecordServiceTest {
    
    public ICatalogrecordServiceTest() {
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
     * Test of addCatalogrecord method, of class ICatalogrecordService.
     */
    @Test
    public void testAddCatalogrecord() throws Exception {
        System.out.println("addCatalogrecord");
        Catalogrecord catalogrecord = null;
        ICatalogrecordService instance = new ICatalogrecordServiceImpl();
        instance.addCatalogrecord(catalogrecord);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCatalogrecord method, of class ICatalogrecordService.
     */
    @Test
    public void testUpdateCatalogrecord() throws Exception {
        System.out.println("updateCatalogrecord");
        Catalogrecord catalogrecord = null;
        ICatalogrecordService instance = new ICatalogrecordServiceImpl();
        instance.updateCatalogrecord(catalogrecord);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCatalogrecord method, of class ICatalogrecordService.
     */
    @Test
    public void testGetCatalogrecord() throws Exception {
        System.out.println("getCatalogrecord");
        int id = 0;
        ICatalogrecordService instance = new ICatalogrecordServiceImpl();
        Catalogrecord expResult = null;
        Catalogrecord result = instance.getCatalogrecord(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllCatalogrecord method, of class ICatalogrecordService.
     */
    @Test
    public void testGetAllCatalogrecord() throws Exception {
        System.out.println("getAllCatalogrecord");
        ICatalogrecordService instance = new ICatalogrecordServiceImpl();
        List<Catalogrecord> expResult = null;
        List<Catalogrecord> result = instance.getAllCatalogrecord();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteCatalogrecord method, of class ICatalogrecordService.
     */
    @Test
    public void testDeleteCatalogrecord() throws Exception {
        System.out.println("deleteCatalogrecord");
        Class Catalogrecord = null;
        int id = 0;
        ICatalogrecordService instance = new ICatalogrecordServiceImpl();
        instance.deleteCatalogrecord(Catalogrecord, id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ICatalogrecordServiceImpl implements ICatalogrecordService {

        public void addCatalogrecord(Catalogrecord catalogrecord) throws Exception {
        }

        public void updateCatalogrecord(Catalogrecord catalogrecord) throws Exception {
        }

        public Catalogrecord getCatalogrecord(int id) throws Exception {
            return null;
        }

        public List<Catalogrecord> getAllCatalogrecord() throws Exception {
            return null;
        }

        public void deleteCatalogrecord(Class<?> Catalogrecord, int id) throws Exception {
        }
    }
    
}
