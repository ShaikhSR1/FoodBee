package com.cse27.foodbee.Controller;

public interface CancelOrderControllerInterface {

    /**
     * performs action when confirm cancel button is pressed
     * @param orderNumber
     * @param choice
     * @param feedback
     */

    void onCancelOrder(String orderNumber, String choice, String feedback);
}
