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
            {date, "tWTEiXYQfqR73QP1cz847i3ptz52", "COD", "Delivered", String.valueOf(-225.00)},
            {date, "tWTEiXYQfqR73QP1cz847i3ptz52", "COD", "Delivered", String.valueOf(10.00)},
            {date, "tWTEiXYQfqR73QP1cz847i3ptz52", "COD", "Delivered", String.valueOf(40.00)},
            {date, "tWTEiXYQfqR73QP1cz847i3ptz52", "COD", "Delivered", String.valueOf(100)},
    };

    public int expected[]= {1,2,0,0};



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

}