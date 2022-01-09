package com.cse27.foodbee.Controller;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.cse27.foodbee.Model.ProfileModel;
import com.cse27.foodbee.Model.ProfileModelInterface;
import com.cse27.foodbee.Model.UpdateProfileModel;
import com.cse27.foodbee.Profile;
import com.cse27.foodbee.View.ProfileViewInterface;
import com.cse27.foodbee.View.UpdateProfileViewInterface;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import java.util.concurrent.Executor;

public class ProfileController implements ProfileControllerInterface{
    ProfileViewInterface profileView;
    FirebaseDatabase rootNode;
    DatabaseReference reference;
    FirebaseAuth updateProfileAuth;
    String userId;
    FirebaseFirestore foodBee = FirebaseFirestore.getInstance();

    public String textViewUserName, textViewUserAddress;

    public ProfileController (ProfileViewInterface profileView) {
        this.profileView = profileView;
    }
    ProfileModelInterface profileModel;

    @Override
    public void onProfileReload() {
        rootNode = FirebaseDatabase.getInstance();
        updateProfileAuth = FirebaseAuth.getInstance();
        //userId = "pEBsWzh8NORvASzAskxRiyusl5Z2";
        userId = updateProfileAuth.getCurrentUser().getUid();
        reference = rootNode.getReference("userProfile");

        DocumentReference documentReference = foodBee.collection("userProfile").document(userId);
        documentReference.addSnapshotListener((Executor) this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException error) {
                textViewUserName = documentSnapshot.getString("fullName");
                textViewUserAddress = documentSnapshot.getString("address");

                //profileModel = new ProfileModel(textViewUserName, textViewUserAddress);



                if(textViewUserName != " "){
                    profileView.onProfileReloadSuccess(textViewUserName, textViewUserAddress);

                }
                else{
                    profileView.onProfileReloadError("Log in Please ...");
                }
            }
        });


    }

    @Override
    public String getTextViewUserName ()
    {
        return textViewUserName;
    }
    @Override
    public String getTextViewUserAddress ()
    {
        return textViewUserAddress;
    }

}
