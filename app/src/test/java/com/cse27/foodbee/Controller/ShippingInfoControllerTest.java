package com.cse27.foodbee.Controller;

import junit.framework.TestCase;

import org.junit.Test;
import org.mockito.Mockito;

/**
 * The type Shipping info controller test.
 */
public class ShippingInfoControllerTest extends TestCase {
    /**
     * Test on submit shipping info.
     */
    @Test
    public void testOnSubmitShippingInfo() {
        ShippingInfoController shippingInfoController = Mockito.mock(ShippingInfoController.class);
        shippingInfoController.onSubmitShippingInfo("Rahat","rahat@gmail.com","01886378125","RTH","Yummy Food Please");
        Mockito.verify(shippingInfoController, Mockito.times(1)).onSubmitShippingInfo("Rahat","rahat@gmail.com","01886378125","RTH","Yummy Food Please");
    }
}