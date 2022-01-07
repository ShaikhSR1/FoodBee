package com.cse27.foodbee.Controller;

import androidx.annotation.NonNull;

import com.cse27.foodbee.Model.SignUpModel;
import com.cse27.foodbee.Model.UpdateProfileModel;
import com.cse27.foodbee.View.SignUPViewInterface;
import com.cse27.foodbee.View.UpdateProfileViewInterface;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.FirebaseFirestore;

public class UpdateProfileController implements UpdateProfileControllerInterface{

    UpdateProfileViewInterface updateProfileView;
    FirebaseDatabase rootNode;
    DatabaseReference reference;
    FirebaseFirestore foodBee = FirebaseFirestore.getInstance();
    private FirebaseAuth updateProfileAuth;
    private String userId;


    public UpdateProfileController(UpdateProfileViewInterface updateProfileView) {
        this.updateProfileView = updateProfileView;
    }


    @Override
    public void onUpdateProfile(String fullName, String email, String phoneNumber, String address, String password) {
        UpdateProfileModel updateProfilepModel = new UpdateProfileModel(fullName, email,phoneNumber,address, password);

        int updateProfileCode = updateProfilepModel.isValid();
        if(updateProfileCode == 0){
            updateProfileView.onUpdateProfileError("Please Enter Full Name");

        }else if(updateProfileCode == 1){
            updateProfileView.onUpdateProfileError("Please Enter Email");

        }else if(updateProfileCode == 2){
            updateProfileView.onUpdateProfileError("Please Enter Valid Email");

        }else if(updateProfileCode == 3){
            updateProfileView.onUpdateProfileError("Please Enter Phone Number");

        }else if(updateProfileCode == 4){
            updateProfileView.onUpdateProfileError("Please Enter Valid Phone Number");

        }else if(updateProfileCode == 5){
            updateProfileView.onUpdateProfileError("Please Enter Password");

        }else if(updateProfileCode == 6){
            updateProfileView.onUpdateProfileError("Please Should Be 6 Or More Character");

        }else if(updateProfileCode == 7){
            updateProfileView.onUpdateProfileError("Please Enter valid Address");

        }else {
            rootNode = FirebaseDatabase.getInstance();
            //userId = fAuth.getCurrentUser().getUid();
            userId = "pEBsWzh8NORvASzAskxRiyusl5Z2";
            reference = rootNode.getReference("userProfile").child(userId);
            updateProfileAuth = FirebaseAuth.getInstance();
            reference.setValue("");

            updateProfileAuth.createUserWithEmailAndPassword(updateProfilepModel.getEmail(),updateProfilepModel.getPassword())
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isComplete()) {
                                //String userId = updateProfileAuth.getUid();
                                  userId = updateProfileAuth.getCurrentUser().getUid();
                                if(userId!=null) {
                                    foodBee.collection("userProfile").document(String.valueOf(userId)).set(updateProfilepModel).addOnCompleteListener(new OnCompleteListener<Void>() {
                                        @Override
                                        public void onComplete(@NonNull Task<Void> task) {
                                            if(task.isComplete()) {
                                                updateProfileView.onUpdateProfileSuccess("Update Successful");

                                            }
                                            else {
                                                updateProfileView.onUpdateProfileError("Please Try Again");
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
