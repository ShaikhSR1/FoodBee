package com.cse27.foodbee.View;

public interface CancelOrderViewInterface {

    /**
     * shows toast on success
     */

    void onCancelOrderSuccess(String message);

    /**
     * shows toast on failure
     */

    void onCancelOtderFailure(String message);

}
