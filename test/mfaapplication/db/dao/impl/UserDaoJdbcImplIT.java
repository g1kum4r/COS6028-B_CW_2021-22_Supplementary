/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package mfaapplication.db.dao.impl;

import mfaapplication.model.User;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jeeva
 */
public class UserDaoJdbcImplIT {
    
    public UserDaoJdbcImplIT() {
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
     * Test of login method, of class UserDaoJdbcImpl.
     */

    /**
     * Test of register method, of class UserDaoJdbcImpl.
     */
    @Test
    public void testRegister() {
        System.out.println("register");
        User user = new User("user1", "user1");
        UserDaoJdbcImpl instance = new UserDaoJdbcImpl();
        User expResult = new User("user1", "user1");
        User result = instance.register(user);
        assertEquals(expResult.getUsername(), result.getUsername());
        assertEquals(expResult.getPassword(), result.getPassword());
        assertNotNull(result.getId());
        assertTrue(result.getId() > 0);
    }
    
    @Test
    public void testLogin() {
        System.out.println("login");
        String username = "user1";
        String password = "user1";
        UserDaoJdbcImpl instance = new UserDaoJdbcImpl();
        User expResult = new User("user1", "user1");;
        User result = instance.login(username, password);
        assertEquals(expResult.getUsername(), result.getUsername());
        assertEquals(expResult.getPassword(), result.getPassword());
    }
}
