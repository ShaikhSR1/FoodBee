package com.cse27.foodbee.View;

/**
 * The interface Payment view interface.
 */
public interface PaymentViewInterface {
    /**
     * On payment success.
     *
     * @param message the message
     */
    void onPaymentSuccess(String message);

    /**
     * On payment error.
     *
     * @param message the message
     */
    void onPaymentError(String message);
}
