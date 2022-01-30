package com.cse27.foodbee.Controller;

/**
 * The interface Shipping info controller interface.
 */
public interface ShippingInfoControllerInterface {
    /**
     * On submit shipping info.
     *
     * @param fullName     the full name
     * @param email        the email
     * @param phoneNumber  the phone number
     * @param address      the address
     * @param optionalNote the optional note
     */
    void onSubmitShippingInfo(String fullName,String email,String phoneNumber, String address ,String optionalNote);
}
