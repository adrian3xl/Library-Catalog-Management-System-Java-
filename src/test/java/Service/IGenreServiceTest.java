/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Domain.Genre;
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
public class IGenreServiceTest {
    
    public IGenreServiceTest() {
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
     * Test of addGenre method, of class IGenreService.
     */
    @Test
    public void testAddGenre() throws Exception {
        System.out.println("addGenre");
        Genre genre = null;
        IGenreService instance = new IGenreServiceImpl();
        instance.addGenre(genre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateGenre method, of class IGenreService.
     */
    @Test
    public void testUpdateGenre() throws Exception {
        System.out.println("updateGenre");
        Genre genre = null;
        IGenreService instance = new IGenreServiceImpl();
        instance.updateGenre(genre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGenre method, of class IGenreService.
     */
    @Test
    public void testGetGenre() throws Exception {
        System.out.println("getGenre");
        int id = 0;
        IGenreService instance = new IGenreServiceImpl();
        Genre expResult = null;
        Genre result = instance.getGenre(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllGenre method, of class IGenreService.
     */
    @Test
    public void testGetAllGenre() throws Exception {
        System.out.println("getAllGenre");
        IGenreService instance = new IGenreServiceImpl();
        List expResult = null;
        List result = instance.getAllGenre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteGenre method, of class IGenreService.
     */
    @Test
    public void testDeleteGenre() throws Exception {
        System.out.println("deleteGenre");
        Class Genre = null;
        int id = 0;
        IGenreService instance = new IGenreServiceImpl();
        instance.deleteGenre(Genre, id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IGenreServiceImpl implements IGenreService {

        public void addGenre(Genre genre) throws Exception {
        }

        public void updateGenre(Genre genre) throws Exception {
        }

        public Genre getGenre(int id) throws Exception {
            return null;
        }

        public List getAllGenre() throws Exception {
            return null;
        }

        public void deleteGenre(Class<?> Genre, int id) throws Exception {
        }
    }
    
}
