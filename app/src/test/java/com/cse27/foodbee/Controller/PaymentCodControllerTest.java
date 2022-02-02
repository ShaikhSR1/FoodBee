package com.cse27.foodbee.Controller;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import java.sql.Timestamp;

/**
 * The type Payment cod controller test.
 */
public class PaymentCodControllerTest extends TestCase {

    /**
     * The Datetime.
     */
    Long datetime = System.currentTimeMillis();
    /**
     * The Order date.
     */
    Timestamp orderDate = new Timestamp(datetime);

    /**
     * Test on confirm.
     */
    @Test
    public void testOnConfirm() {
        PaymentCodController paymentCodController = mock(PaymentCodController.class);

        //Mockito.doNothing().when(paymentCodController).onConfirm(isA);

        paymentCodController.onConfirm("28321e21uieh821", 213.5, orderDate, "219euhbi23e21");

        verify(paymentCodController, Mockito.times(1)).onConfirm("28321e21uieh821", 213.5, orderDate, "219euhbi23e21");

    }
}