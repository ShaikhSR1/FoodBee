package com.cse27.foodbee.Controller;

import com.cse27.foodbee.Model.SignUpModel;
import com.cse27.foodbee.View.SignUPViewInterface;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.FirebaseFirestore;

public class SignUpController implements SignUpControllerInterface{

    SignUPViewInterface signUpView;

    FirebaseDatabase rootNode;
    DatabaseReference reference;
    FirebaseFirestore foodBee = FirebaseFirestore.getInstance();

    public SignUpController(SignUPViewInterface signUpView) {
        this.signUpView = signUpView;
    }

    @Override
    public void onSignUp(String fullName, String email, String phoneNumber, String password, String confirmPassword) {
        SignUpModel signUpModel = new SignUpModel(fullName, email,phoneNumber,password,confirmPassword);

            int signUpCode = signUpModel.isValid();
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
                signUpView.onSignUpSuccess("SignUp Successful");

                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("userProfile");

                reference.setValue("");

                foodBee.collection("FoodBee").document("userProfile").set(signUpModel);


            }




        }


    }
