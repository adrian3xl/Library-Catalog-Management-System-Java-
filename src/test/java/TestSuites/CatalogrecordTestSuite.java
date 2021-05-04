/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestSuites;

import CrudManager.CatalogrecordManagerTest;
import Domain.CatalogrecordTest;
import Service.HibernateImplement.CatalogrecordImplementTest;
import Service.ICatalogrecordServiceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Adrian
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({CatalogrecordTest.class,CatalogrecordManagerTest.class,ICatalogrecordServiceTest.class,CatalogrecordImplementTest.class})
public class CatalogrecordTestSuite {
    
}
