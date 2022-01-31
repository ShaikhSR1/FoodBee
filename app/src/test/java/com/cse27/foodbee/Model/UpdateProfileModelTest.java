package com.cse27.foodbee.Model;

import com.cse27.foodbee.Controller.OrderListController;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class UpdateProfileModelTest extends TestCase {
    /**
     * The Update profile model.
     */
    UpdateProfileModel updateProfileModel;

    @Before
    public void setUp() throws Exception {
        updateProfileModel = new UpdateProfileModel("Nishat","nishat@gmail.com","01785654128","BKZH","nishu5349");
    }

    /**
     * Gets full name.
     */
    @Test
    public void getFullName() {
        assertEquals("Nishat",updateProfileModel.getFullName());
    }

    /**
     * Gets email.
     */
    @Test
    public void getEmail() {
        assertEquals("nishat@gmail.com",updateProfileModel.getEmail());
    }

    /**
     * Gets phone number.
     */
    @Test
    public void getPhoneNumber() {
        assertEquals("01785654128",updateProfileModel.getPhoneNumber());

    }


    /**
     * Gets address.
     */
    @Test
    public void getAddress() {
        assertEquals("BKZH",updateProfileModel.getAddress());

    }

    /**
     * Gets password.
     */
    @Test
    public void getPassword() {
        assertEquals("nishu5349",updateProfileModel.getPassword());

    }

    /**
     * Is shipping info valid.
     */
    @Test
    public void isShippingInfoValid() {
        assertEquals(9,updateProfileModel.isValid());
    }

}