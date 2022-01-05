package com.cse27.foodbee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.cse27.foodbee.Controller.SignUpController;
import com.cse27.foodbee.Controller.SignUpControllerInterface;
import com.cse27.foodbee.Controller.UpdateProfileController;
import com.cse27.foodbee.Controller.UpdateProfileControllerInterface;
import com.cse27.foodbee.View.UpdateProfileViewInterface;

public class UpdateProfile extends AppCompatActivity implements UpdateProfileViewInterface {

    EditText updateUserName, updateUserEmail, updateUserAddress, updateUserMobileNo, updateUserPassword;
    Button updateProfileButton;

    UpdateProfileControllerInterface updateProfileController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_profile);

        updateProfileController = new UpdateProfileController(this);
        updateUserName = (EditText) findViewById(R.id.updateUserName);
        updateUserEmail = (EditText) findViewById(R.id.updateUserEmail);
        updateUserMobileNo = (EditText) findViewById(R.id.updateUserMobileNo);
        updateUserAddress = (EditText) findViewById(R.id.updateUserAddress);
        updateUserPassword = (EditText) findViewById(R.id.updateUserPassword);
        updateProfileButton = (Button) findViewById(R.id.updateProfileButton);
        updateProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateProfileController.onUpdateProfile(updateUserName.getText().toString().trim(),updateUserEmail.getText().toString().trim(),updateUserMobileNo.getText().toString().trim(),updateUserAddress.getText().toString().trim(),updateUserPassword.getText().toString().trim());
            }
        });
    }

    @Override
    public void onUpdateProfileSuccess(String message) {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }

    @Override
    public void onUpdateProfileError(String message) {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }
}