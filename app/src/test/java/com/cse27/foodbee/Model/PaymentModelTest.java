package com.cse27.foodbee.Model;

import junit.framework.TestCase;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.sql.Timestamp;

public class PaymentModelTest {

    PaymentModel paymentModel;
    /**
     * The Datetime.
     */
    Long datetime = System.currentTimeMillis();
    /**
     * The Order date.
     */
    Timestamp orderDate = new Timestamp(datetime);
    Double totalPayment = -225.0;
    String date = orderDate.toString();

    public String[][] testCase= {
            {date, "tWTEiXYQfqR73QP1cz847i3ptz52", "COD", "Delivered", String.valueOf(-225.00)}, //test 0 expected 1
            {date, "tWTEiXYQfqR73QP1cz847i3ptz52", "COD", "Delivered", String.valueOf(10.00)}, // test 1 expected 2
            {date, "tWTEiXYQfqR73QP1cz847i3ptz52", "COD", "Delivered", String.valueOf(40.00)}, // test 2 expected 0
            {date, "tWTEiXYQfqR73QP1cz847i3ptz52", "Bank", "Delivered", String.valueOf(100)}, // test 3 expected 4
            {date, "tWTEiXYQfqR73QP1cz847i3ptz52", "", "Delivered", String.valueOf(100)}, // test 4 expected 4
            {date, "tWTEiXYQfqR73QP1cz847i3ptz52", "COD", "", String.valueOf(100)}, // test 5 expected 3
            {date, "", "COD", "Delivered", String.valueOf(100)}, // test 6 expected 6
            {"", "tWTEiXYQfqR73QP1cz847i3ptz52", "COD", "Delivered", String.valueOf(100)}, // test 7 expected 5
            {date, "tWTEiXYQfqR73QP1cz847i3ptz52", "COD", "Pending", String.valueOf(100)}, // test 8 expected 0
            {date, "tWTEiXYQfqR73QP1cz847i3ptz52", "COD", "Delivered", String.valueOf(100)}, // test 9 expected 0
    };

    public int expected[]= {1,2,0,4,4,3,6,5,3,0};



    public void setUp(int n) throws Exception {
        paymentModel = new PaymentModel(testCase[n][0],testCase[n][1],testCase[n][2],testCase[n][3],Double.parseDouble(testCase[n][4]));
    }

    @Test
    public void testIsValidPaymentMethod0() throws Exception {
        int n= 0;
        setUp(n);
        assertEquals(expected[n],paymentModel.isValidPaymentMethod());
    }

    @Test
    public void testIsValidPaymentMethod1() throws Exception {
        int n= 1;
        setUp(n);
        assertEquals(expected[n],paymentModel.isValidPaymentMethod());
    }

    @Test
    public void testIsValidPaymentMethod2() throws Exception {
        int n= 2;
        setUp(n);
        assertEquals(expected[n],paymentModel.isValidPaymentMethod());
    }

    @Test
    public void testIsValidPaymentMethod3() throws Exception {
        int n= 3;
        setUp(n);
        assertEquals(expected[n],paymentModel.isValidPaymentMethod());
    }

    @Test
    public void testIsValidPaymentMethod4() throws Exception {
        int n= 4;
        setUp(n);
        assertEquals(expected[n],paymentModel.isValidPaymentMethod());
    }

    @Test
    public void testIsValidPaymentMethod5() throws Exception {
        int n= 5;
        setUp(n);
        assertEquals(expected[n],paymentModel.isValidPaymentMethod());
    }

    @Test
    public void testIsValidPaymentMethod6() throws Exception {
        int n= 6;
        setUp(n);
        assertEquals(expected[n],paymentModel.isValidPaymentMethod());
    }

    @Test
    public void testIsValidPaymentMethod7() throws Exception {
        int n= 7;
        setUp(n);
        assertEquals(expected[n],paymentModel.isValidPaymentMethod());
    }

    @Test
    public void testIsValidPaymentMethod8() throws Exception {
        int n= 8;
        setUp(n);
        assertEquals(expected[n],paymentModel.isValidPaymentMethod());
    }

    @Test
    public void testIsValidPaymentMethod9() throws Exception {
        int n= 9;
        setUp(n);
        assertEquals(expected[n],paymentModel.isValidPaymentMethod());
    }

}