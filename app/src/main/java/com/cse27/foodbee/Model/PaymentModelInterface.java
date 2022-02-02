package com.cse27.foodbee.Model;

/**
 * The interface Payment model interface.
 */
public interface PaymentModelInterface {
    /**
     * Gets order date.
     *
     * @return the order date
     */
    String getOrderDate();

    /**
     * Gets order id.
     *
     * @return the order id
     */
    String getOrderId();

    /**
     * Gets payment method.
     *
     * @return the payment method
     */
    String getPaymentMethod();

    /**
     * Gets status.
     *
     * @return the status
     */
    String getStatus();

    /**
     * Gets total cost.
     *
     * @return the total cost
     */
    Double getTotalCost();

    /**
     * Is valid payment method int.
     *
     * @return the int
     */
    int isValidPaymentMethod();
}
