package com.cse27.foodbee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.cse27.foodbee.Controller.ShippingInfoController;
import com.cse27.foodbee.Controller.ShippingInfoControllerInterface;
import com.cse27.foodbee.Controller.UpdateProfileController;
import com.cse27.foodbee.View.ShippingInfoViewInterface;

/**
 * The type Shipping info.
 */
public class ShippingInfo extends AppCompatActivity implements ShippingInfoViewInterface {
    /**
     * The User name.
     */
    EditText userName,
    /**
     * The User email.
     */
    userEmail,
    /**
     * The User phone number.
     */
    userPhoneNumber,
    /**
     * The User address.
     */
    userAddress,
    /**
     * The Optional note.
     */
    optionalNote;
    /**
     * The Submit shipping info button.
     */
    Button submitShippingInfoButton;
    private String fullName, email, phoneNo, address, optNote;

    /**
     * The Shipping info controller.
     */
    ShippingInfoControllerInterface shippingInfoController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shipping_info);

        shippingInfoController = new ShippingInfoController(this);
        userName = (EditText) findViewById(R.id.userName);
        userEmail = (EditText) findViewById(R.id.userEmail);
        userPhoneNumber = (EditText) findViewById(R.id.userMobileNo);
        userAddress = (EditText) findViewById(R.id.userAddress);
        optionalNote = (EditText) findViewById(R.id.optionalNote);
        submitShippingInfoButton = (Button) findViewById(R.id.submitShippingInfoButton);

        submitShippingInfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shippingInfoController.onSubmitShippingInfo(userName.getText().toString().trim(),userEmail.getText().toString().trim(),userPhoneNumber.getText().toString().trim(),userAddress.getText().toString().trim(),optionalNote.getText().toString().trim());
            }
        });

    }

    /**
     * this function will act if submission is successfull and display
     * @param message the message
     */
    @Override
    public void onSubmitShippingInfoSuccess(String message) {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
        Intent intent= new Intent(ShippingInfo.this, Payment.class );
        startActivity(intent);
    }


    /**
     * this function will act if submission is unsuccessfull and display error
     * @param message the message
     */
    @Override
    public void onSubmitShippingInfoError(String message) {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }
}