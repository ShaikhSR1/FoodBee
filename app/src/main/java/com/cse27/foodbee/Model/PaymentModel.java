package com.cse27.foodbee.Model;

import android.text.TextUtils;
import android.util.Patterns;

/**
 * The type Payment model.
 */
public class PaymentModel implements PaymentModelInterface{

    private String orderDate, orderId, paymentMethod, status;
    Double totalCost;

    /**
     * Instantiates a new Payment model.
     */
    public PaymentModel() {
    }

    /**
     * Instantiates a new Payment model.
     *
     * @param orderDate     the order date
     * @param orderId       the order id
     * @param paymentMethod the payment method
     * @param status        the status
     * @param totalCost     the total cost
     */
    public PaymentModel(String orderDate, String orderId, String paymentMethod, String status, Double totalCost) {
        this.orderDate = orderDate;
        this.orderId = orderId;
        this.paymentMethod = paymentMethod;
        this.status = status;
        this.totalCost = totalCost;
    }



    /**
     *Getter for declared private variables
     * @return variables
     */

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
    public Double getTotalCost() {

        return totalCost;
    }

    @Override
    public int isValidPaymentMethod() {

        if(totalCost<0) {
            return 1;
        }
        else if(totalCost<40.0) {
            return 2;
        }
        else {
            return 0;
        }
    }
}
