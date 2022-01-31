package com.cse27.foodbee.Controller;

import junit.framework.TestCase;

import org.junit.Test;
import org.mockito.Mockito;

/**
 * The type Update profile controller test.
 */
public class UpdateProfileControllerTest extends TestCase {

    /**
     * Test on update profile.
     */
    @Test
    public void testOnUpdateProfile() {
        UpdateProfileController updateProfileController = Mockito.mock(UpdateProfileController.class);
        updateProfileController.onUpdateProfile("Nishat Tasnim","tasnimnishat5349@gmail.com","01886378125","BKZH","nishu5349");
        Mockito.verify(updateProfileController, Mockito.times(1)).onUpdateProfile("Nishat Tasnim","tasnimnishat5349@gmail.com","01886378125","BKZH","nishu5349");
    }

}