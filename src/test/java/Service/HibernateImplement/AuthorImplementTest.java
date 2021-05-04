/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.HibernateImplement;

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
public class AuthorImplementTest {
    
    public AuthorImplementTest() {
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
     * Test of addAuthor method, of class AuthorImplement.
     */
    @Test
    public void testAddAuthor() throws Exception {
        System.out.println("addAuthor");
        Author author = null;
        AuthorImplement instance = new AuthorImplement();
        instance.addAuthor(author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateAuthor method, of class AuthorImplement.
     */
    @Test
    public void testUpdateAuthor() throws Exception {
        System.out.println("updateAuthor");
        Author author = null;
        AuthorImplement instance = new AuthorImplement();
        instance.updateAuthor(author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAuthor method, of class AuthorImplement.
     */
    @Test
    public void testDeleteAuthor() throws Exception {
        System.out.println("deleteAuthor");
        Class Author = null;
        int authorId = 0;
        AuthorImplement instance = new AuthorImplement();
        instance.deleteAuthor(Author, authorId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthor method, of class AuthorImplement.
     */
    @Test
    public void testGetAuthor() throws Exception {
        System.out.println("getAuthor");
        int authorID = 0;
        AuthorImplement instance = new AuthorImplement();
        Author expResult = null;
        Author result = instance.getAuthor(authorID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllAuthors method, of class AuthorImplement.
     */
    @Test
    public void testGetAllAuthors() throws Exception {
        System.out.println("getAllAuthors");
        AuthorImplement instance = new AuthorImplement();
        List<Author> expResult = null;
        List<Author> result = instance.getAllAuthors();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAuthorJDBC method, of class AuthorImplement.
     */
    @Test
    public void testAddAuthorJDBC() throws Exception {
        System.out.println("addAuthorJDBC");
        Author author = null;
        AuthorImplement instance = new AuthorImplement();
        instance.addAuthorJDBC(author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateAuthorJDBC method, of class AuthorImplement.
     */
    @Test
    public void testUpdateAuthorJDBC() throws Exception {
        System.out.println("updateAuthorJDBC");
        Author author = null;
        AuthorImplement instance = new AuthorImplement();
        instance.updateAuthorJDBC(author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorJDBC method, of class AuthorImplement.
     */
    @Test
    public void testGetAuthorJDBC() throws Exception {
        System.out.println("getAuthorJDBC");
        int id = 0;
        AuthorImplement instance = new AuthorImplement();
        Author expResult = null;
        Author result = instance.getAuthorJDBC(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllAuthorsJDBC method, of class AuthorImplement.
     */
    @Test
    public void testGetAllAuthorsJDBC() throws Exception {
        System.out.println("getAllAuthorsJDBC");
        AuthorImplement instance = new AuthorImplement();
        ResultSet expResult = null;
        ResultSet result = instance.getAllAuthorsJDBC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAuthorJDBC method, of class AuthorImplement.
     */
    @Test
    public void testDeleteAuthorJDBC() throws Exception {
        System.out.println("deleteAuthorJDBC");
        int id = 0;
        AuthorImplement instance = new AuthorImplement();
        instance.deleteAuthorJDBC(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
