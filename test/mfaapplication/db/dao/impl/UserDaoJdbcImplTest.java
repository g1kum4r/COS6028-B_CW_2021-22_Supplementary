/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package mfaapplication.db.dao.impl;

import mfaapplication.model.User;
import org.apache.commons.lang.RandomStringUtils;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

/**
 *
 * @author jeeva
 */
@FixMethodOrder(value = MethodSorters.NAME_ASCENDING)
public class UserDaoJdbcImplTest {
    
    private static String userName;
    private static String password;
    
    
    @BeforeClass
    public static void setUpClass() {
        userName = RandomStringUtils.randomAlphanumeric(12).concat("_test");
        password = RandomStringUtils.randomAlphanumeric(12);
    }
        
    /**
     * Test of login method, of class UserDaoJdbcImpl.
     */

    /**
     * Test of register method, of class UserDaoJdbcImpl.
     */
    @Test
    public void test01_testRegister() {
        System.out.println("register");
        User user = new User(userName, password);
        UserDaoJdbcImpl instance = new UserDaoJdbcImpl();
        User result = instance.register(user);
        assertEquals(userName, result.getUsername());
        assertEquals(password, result.getPassword());
        assertNotNull(result.getId());
        assertTrue(result.getId() > 0);
    }
    
    @Test
    public void test02_testLogin() {
        System.out.println("login");
        UserDaoJdbcImpl instance = new UserDaoJdbcImpl();
        User result = instance.login(userName, password);
        assertEquals(userName, result.getUsername());
        assertEquals(password, result.getPassword());
    }
}
