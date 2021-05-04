/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestSuites;

import CrudManager.CatalogloanrecordManagerTest;
import Domain.CatalogloanrecordTest;
import Service.HibernateImplement.CatalogloanrecordImplementTest;
import Service.ICatalogloanrecordServiceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Adrian
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({CatalogloanrecordTest.class,CatalogloanrecordManagerTest.class,ICatalogloanrecordServiceTest.class,CatalogloanrecordImplementTest.class})
public class CatalogloanrecordTestSuite {
    
}