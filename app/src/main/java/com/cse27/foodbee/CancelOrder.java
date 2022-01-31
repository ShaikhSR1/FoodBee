package com.cse27.foodbee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.cse27.foodbee.Controller.CancelOrderControllerInterface;
import com.cse27.foodbee.View.CancelOrderViewInterface;

public class CancelOrder extends AppCompatActivity implements CancelOrderViewInterface {

    TextView orderNumber;
    Button mChoice1, mChoice2, mChoice3, mChoice4,confirmCancelOrder;
    EditText feedback;
    String choice;

    CancelOrderControllerInterface cancelOrderController;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cancel_order);


        orderNumber= (TextView) findViewById(R.id.textViewOrderNumber);
        mChoice1= (Button) findViewById(R.id.buttonFeedback1);
        mChoice2= (Button) findViewById(R.id.buttonFeedback2);
        mChoice3= (Button) findViewById(R.id.buttonFeedback3);
        mChoice4= (Button) findViewById(R.id.buttonFeedback4);
        confirmCancelOrder= (Button) findViewById(R.id.buttonConfirmCancel);
        feedback= (EditText) findViewById(R.id.editTextFeedback);

        if(mChoice1.toString()!=""){
            choice =mChoice1.toString();
        }else if(mChoice2.toString()!=""){
            choice =mChoice2.toString();
        }else if(mChoice3.toString()!=""){
            choice = mChoice3.toString();
        }else {
            choice = mChoice4.toString();
        }

        confirmCancelOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cancelOrderController.onCancelOrder(orderNumber.toString().trim(),choice,feedback.getText().toString().trim());
            }
        });


    }

    /**
     * shows toast on success
     */
    @Override
    public void onCancelOrderSuccess(String message) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }

    /**
     * shows toast on failure
     */
    @Override
    public void onCancelOtderFailure(String message) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }
}