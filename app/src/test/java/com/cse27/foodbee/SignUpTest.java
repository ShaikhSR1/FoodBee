package com.cse27.foodbee;

import static org.junit.Assert.*;

import android.os.Bundle;

import com.cse27.foodbee.Controller.LoginController;

import org.junit.Test;
import org.mockito.Mockito;

/**
 * Test on after clicking signup
 */

public class SignUpTest {

    SignUp signUp = Mockito.mock(SignUp.class);


    /**
     * Test on the message that will show after SignUP Success
     */

    @Test
    public void onSignUpSuccess() {
        signUp.onSignUpSuccess("SignUp Successfull");
        Mockito.verify(signUp, Mockito.times(1)).onSignUpSuccess("SignUp Successfull");
    }
    /**
     * Test on the message that will show after SignUP Error
     */
    @Test
    public void onSignUpError() {
        signUp.onSignUpError("SignUp Failed");
        Mockito.verify(signUp, Mockito.times(1)).onSignUpError("SignUp Failed");
    }
}