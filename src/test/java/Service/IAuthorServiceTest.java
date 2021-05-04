/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Domain.Author;
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
public class IAuthorServiceTest {
    
    public IAuthorServiceTest() {
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
     * Test of addAuthor method, of class IAuthorService.
     */
    @Test
    public void testAddAuthor() throws Exception {
        System.out.println("addAuthor");
        Author author = null;
        IAuthorService instance = new IAuthorServiceImpl();
        instance.addAuthor(author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateAuthor method, of class IAuthorService.
     */
    @Test
    public void testUpdateAuthor() throws Exception {
        System.out.println("updateAuthor");
        Author author = null;
        IAuthorService instance = new IAuthorServiceImpl();
        instance.updateAuthor(author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthor method, of class IAuthorService.
     */
    @Test
    public void testGetAuthor() throws Exception {
        System.out.println("getAuthor");
        int authorID = 0;
        IAuthorService instance = new IAuthorServiceImpl();
        Author expResult = null;
        Author result = instance.getAuthor(authorID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllAuthors method, of class IAuthorService.
     */
    @Test
    public void testGetAllAuthors() throws Exception {
        System.out.println("getAllAuthors");
        IAuthorService instance = new IAuthorServiceImpl();
        List<Author> expResult = null;
        List<Author> result = instance.getAllAuthors();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAuthor method, of class IAuthorService.
     */
    @Test
    public void testDeleteAuthor() throws Exception {
        System.out.println("deleteAuthor");
        Class Author = null;
        int authorId = 0;
        IAuthorService instance = new IAuthorServiceImpl();
        instance.deleteAuthor(Author, authorId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAuthorJDBC method, of class IAuthorService.
     */
    @Test
    public void testAddAuthorJDBC() throws Exception {
        System.out.println("addAuthorJDBC");
        Author author = null;
        IAuthorService instance = new IAuthorServiceImpl();
        instance.addAuthorJDBC(author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateAuthorJDBC method, of class IAuthorService.
     */
    @Test
    public void testUpdateAuthorJDBC() throws Exception {
        System.out.println("updateAuthorJDBC");
        Author author = null;
        IAuthorService instance = new IAuthorServiceImpl();
        instance.updateAuthorJDBC(author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorJDBC method, of class IAuthorService.
     */
    @Test
    public void testGetAuthorJDBC() throws Exception {
        System.out.println("getAuthorJDBC");
        int id = 0;
        IAuthorService instance = new IAuthorServiceImpl();
        Author expResult = null;
        Author result = instance.getAuthorJDBC(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllAuthorsJDBC method, of class IAuthorService.
     */
    @Test
    public void testGetAllAuthorsJDBC() throws Exception {
        System.out.println("getAllAuthorsJDBC");
        IAuthorService instance = new IAuthorServiceImpl();
        ResultSet expResult = null;
        ResultSet result = instance.getAllAuthorsJDBC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAuthorJDBC method, of class IAuthorService.
     */
    @Test
    public void testDeleteAuthorJDBC() throws Exception {
        System.out.println("deleteAuthorJDBC");
        int id = 0;
        IAuthorService instance = new IAuthorServiceImpl();
        instance.deleteAuthorJDBC(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IAuthorServiceImpl implements IAuthorService {

        public void addAuthor(Author author) throws Exception {
        }

        public void updateAuthor(Author author) throws Exception {
        }

        public Author getAuthor(int authorID) throws Exception {
            return null;
        }

        public List<Author> getAllAuthors() throws Exception {
            return null;
        }

        public void deleteAuthor(Class<?> Author, int authorId) throws Exception {
        }

        public void addAuthorJDBC(Author author) throws Exception {
        }

        public void updateAuthorJDBC(Author author) throws Exception {
        }

        public Author getAuthorJDBC(int id) throws Exception {
            return null;
        }

        public ResultSet getAllAuthorsJDBC() throws Exception {
            return null;
        }

        public void deleteAuthorJDBC(int id) throws Exception {
        }
    }
    
}
