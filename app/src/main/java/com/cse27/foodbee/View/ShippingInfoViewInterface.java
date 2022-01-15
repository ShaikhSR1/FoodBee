package com.cse27.foodbee.View;

/**
 * The interface Shipping info view interface.
 */
public interface ShippingInfoViewInterface {
    /**
     * On submit shipping info success.
     *
     * @param message the message
     */
    void onSubmitShippingInfoSuccess(String message);

    /**
     * On submit shipping info error.
     *
     * @param message the message
     */
    void onSubmitShippingInfoError(String message);
}
