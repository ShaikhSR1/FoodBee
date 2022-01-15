package com.cse27.foodbee.Model;

import android.text.TextUtils;
import android.util.Patterns;

/**
 * The type Payment model.
 */
public class PaymentModel implements PaymentModelInterface{

    private String orderDate, orderId, paymentMethod, status, totalCost;

    /**
     * Instantiates a new Payment model.
     *
     * @param toString  the to string
     * @param orderID   the order id
     * @param cod       the cod
     * @param delivered the delivered
     * @param toString1 the to string 1
     */
    public PaymentModel(String toString, String orderID, String cod, String delivered, String toString1) {
    }


    @Override
    public String getOrderDate() {
        return orderDate;
    }

    @Override
    public String getOrderId() {
        return orderId;
    }

    @Override
    public String getPaymentMethod() {
        return paymentMethod;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public String getTotalCost() {
        return totalCost;
    }

    @Override
    public int isValidPaymentMethod() {
        return 0;
    }
}
