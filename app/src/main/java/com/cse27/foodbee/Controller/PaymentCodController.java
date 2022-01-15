package com.cse27.foodbee.Controller;

import androidx.annotation.NonNull;

import com.cse27.foodbee.Model.PaymentModel;
import com.cse27.foodbee.Model.SignUpModel;
import com.cse27.foodbee.View.PaymentViewInterface;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.FirebaseFirestore;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

/**
 * The type Payment cod controller.
 */
public class PaymentCodController implements PaymentControllerInterface{


    /**
     * Instantiates a new Payment cod controller.
     */
    public PaymentCodController() {
    }

    /**
     * The Payment view.
     */
    PaymentViewInterface paymentView;
    /**
     * The Root node.
     */
    FirebaseDatabase rootNode;
    /**
     * The Reference.
     */
    DatabaseReference reference;
    /**
     * The Food bee.
     */
    FirebaseFirestore foodBee = FirebaseFirestore.getInstance();
    private FirebaseAuth shippingInfoAuth;

    /**
     * Instantiates a new Payment cod controller.
     *
     * @param paymentView the payment view
     */
    public PaymentCodController(PaymentViewInterface paymentView) {
        this.paymentView = paymentView;
    }

    @Override
    public void onConfirm(String userId, Double totalPayment, Timestamp orderDate, String orderID) {

        PaymentModel paymentModel = new PaymentModel(orderDate.toString(), orderID, "COD", "Delivered", totalPayment.toString());

        rootNode = FirebaseDatabase.getInstance();
        reference = rootNode.getReference("orderInfo");
        foodBee.collection("orderInfo").document(userId).collection("listOfOrder")
                .document(String.valueOf(orderID)).set(paymentModel).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if(task.isComplete()) {
                    paymentView.onPaymentSuccess("Order Confirmed");
                }
                else {
                    paymentView.onPaymentError("Try Again");
                }
            }
        });
    }
}
