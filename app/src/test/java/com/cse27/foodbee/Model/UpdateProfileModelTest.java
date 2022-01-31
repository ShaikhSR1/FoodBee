package com.cse27.foodbee.Model;

import com.cse27.foodbee.Controller.OrderListController;

import junit.framework.TestCase;

import org.junit.Test;
import org.mockito.Mockito;

public class UpdateProfileModelTest extends TestCase {
    @Test
    public void testIsValid() {
       UpdateProfileModel updateProfileModel = Mockito.mock(UpdateProfileModel.class);
       updateProfileModel.isValid();
       Mockito.verify(updateProfileModel, Mockito.times(1)).isValid();
    }

}