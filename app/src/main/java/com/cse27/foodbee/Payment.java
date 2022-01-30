package com.cse27.foodbee;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
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

    /**
     * The Shipping info.
     */
    ShippingInfoController shippingInfo;

    /**
     * The User id.
     */
    String userId;
    /**
     * The Current user.
     */
    FirebaseAuth currentUser;
    /**
     * The Order id.
     */
    String orderID = "pEBsWzh8NORvASzAskxRiyusl5Z2";
            //shippingInfo.getOrderID();


    Double total = 0.0;
    Double subTotoal = 447.50;
    Double shipping = 35.00;
    Double discount = 12.50;



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
    TextView tvSubTotalValue, tvShippingValue, tvDiscountValue, tvTotalValue;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        total = subTotoal + shipping - discount;
        userId = "pEBsWzh8NORvASzAskxRiyusl5Z2";
                //currentUser.getCurrentUser().getUid() ;

        paymentRadioGroup = (RadioGroup) findViewById(R.id.paymentRadioGroup);
        int radioButtonID = paymentRadioGroup.getCheckedRadioButtonId();
        paymentRadioBtn = (RadioButton) paymentRadioGroup.findViewById(radioButtonID);
        String selectedText = "COD"; //(String) paymentRadioBtn.getText();

        tvSubTotalValue = findViewById(R.id.tvSubTotalValue);
        tvShippingValue = findViewById(R.id.tvShippingValue);
        tvDiscountValue = findViewById(R.id.tvDiscountValue);
        tvTotalValue = findViewById(R.id.tvTotalValue);

        tvSubTotalValue.setText(subTotoal.toString());
        tvShippingValue.setText(shipping.toString());
        tvDiscountValue.setText(discount.toString());
        tvTotalValue.setText(total.toString());

        btnConfirmPayment = findViewById(R.id.btnConfirmPayment);

        btnConfirmPayment.setOnClickListener(new View.OnClickListener() {
            Long datetime = System.currentTimeMillis();
            Timestamp orderDate = new Timestamp(datetime);
            @Override
            public void onClick(View v) {
                if (selectedText.equals("COD")) {

                    paymentController = new PaymentCodController();
                    paymentController.onConfirm(userId ,total, orderDate, orderID);
                }
                else if (selectedText.equals("Bkash")) {

                    paymentController = new PaymentMobileController();
                    paymentController.onConfirm(userId, total, orderDate, orderID);
                }
                else if (selectedText.equals("Bank")) {

                    paymentController = new PaymentBankController();
                    paymentController.onConfirm(userId, total, orderDate, orderID);
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