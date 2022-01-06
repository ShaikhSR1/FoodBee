package com.cse27.foodbee.Controller;

import android.content.Intent;

import androidx.annotation.NonNull;

import com.cse27.foodbee.Login;
import com.cse27.foodbee.MainActivity;
import com.cse27.foodbee.Model.SignUpModel;
import com.cse27.foodbee.SignUp;
import com.cse27.foodbee.View.SignUPViewInterface;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.FirebaseFirestore;

public class SignUpController implements SignUpControllerInterface{

    SignUPViewInterface signUpView;

    FirebaseDatabase rootNode;
    DatabaseReference reference;
    FirebaseFirestore foodBee = FirebaseFirestore.getInstance();
    private FirebaseAuth signUpAuth;

    public SignUpController(SignUPViewInterface signUpView) {
        this.signUpView = signUpView;
    }

    @Override
    public void onSignUp(String fullName, String email, String phoneNumber, String password, String confirmPassword) {
        SignUpModel signUpModel = new SignUpModel(fullName, email,phoneNumber,password,confirmPassword);

        int signUpCode = signUpModel.isSignUpValid();
        if(signUpCode == 0){
            signUpView.onSignUpError("Please Enter Full Name");

        }else if(signUpCode == 1){
            signUpView.onSignUpError("Please Enter Email");

        }else if(signUpCode == 2){
            signUpView.onSignUpError("Please Enter Valid Email");

        }else if(signUpCode == 3){
            signUpView.onSignUpError("Please Enter Phone Number");

        }else if(signUpCode == 4){
            signUpView.onSignUpError("Please Enter Valid Phone Number");

        }else if(signUpCode == 5){
            signUpView.onSignUpError("Please Enter Password");

        }else if(signUpCode == 6){
            signUpView.onSignUpError("Please Should Be 6 Or More Character");

        }else if(signUpCode == 7){
            signUpView.onSignUpError("Passwords Do Not Match");

        }else {


            rootNode = FirebaseDatabase.getInstance();
            reference = rootNode.getReference("userProfile");
            signUpAuth = FirebaseAuth.getInstance();

            reference.setValue("");

            signUpAuth.createUserWithEmailAndPassword(signUpModel.getEmail(),signUpModel.getPassword())
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isComplete()) {
                                String userId = signUpAuth.getUid();

                                if(userId!=null) {
                                    foodBee.collection("userProfile").document(String.valueOf(userId)).set(signUpModel).addOnCompleteListener(new OnCompleteListener<Void>() {
                                        @Override
                                        public void onComplete(@NonNull Task<Void> task) {
                                            if(task.isComplete()) {
                                                signUpView.onSignUpSuccess("SignUp Successful");

                                            }
                                            else {
                                                signUpView.onSignUpError("Please Try Again");
                                            }

                                        }
                                    });
                                }
                            }
                        }
                    });

        }
    }

}
