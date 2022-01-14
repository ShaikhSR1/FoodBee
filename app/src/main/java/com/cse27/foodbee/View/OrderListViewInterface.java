package com.cse27.foodbee.View;

import android.text.format.Time;

import com.google.firebase.Timestamp;

/**
 * The interface Order list view interface.
 */
public interface OrderListViewInterface {
    /**
     * On view order list success.
     *
     * @param orderId        the order id
     * @param orderDate      the order date
     * @param status         the status
     * @param payementMethod the payement method
     * @param totalCost      the total cost
     */
    void onViewOrderListSuccess(String orderId, Timestamp orderDate, String status, String payementMethod, Double totalCost);

    /**
     * On view order list error.
     */
    void onViewOrderListError();
}
