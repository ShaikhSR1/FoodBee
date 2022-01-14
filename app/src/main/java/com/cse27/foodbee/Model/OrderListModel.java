package com.cse27.foodbee.Model;

import android.text.format.Time;

import com.google.firebase.Timestamp;

/**
 * The type Order list model.
 */
public class OrderListModel implements OrderListModelInterface {
    /**
     * The Order id.
     */
    String orderId, /**
     * The Status.
     */
    status, /**
     * The Payment method.
     */
    paymentMethod;
    /**
     * The Order date.
     */
    Timestamp orderDate;
    /**
     * The Total.
     */
    Double total;

    /**
     * Instantiates a new Order list model.
     */
    public OrderListModel() {

    }

    /**
     * Instantiates a new Order list model.
     *
     * @param orderId       the order id
     * @param status        the status
     * @param paymentMethod the payment method
     * @param orderDate     the order date
     * @param total         the total
     */
    public OrderListModel(String orderId, String status, String paymentMethod, Timestamp orderDate, Double total) {
        this.orderId = orderId;
        this.status = status;
        this.paymentMethod = paymentMethod;
        this.orderDate = orderDate;
        this.total = total;
    }

    @Override
    public String getOrderId() {
        return orderId;
    }

    @Override
    public Timestamp getOrderDate() {
        return orderDate;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public String getPaymentMethod() {
        return paymentMethod;
    }

    @Override
    public Double getTotalCost() {
        return total;
    }
}
