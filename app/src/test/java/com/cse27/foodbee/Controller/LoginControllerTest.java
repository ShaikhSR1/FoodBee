package com.cse27.foodbee.Controller;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

/**
 * Login controller testing
 */

public class LoginControllerTest {

    /**
     * Test on after clicking Login
     */

    @Test
    public void onLogin() {
        LoginController loginController = Mockito.mock(LoginController.class);
        loginController.onLogin("lionel@gmail.com","lionel1020");
        Mockito.verify(loginController, Mockito.times(1)).onLogin("lionel@gmail.com","lionel1020");
    }
}