package com.cse27.foodbee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.cse27.foodbee.Controller.SignUpController;
import com.cse27.foodbee.Controller.SignUpControllerInterface;
import com.cse27.foodbee.View.SignUPViewInterface;


public class SignUp extends AppCompatActivity implements SignUPViewInterface {

    EditText inputSignUpFullName,inputSignUpEmail,inputSignUpPhone,inputSignUpPassword,inputSignUpConfirmPassword;
    Button signUpButton;
    TextView toLogin;

    SignUpControllerInterface signUpController;

    /**
     * takes values fron user
     * sends the values to controlller
     * @param savedInstanceState
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        toLogin = (TextView) findViewById(R.id.toLogin);
        signUpController = new SignUpController(this);
        inputSignUpFullName = (EditText) findViewById(R.id.inputSignUpFullName);
        inputSignUpEmail = (EditText) findViewById(R.id.inputSignUpEmail);
        inputSignUpPhone = (EditText) findViewById(R.id.inputSignUpPhone);
        inputSignUpPassword = (EditText) findViewById(R.id.inputSignUpPassword);
        inputSignUpConfirmPassword = (EditText) findViewById(R.id.inputSignUpConfirmPassword);
        signUpButton = (Button) findViewById(R.id.signUpButton);
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signUpController.onSignUp(inputSignUpFullName.getText().toString().trim(),inputSignUpEmail.getText().toString().trim(),inputSignUpPhone.getText().toString().trim(),inputSignUpPassword.getText().toString().trim(),inputSignUpConfirmPassword.getText().toString().trim());
            }
        });

        toLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp.this, Login.class);
                startActivity(intent);
            }
        });

    }

    /**
     * success messsage
     * @param message
     */

    @Override
    public void onSignUpSuccess(String message) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(SignUp.this, MainActivity.class);
        startActivity(intent);

    }

    /**
     * failed massage
     * @param message
     */

    @Override
    public void onSignUpError(String message) {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }
}
