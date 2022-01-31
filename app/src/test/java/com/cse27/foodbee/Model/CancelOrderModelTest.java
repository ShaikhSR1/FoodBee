package com.cse27.foodbee.Model;

import static org.junit.Assert.*;

import org.junit.Test;

public class CancelOrderModelTest {

    /**
     * cancel order object
     */
    CancelOrderModel cancelOrderModel= new CancelOrderModel("000093","Late Delivery","Delivery is too late");

    /**
     * Gets choice
     */

    @Test
    public void getChoice() {
        assertEquals("Late Delivery",cancelOrderModel.getChoice());
    }
    /**
     * Gets Feedback
     */
    @Test
    public void getFeedback() {
        assertEquals("Delivery is too late",cancelOrderModel.getFeedback());
    }

    /**
     * checks if cancel order is complete or not
     */

    @Test
    public void isCancelOredrComplete() {
        assertEquals(java.util.Optional.of(2),cancelOrderModel.isCancelOredrComplete());
    }
}