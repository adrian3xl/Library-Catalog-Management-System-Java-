/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestSuites;

import CrudManager.EmployeeManagerTest;
import Domain.EmployeeTest;
import Service.HibernateImplement.EmployeeImplementTest;
import Service.IEmployeeServiceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Adrian
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({EmployeeTest.class,EmployeeManagerTest.class,IEmployeeServiceTest.class,EmployeeImplementTest.class})
public class EmployeeTestSuite {
    
}