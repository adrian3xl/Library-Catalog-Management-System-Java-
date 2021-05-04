/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestSuites;

import CrudManager.CustomerManagerTest;
import Domain.CustomerTest;
import Service.HibernateImplement.CustomerImplementTest;
import Service.ICustomerServiceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Adrian
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({CustomerTest.class,CustomerManagerTest.class,ICustomerServiceTest.class,CustomerImplementTest.class})
public class CustomerTestSuite {
    
}