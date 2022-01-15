package com.cse27.foodbee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.cse27.foodbee.Controller.PaymentBankController;
import com.cse27.foodbee.Controller.PaymentCodController;
import com.cse27.foodbee.Controller.PaymentControllerInterface;
import com.cse27.foodbee.Controller.PaymentMobileController;
import com.cse27.foodbee.Controller.ShippingInfoController;
import com.cse27.foodbee.View.PaymentViewInterface;
import com.google.firebase.auth.FirebaseAuth;

import java.sql.Timestamp;

/**
 * The type Payment.
 */
public class Payment extends AppCompatActivity implements PaymentViewInterface {

    ShippingInfoController shippingInfo;

    String userId;
    FirebaseAuth currentUser;
    String orderID = shippingInfo.getOrderID();


    Double subTotoal = 447.50;
    /**
     * The Payment radio group.
     */
    RadioGroup paymentRadioGroup;
    /**
     * The Payment radio btn.
     */
    RadioButton paymentRadioBtn;
    /**
     * The Payment controller.
     */
    PaymentControllerInterface paymentController;
    /**
     * The Btn confirm payment.
     */
    Button btnConfirmPayment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        userId = currentUser.getCurrentUser().getUid() ;

        paymentRadioGroup = (RadioGroup) findViewById(R.id.paymentRadioGroup);
        int radioButtonID = paymentRadioGroup.getCheckedRadioButtonId();
        paymentRadioBtn = (RadioButton) paymentRadioGroup.findViewById(radioButtonID);
        String selectedText = (String) paymentRadioBtn.getText();

        btnConfirmPayment.setOnClickListener(new View.OnClickListener() {
            Long datetime = System.currentTimeMillis();
            Timestamp orderDate = new Timestamp(datetime);
            @Override
            public void onClick(View v) {
                if (selectedText.equals("COD")) {

                    paymentController = new PaymentCodController();
                    paymentController.onConfirm(userId ,subTotoal, orderDate, orderID);
                }
                else if (selectedText.equals("Bkash")) {

                    paymentController = new PaymentMobileController();
                    paymentController.onConfirm(userId, subTotoal, orderDate, orderID);
                }
                else if (selectedText.equals("Bank")) {

                    paymentController = new PaymentBankController();
                    paymentController.onConfirm(userId, subTotoal, orderDate, orderID);
                }
                else {
                    onPaymentError("Please Select and option");
                }
            }
        });

    }


    @Override
    public void onPaymentSuccess(String message) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPaymentError(String message) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }
}