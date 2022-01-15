package com.cse27.foodbee.Controller;

import java.sql.Timestamp;

/**
 * The interface Payment controller interface.
 */
public interface PaymentControllerInterface {
    /**
     * On confirm.
     *
     * @param userId    the user id
     * @param subTotal  the sub total
     * @param orderDate the order date
     * @param orderID   the order id
     */
    void onConfirm(String userId, Double subTotal, Timestamp orderDate, String orderID);
}
