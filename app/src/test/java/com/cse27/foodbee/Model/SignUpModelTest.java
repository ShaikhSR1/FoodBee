package com.cse27.foodbee.Model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SignUpModelTest {
    SignUpModel signUpModel;

    @Before
    public void setUp() throws Exception {
        signUpModel = new SignUpModel("Lionel Messi","lionel@gmail.com","01785654128","lionel1030","lionel1030");
    }

    @Test
    public void getFullName() {
        assertEquals("Lionel Messi",signUpModel.getFullName());
    }

    @Test
    public void getEmail() {
        assertEquals("lionel@gmail.com",signUpModel.getEmail());
    }

    @Test
    public void getPhoneNumber() {
        assertEquals("01785654128",signUpModel.getPhoneNumber());

    }

    @Test
    public void getPassword() {
        assertEquals("lionel1030",signUpModel.getPassword());

    }

    @Test
    public void getConfirmPassword() {
        assertEquals("lionel1030",signUpModel.getConfirmPassword());

    }

    @Test
    public void isSignUpValid() {
        assertEquals(9,signUpModel.isSignUpValid());
    }
}