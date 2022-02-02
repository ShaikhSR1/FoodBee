package com.cse27.foodbee.Model;

import static org.junit.Assert.*;

import android.text.TextUtils;
import android.util.Patterns;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import android.content.Context;
import org.junit.Rule;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;

public class SignUpModelTest {
    SignUpModel signUpModel;
    public int a;
    //TestCasesSignUp signUpTest;
    TextUtils textUtils= Mockito.mock(TextUtils.class);
    Patterns patterns = Mockito.mock(Patterns.class);



    public String[][] testCases= {
            {"","","","",""},
            {"Jubair Al Faisal","","","",""},
            {"Jubair Al Faisal","jubaircom","","",""},
            {"Jubair Al Faisal","jubair.com","","",""},
            {"Jubair Al Faisal","jubair@gmailcom","","",""},
            {"Jubair Al Faisal","jubair@gmail.com","","",""},
            {"Jubair Al Faisal","jubair@gmail.com","01795","",""},
            {"Jubair Al Faisal","jubair@gmail.com","0179523440","",""},
            {"Jubair Al Faisal","jubair@gmail.com","017952344041","",""},
            {"Jubair Al Faisal","jubair@gmail.com","01795234404","",""},
            {"Jubair Al Faisal","jubair@gmail.com","01795234404","12345",""},
            {"Jubair Al Faisal","jubair@gmail.com","01795234404","12345678",""},
            {"Jubair Al Faisal","jubair@gmail.com","01795234404","1234567",""},
            {"Jubair Al Faisal","jubair@gmail.com","01795234404","1234567","12345"},
            {"Jubair Al Faisal","jubair@gmail.com","01795234404","1234567","1234567"},
    };
    int testOutput[]= {0,1,2,2,2,3,4,4,4,5,6,7,7,7,9};





    public String getFullNameTest(int a) {
        String testCase1 = testCases[a][0];
        return testCase1;
    }
    public String getEmailTest(int a) {
        String testCase2 = testCases[a][1];
        return testCase2;
    }
    public String getPhoneTest(int a) {
        String testCase3 = testCases[a][2];
        return testCase3;
    }
    public String getPasswordTest(int a) {
        String testCase4 = testCases[a][3];
        return testCase4;
    }
    public String getConfirmPasswordTest(int a) {
        String testCase5 = testCases[a][4];
        return testCase5;
    }

    public int getOutput(int a) {
        int output=testOutput[a];
        return output;
    }
    /**
     * Calling constructor
     */
    public void setUp(int n) throws Exception {
    signUpModel= new SignUpModel(getFullNameTest(n),getEmailTest(n),getPhoneTest(n),getPasswordTest(n),getConfirmPasswordTest(n));
    }


    /**
     * Gets Full Name
     */
    @Test
    public void getFullName() {
        assertEquals("Lionel Messi",signUpModel.getFullName());

    }
    /**
     * Gets Email
     */

    @Test
    public void getEmail() {
        assertEquals("lionel@gmail.com",signUpModel.getEmail());
    }
    /**
     * Gets Phone Number
     */

    @Test
    public void getPhoneNumber() {
        assertEquals("01785654128",signUpModel.getPhoneNumber());

    }
    /**
     * Gets Password
     */

    @Test
    public void getPassword() {
        assertEquals("lionel1030",signUpModel.getPassword());

    }
    /**
     * Gets Confirmed Password
     */

    @Test
    public void getConfirmPassword() {
        assertEquals("lionel1030",signUpModel.getConfirmPassword());

    }

    /**
     * Checks Sign UP Validity
     */



    @Test
    public void isSignUpValid0() throws Exception {
        int a=0;
        setUp(a);
        assertEquals(getOutput(a), signUpModel.isSignUpValid());
    }

    @Test
    public void isSignUpValid1() throws Exception {
        int a=1;
        setUp(a);
        assertEquals(getOutput(a), signUpModel.isSignUpValid());
    }

    @Test
    public void isSignUpValid2() throws Exception {
        int a=2;
        setUp(a);
        assertEquals(getOutput(a), signUpModel.isSignUpValid());
    }

    @Test
    public void isSignUpValid3() throws Exception {
        int a=3;
        setUp(a);
        assertEquals(getOutput(a), signUpModel.isSignUpValid());
    }

    @Test
    public void isSignUpValid4() throws Exception {
        int a=4;
        setUp(a);
        assertEquals(getOutput(a), signUpModel.isSignUpValid());
    }

    @Test
    public void isSignUpValid5() throws Exception {
        int a=5;
        setUp(a);
        assertEquals(getOutput(a), signUpModel.isSignUpValid());
    }

    @Test
    public void isSignUpValid6() throws Exception {
        int a=6;
        setUp(a);
        assertEquals(getOutput(a), signUpModel.isSignUpValid());
    }

    @Test
    public void isSignUpValid7() throws Exception {
        int a=7;
        setUp(a);
        assertEquals(getOutput(a), signUpModel.isSignUpValid());
    }
    @Test
    public void isSignUpValid8() throws Exception {
        int a=8;
        setUp(a);
        assertEquals(getOutput(a), signUpModel.isSignUpValid());
    }
    @Test
    public void isSignUpValid9() throws Exception {
        int a=9;
        setUp(a);
        assertEquals(getOutput(a), signUpModel.isSignUpValid());
    }
    @Test
    public void isSignUpValid10() throws Exception {
        int a=10;
        setUp(a);
        assertEquals(getOutput(a), signUpModel.isSignUpValid());
    }
    @Test
    public void isSignUpValid11() throws Exception {
        int a=11;
        setUp(a);
        assertEquals(getOutput(a), signUpModel.isSignUpValid());
    }
    @Test
    public void isSignUpValid12() throws Exception {
        int a=12;
        setUp(a);
        assertEquals(getOutput(a), signUpModel.isSignUpValid());
    }
    @Test
    public void isSignUpValid13() throws Exception {
        int a=13;
        setUp(a);
        assertEquals(getOutput(a), signUpModel.isSignUpValid());
    }
    @Test
    public void isSignUpValid14() throws Exception {
        int a=14;
        setUp(a);
        assertEquals(getOutput(a), signUpModel.isSignUpValid());
    }






}