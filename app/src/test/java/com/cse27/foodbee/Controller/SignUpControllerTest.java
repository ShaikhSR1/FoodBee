package com.cse27.foodbee.Controller;

import junit.framework.TestCase;

import org.mockito.Mockito;

/**
 * Sign Up controller testing
 */

public class SignUpControllerTest extends TestCase {

    /**
     * Test on after clicking signup
     */

    public void testOnSignUp() {
        SignUpController signUpController = Mockito.mock(SignUpController.class);
        signUpController.onSignUp("Lionel Messi","lionel@gmail.com","01785654128","lionel1030","lionel1030");
        Mockito.verify(signUpController, Mockito.times(1)).onSignUp("Lionel Messi","lionel@gmail.com","01785654128","lionel1030","lionel1030");
    }
}