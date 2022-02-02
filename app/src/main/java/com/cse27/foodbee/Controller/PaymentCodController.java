package com.cse27.foodbee.Controller;

import androidx.annotation.NonNull;

import com.cse27.foodbee.Model.PaymentModel;
import com.cse27.foodbee.View.PaymentViewInterface;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.FirebaseFirestore;

import java.sql.Timestamp;

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

        PaymentModel paymentModel = new PaymentModel(orderDate.toString(), orderID, "COD", "Delivered", totalPayment);

        rootNode = FirebaseDatabase.getInstance();
        reference = rootNode.getReference("orderInfo");

        /**
         * Updating to FireStore
         * Collection "orderInfo"
         */
        int paymentValidation = paymentModel.isValidPaymentMethod();

        if (paymentValidation == 1) {
            paymentView.onPaymentError("Total Payment cannot be less than 40");
        }
        else if (paymentValidation == 2) {
            paymentView.onPaymentError("Total Payment cannot be less than 40");
        }
        else if (paymentValidation == 3) {
            paymentView.onPaymentError("Status is not delivered");
        }
        else if (paymentValidation == 4) {
            paymentView.onPaymentError("Payment Method not COD");
        }
        else if (paymentValidation == 5) {
            paymentView.onPaymentError("Time Error");
        }
        else {

            foodBee.collection("orderInfo").document(userId).collection("listOfOrder")
                    .document(String.valueOf(orderID)).set(paymentModel).addOnCompleteListener(new OnCompleteListener<Void>() {
                @Override
                public void onComplete(@NonNull Task<Void> task) {
                    if (task.isComplete()) {
                        paymentView.onPaymentSuccess("Successful");
                    } else {
                        paymentView.onPaymentError("Try Again");
                    }
                }
            });
        }
    }
}
