package com.cse27.foodbee.Controller;

import junit.framework.TestCase;

import org.junit.Test;
import org.mockito.Mockito;

/**
 * The type Cart page show controller test.
 */
public class CartPageShowControllerTest extends TestCase {
    /**
     * Test init data.
     */
    @Test
    public void testInitData() {
        CartPageShowController cartPageShowController = Mockito.mock(CartPageShowController.class);
        cartPageShowController.initData();
        Mockito.verify(cartPageShowController, Mockito.times(1)).initData();
    }

    /**
     * Test on cart page show.
     */
    @Test
    public void testOnCartPageShow() {
        CartPageShowController cartPageShowController = Mockito.mock(CartPageShowController.class);
        cartPageShowController.onCartPageShow();
        Mockito.verify(cartPageShowController, Mockito.times(1)).onCartPageShow();
    }
}