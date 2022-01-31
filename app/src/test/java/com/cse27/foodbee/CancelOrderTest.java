package com.cse27.foodbee;

import static org.junit.Assert.*;

import com.cse27.foodbee.Controller.CancelOrderController;

import org.junit.Test;
import org.mockito.Mockito;

public class CancelOrderTest {

    CancelOrder cancelOrder = Mockito.mock(CancelOrder.class);
    /**
     * Test on the message that will show after Cancel Order Success
     */

    @Test
    public void onCancelOrderSuccess() {
        cancelOrder.onCancelOrderSuccess("Cancel Order Successful");
        Mockito.verify(cancelOrder, Mockito.times(1)).onCancelOrderSuccess("Cancel Order Successful");
    }
    /**
     * Test on the message that will show after Cancel Order Failure
     */

    @Test
    public void onCancelOtderFailure() {
        cancelOrder.onCancelOtderFailure("Cancel Order Failed");
        Mockito.verify(cancelOrder, Mockito.times(1)).onCancelOtderFailure("Cancel Order Failed");
    }
}