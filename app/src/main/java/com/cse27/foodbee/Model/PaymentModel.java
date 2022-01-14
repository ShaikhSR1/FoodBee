package com.cse27.foodbee.Model;

import android.text.TextUtils;
import android.util.Patterns;

public class PaymentModel implements PaymentModelInterface{

    private String orderDate, orderId, paymentMethod, status, totalCost;


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
