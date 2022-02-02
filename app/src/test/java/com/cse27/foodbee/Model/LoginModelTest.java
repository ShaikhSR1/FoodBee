package com.cse27.foodbee.Model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LoginModelTest {
    LoginModel loginModel;

    /**
     * Calling constructor
     */

    @Before
    public void setUp() throws Exception {
        loginModel= new LoginModel("lionel@gmail.com","lionel1020");
    }
    /**
     * Gets Email
     */

    @Test
    public void getEmail() {
        assertEquals("lionel@gmail.com",loginModel.getEmail());
    }

    /**
     * Gets Password
     */

    @Test
    public void getPassword() {
        assertEquals("lionel1020",loginModel.getPassword());
    }

    /**
     * Checks if login is valid or not
     */

    @Test
    public void isLoginValid() {
        assertEquals(9,loginModel.isLoginValid());
    }
}