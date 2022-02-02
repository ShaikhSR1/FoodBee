package com.cse27.foodbee.Model;

import com.cse27.foodbee.Controller.OrderListController;

import static org.junit.Assert.*;

import android.text.TextUtils;
import android.util.Patterns;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import android.content.Context;

import junit.framework.TestCase;

import org.junit.Rule;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;


/**
 * The type Update profile model test.
 */
public class UpdateProfileModelTest extends TestCase {
    /**
     * The Update profile model.
     */
    UpdateProfileModel updateProfileModel, /**
     * The Update profile model 1.
     */
    updateProfileModel1;
    /**
     * The A.
     */
    public int a = 11;
    /**
     * The Text utils.
     */
    TextUtils textUtils = Mockito.mock(TextUtils.class);
    /**
     * The Patterns.
     */
    Patterns patterns = Mockito.mock(Patterns.class);

    /**
     * The Test cases.
     */
    public String[][] testCases = {
            {"", "", "", "", ""},
            {"Nishat", "", "", "", ""},
            {"Nishat", "nishat", "", "", ""},
            {"Nishat", "nishu@com", "", "", ""},
            {"Nishat", "nishu@gmailcom", "", "", ""},
            {"Nishat", "nishu@gmail.com", "", "", ""},
            {"Nishat", "nishu@gmail.com", "01795", "", ""},
            {"Nishat", "nishu@gmail.com", "017083781252", "", ""},
            {"Nishat", "nishu@gmail.com", "01708378125", "", ""},
            {"Nishat", "nishu@gmail.com", "01708378125", "BKZH", ""},
            {"Nishat", "nishu@gmail.com", "01708378125", "BKZH", "nish"},
            {"Nishat", "nishu@gmail.com", "01708378125", "BKZH", "nishu5349"},
    };
    /**
     * The Test output.
     */
    int testOutput[] = {0, 1, 2, 2, 2, 3, 4, 4, 5, 6, 7, 8};

    /**
     * Calling constructor
     *
     * @param a the a
     * @return the full name test
     */
    public String getFullNameTest(int a) {
        String testCase1 = testCases[a][0];
        return testCase1;
    }

    /**
     * Gets email test.
     *
     * @param a the a
     * @return the email test
     */
    public String getEmailTest(int a) {
        String testCase2 = testCases[a][1];
        return testCase2;
    }

    /**
     * Gets phone test.
     *
     * @param a the a
     * @return the phone test
     */
    public String getPhoneTest(int a) {
        String testCase3 = testCases[a][2];
        return testCase3;
    }

    /**
     * Gets address test.
     *
     * @param a the a
     * @return the address test
     */
    public String getAddressTest(int a) {
        String testCase4 = testCases[a][3];
        return testCase4;
    }

    /**
     * Gets password test.
     *
     * @param a the a
     * @return the password test
     */
    public String getPasswordTest(int a) {
        String testCase5 = testCases[a][4];
        return testCase5;
    }



    @Before
    public void setUp() throws Exception {
        updateProfileModel = new UpdateProfileModel(getFullNameTest(a), getEmailTest(a), getPhoneTest(a), getAddressTest(a), getPasswordTest(a));
    }

    /**
     * Gets full name.
     */
    @Test
    public void testGetFullName() {
        assertEquals("Nishat", updateProfileModel.getFullName());
    }

    /**
     * Gets email.
     */
    @Test
    public void testGetEmail() {
        assertEquals("nishu@gmail.com", updateProfileModel.getEmail());
    }

    /**
     * Gets phone number.
     */
    @Test
    public void testGetPhoneNumber() {
        assertEquals("01708378125", updateProfileModel.getPhoneNumber());

    }

    /**
     * Gets address.
     */
    @Test
    public void testGetAddress() {
        assertEquals("BKZH", updateProfileModel.getAddress());

    }

    /**
     * Gets password.
     */
    @Test
    public void testGetPassword() {
        assertEquals("nishu5349", updateProfileModel.getPassword());

    }

    /**
     * Sets up values.
     *
     * @param n the n
     * @throws Exception the exception
     */
    public void setUpValues(int n) throws Exception {
        updateProfileModel1 = new UpdateProfileModel(testCases[n][0], testCases[n][1], testCases[n][2], testCases[n][3], testCases[n][4]);
    }


    /**
     * Checks Profile info Validity
     *
     * @throws Exception the exception
     */
    @Test
    public void testIsUpdateProfileValid0() throws Exception {
        int n=0;
        setUpValues(n);
        //int valid = updateProfileModel1.isValid();
        assertEquals(testOutput[n], updateProfileModel1.isValid());
    }

    /**
     * Test is update profile valid 1.
     *
     * @throws Exception the exception
     */
    @Test
    public void testIsUpdateProfileValid1() throws Exception {
        int n=1;
        setUpValues(n);
        //int valid = updateProfileModel1.isValid();
        assertEquals(testOutput[n], updateProfileModel1.isValid());
    }

    /**
     * Test is update profile valid 2.
     *
     * @throws Exception the exception
     */
    @Test
    public void testIsUpdateProfileValid2() throws Exception {
        int n=2;
        setUpValues(n);
        //int valid = updateProfileModel1.isValid();
        assertEquals(testOutput[n], updateProfileModel1.isValid());
    }

    /**
     * Test is update profile valid 3.
     *
     * @throws Exception the exception
     */
    @Test
    public void testIsUpdateProfileValid3() throws Exception {
        int n=3;
        setUpValues(n);
        //int valid = updateProfileModel1.isValid();
        assertEquals(testOutput[n], updateProfileModel1.isValid());
    }

    /**
     * Test is update profile valid 4.
     *
     * @throws Exception the exception
     */
    @Test
    public void testIsUpdateProfileValid4() throws Exception {
        int n=4;
        setUpValues(n);
        //int valid = updateProfileModel1.isValid();
        assertEquals(testOutput[n], updateProfileModel1.isValid());
    }

    /**
     * Test is update profile valid 5.
     *
     * @throws Exception the exception
     */
    @Test
    public void testIsUpdateProfileValid5() throws Exception {
        int n=5;
        setUpValues(n);
        //int valid = updateProfileModel1.isValid();
        assertEquals(testOutput[n], updateProfileModel1.isValid());
    }

    /**
     * Test is update profile valid 6.
     *
     * @throws Exception the exception
     */
    @Test
    public void testIsUpdateProfileValid6() throws Exception {
        int n=6;
        setUpValues(n);
        //int valid = updateProfileModel1.isValid();
        assertEquals(testOutput[n], updateProfileModel1.isValid());
    }

    /**
     * Test is update profile valid 7.
     *
     * @throws Exception the exception
     */
    @Test
    public void testIsUpdateProfileValid7() throws Exception {
        int n=7;
        setUpValues(n);
        //int valid = updateProfileModel1.isValid();
        assertEquals(testOutput[n], updateProfileModel1.isValid());
    }

    /**
     * Test is update profile valid 8.
     *
     * @throws Exception the exception
     */
    @Test
    public void testIsUpdateProfileValid8() throws Exception {
        int n=8;
        setUpValues(n);
        //int valid = updateProfileModel1.isValid();
        assertEquals(testOutput[n], updateProfileModel1.isValid());
    }

    /**
     * Test is update profile valid 9.
     *
     * @throws Exception the exception
     */
    @Test
    public void testIsUpdateProfileValid9() throws Exception {
        int n=9;
        setUpValues(n);
        //int valid = updateProfileModel1.isValid();
        assertEquals(testOutput[n], updateProfileModel1.isValid());
    }

    /**
     * Test is update profile valid 10.
     *
     * @throws Exception the exception
     */
    @Test
    public void testIsUpdateProfileValid10() throws Exception {
        int n=10;
        setUpValues(n);
        //int valid = updateProfileModel1.isValid();
        assertEquals(testOutput[n], updateProfileModel1.isValid());
    }

    /**
     * Test is update profile valid 11.
     *
     * @throws Exception the exception
     */
    @Test
    public void testIsUpdateProfileValid11() throws Exception {
        int n=11;
        setUpValues(n);
        //int valid = updateProfileModel1.isValid();
        assertEquals(testOutput[n], updateProfileModel1.isValid());
    }



}