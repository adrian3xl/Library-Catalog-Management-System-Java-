/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestSuites;

import CrudManager.DocumenttypeManagerTest;
import Domain.DocumenttypeTest;
import Service.HibernateImplement.DocumenttypeImplementTest;
import Service.IDocumenttypeServiceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Adrian
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({DocumenttypeTest.class,DocumenttypeManagerTest.class,IDocumenttypeServiceTest.class,DocumenttypeImplementTest.class})
public class DocumenttypeTestSuite {
    
}
