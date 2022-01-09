package com.cse27.foodbee;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;
import android.widget.TextView;
import android.widget.Toast;

import com.cse27.foodbee.Controller.LoginController;
import com.cse27.foodbee.Controller.ProfileController;
import com.cse27.foodbee.Controller.ProfileControllerInterface;
import com.cse27.foodbee.View.ProfileViewInterface;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

public class Profile extends AppCompatActivity implements ProfileViewInterface {
    Button updateProfileButton, logoutButton;
    TextView profileUserName, profileUserAddress;
    private String fullName, address ;
    ProfileControllerInterface profileController ;


    public Profile(String fullName, String address) {
        this.fullName = fullName;
        this.address = address;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        profileUserName = (TextView) findViewById(R.id.textViewUserName);
        profileUserAddress = (TextView) findViewById(R.id.textViewUserAddress);

        //textViewUserName.setText("nishat");
        //textViewUserAddress.setText("ju");
        //fullName = profileController.getTextViewUserName();
        //address = profileController.getTextViewUserAddress();
        //textViewUserName.setText(fullName);
        //textViewUserAddress.setText(address);

        //profileController.onProfileReload();

        updateProfileButton = findViewById(R.id.updateProfileButton);
        logoutButton = findViewById(R.id.logoutButton);

        updateProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToUpdateProfile();
            }

        });

        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToLoginPage();
            }
        });

    }
    public void goToLoginPage(){
        Intent intent= new Intent(this, Login.class );
        startActivity(intent);
    }

    public void goToUpdateProfile(){
        Intent intent= new Intent(this, UpdateProfile.class );
        startActivity(intent);
    }

    @Override
    public void onProfileReloadSuccess(String fullName, String address) {

        Toast.makeText(this,"Hello !",Toast.LENGTH_LONG).show();
        profileUserName.setText(fullName);
        profileUserAddress.setText(address);
    }

    @Override
    public void onProfileReloadError(String message) {
        Toast.makeText(this,message ,Toast.LENGTH_LONG).show();
    }


}