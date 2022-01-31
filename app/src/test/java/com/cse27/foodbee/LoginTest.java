package com.cse27.foodbee;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class LoginTest {

    Login login = Mockito.mock(Login.class);


    /**
     * Test on the message that will show after Login Success
     */

    @Test
    public void onloginSuccess() {
        login.onLoginSuccess("login Successfull");
        Mockito.verify(login, Mockito.times(1)).onLoginSuccess("login Successfull");
    }
    /**
     * Test on the message that will show after Login Error
     */
    @Test
    public void onloginError() {
        login.onLoginError("login Failed");
        Mockito.verify(login, Mockito.times(1)).onLoginError("login Failed");
    }
}