/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestSuites;

import CrudManager.AuthorManagerTest;
import Domain.AuthorTest;
import Service.HibernateImplement.AuthorImplementTest;
import Service.IAuthorServiceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Adrian
 */


@RunWith(Suite.class)
@Suite.SuiteClasses({AuthorTest.class,AuthorManagerTest.class,IAuthorServiceTest.class,AuthorImplementTest.class})
public class AuthorTestSuite {
    
}
