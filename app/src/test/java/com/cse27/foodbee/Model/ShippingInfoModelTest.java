package com.cse27.foodbee.Model;

import static org.junit.Assert.assertEquals;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * The type Shipping info model test.
 */
public class ShippingInfoModelTest extends TestCase {
    /**
     * The Shipping info model.
     */
    ShippingInfoModel shippingInfoModel;

    @Before
    public void setUp() throws Exception {
        shippingInfoModel = new ShippingInfoModel("Rafi","rafi@gmail.com","01785654128","RTH","Quick please!");
    }

    /**
     * Gets full name.
     */
    @Test
    public void getFullName() {
        assertEquals("Rafi",shippingInfoModel.getFullName());
    }

    /**
     * Gets email.
     */
    @Test
    public void getEmail() {
        assertEquals("Rafi@gmail.com",shippingInfoModel.getEmail());
    }

    /**
     * Gets phone number.
     */
    @Test
    public void getPhoneNumber() {
        assertEquals("01785654128",shippingInfoModel.getPhoneNumber());

    }


    /**
     * Gets address.
     */
    @Test
    public void getAddress() {
        assertEquals("Quick please!",shippingInfoModel.getAddress());

    }

    /**
     * Gets optional note.
     */
    @Test
    public void getOptionalNote() {
        assertEquals("Quick please!",shippingInfoModel.getOptionalNote());

    }

    /**
     * Is shipping info valid.
     */
    @Test
    public void testIsShippingInfoValid() {
        assertEquals(9,shippingInfoModel.isShippingInfoValid());
    }
}