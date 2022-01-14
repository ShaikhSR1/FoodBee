package com.cse27.foodbee.Model;

import android.text.format.Time;

import com.google.firebase.Timestamp;

/**
 * The interface Order list model interface.
 */
public interface OrderListModelInterface {
    /**
     * Gets order id.
     *
     * @return the order id
     */
    public String getOrderId();

    /**
     * Gets order date.
     *
     * @return the order date
     */
    public Timestamp getOrderDate();

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus();

    /**
     * Gets payment method.
     *
     * @return the payment method
     */
    public String getPaymentMethod();

    /**
     * Gets total cost.
     *
     * @return the total cost
     */
    public Double getTotalCost();
}
