package com.cse27.foodbee.Controller;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

/**
 * Cancel Order controller testing
 */

public class CancelOrderControllerTest {

    /**
     * Test on after clicking Confirm Cancel Order
     */

    @Test
    public void onCancelOrder() {
        CancelOrderController cancelOrderController = Mockito.mock(CancelOrderController.class);
        cancelOrderController.onCancelOrder("000093","Late Delivery","Delivery is too late");
        Mockito.verify(cancelOrderController, Mockito.times(1)).onCancelOrder("000093","Late Delivery","Delivery is too late");
    }
}