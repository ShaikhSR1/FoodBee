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
import com.cse27.foodbee.View.PaymentViewInterface;

/**
 * The type Payment.
 */
public class Payment extends AppCompatActivity implements PaymentViewInterface {
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

        paymentRadioGroup = (RadioGroup) findViewById(R.id.paymentRadioGroup);
        int radioButtonID = paymentRadioGroup.getCheckedRadioButtonId();
        paymentRadioBtn = (RadioButton) paymentRadioGroup.findViewById(radioButtonID);
        String selectedText = (String) paymentRadioBtn.getText();

        btnConfirmPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (selectedText.equals("COD")) {
                    paymentController = new PaymentCodController();
                    paymentController.onConfirm();
                }
                else if (selectedText.equals("Bkash")) {
                    paymentController = new PaymentMobileController();
                    paymentController.onConfirm();
                }
                else if (selectedText.equals("Bank")) {
                    paymentController = new PaymentBankController();
                    paymentController.onConfirm();
                }
                else {
                    onPaymentError("Please Select and option");
                }
            }
        });

    }


    @Override
    public void onPaymentSuccess(String message) {

    }

    @Override
    public void onPaymentError(String message) {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }
}