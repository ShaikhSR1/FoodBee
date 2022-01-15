package com.cse27.foodbee.Controller;

import java.sql.Timestamp;

/**
 * The type Payment bank controller.
 */
public class PaymentBankController implements PaymentControllerInterface{
    /**
     * Instantiates a new Payment bank controller.
     */
    public PaymentBankController() {
    }

    @Override
    public void onConfirm(String userId, Double totalPayment, Timestamp orderDate, String orderID) {

    }
}
