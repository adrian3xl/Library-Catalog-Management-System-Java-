/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestSuites;

import CrudManager.PublisherManagerTest;
import Domain.PublisherTest;
import Service.HibernateImplement.PublisherImplementTest;
import Service.IPublisherServiceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Adrian
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({PublisherTest.class,PublisherManagerTest.class,IPublisherServiceTest.class,PublisherImplementTest.class})
public class PublisherTestSuite {
    
}