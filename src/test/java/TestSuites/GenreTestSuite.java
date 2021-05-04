/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestSuites;

import CrudManager.GenreManagerTest;
import Domain.GenreTest;
import Service.HibernateImplement.GenreImplementTest;
import Service.IGenreServiceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Adrian
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({GenreTest.class,GenreManagerTest.class,IGenreServiceTest.class,GenreImplementTest.class})
public class GenreTestSuite {
    
}