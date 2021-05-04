/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Domain.Catalogloanrecord;
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
public class ICatalogloanrecordServiceTest {
    
    public ICatalogloanrecordServiceTest() {
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
     * Test of addCatalogloanrecord method, of class ICatalogloanrecordService.
     */
    @Test
    public void testAddCatalogloanrecord() throws Exception {
        System.out.println("addCatalogloanrecord");
        Catalogloanrecord catalogloanrecord = null;
        ICatalogloanrecordService instance = new ICatalogloanrecordServiceImpl();
        instance.addCatalogloanrecord(catalogloanrecord);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCatalogloanrecord method, of class ICatalogloanrecordService.
     */
    @Test
    public void testUpdateCatalogloanrecord() throws Exception {
        System.out.println("updateCatalogloanrecord");
        Catalogloanrecord catalogloanrecord = null;
        ICatalogloanrecordService instance = new ICatalogloanrecordServiceImpl();
        instance.updateCatalogloanrecord(catalogloanrecord);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCatalogloanrecord method, of class ICatalogloanrecordService.
     */
    @Test
    public void testGetCatalogloanrecord() throws Exception {
        System.out.println("getCatalogloanrecord");
        int id = 0;
        ICatalogloanrecordService instance = new ICatalogloanrecordServiceImpl();
        Catalogloanrecord expResult = null;
        Catalogloanrecord result = instance.getCatalogloanrecord(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllCatalogloanrecord method, of class ICatalogloanrecordService.
     */
    @Test
    public void testGetAllCatalogloanrecord() throws Exception {
        System.out.println("getAllCatalogloanrecord");
        ICatalogloanrecordService instance = new ICatalogloanrecordServiceImpl();
        List<Catalogloanrecord> expResult = null;
        List<Catalogloanrecord> result = instance.getAllCatalogloanrecord();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteCatalogloanrecord method, of class ICatalogloanrecordService.
     */
    @Test
    public void testDeleteCatalogloanrecord() throws Exception {
        System.out.println("deleteCatalogloanrecord");
        int id = 0;
        ICatalogloanrecordService instance = new ICatalogloanrecordServiceImpl();
        instance.deleteCatalogloanrecord(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ICatalogloanrecordServiceImpl implements ICatalogloanrecordService {

        public void addCatalogloanrecord(Catalogloanrecord catalogloanrecord) throws Exception {
        }

        public void updateCatalogloanrecord(Catalogloanrecord catalogloanrecord) throws Exception {
        }

        public Catalogloanrecord getCatalogloanrecord(int id) throws Exception {
            return null;
        }

        public List<Catalogloanrecord> getAllCatalogloanrecord() throws Exception {
            return null;
        }

        public void deleteCatalogloanrecord(int id) throws Exception {
        }
    }
    
}
