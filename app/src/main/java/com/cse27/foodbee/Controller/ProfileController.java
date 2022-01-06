package com.cse27.foodbee.Controller;

import androidx.annotation.Nullable;

import com.cse27.foodbee.Model.ProfileModel;
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
    Profile userProfile;
    FirebaseDatabase rootNode;
    DatabaseReference reference;
    FirebaseAuth fAuth;
    String userId;
    FirebaseFirestore foodBee = FirebaseFirestore.getInstance();

    String textViewUserName, textViewUserAddress;

    public ProfileController(ProfileViewInterface profileView) {
        this.profileView = profileView;
    }


    @Override
    public void onProfileReload() {
        fAuth = FirebaseAuth.getInstance();
        //userId = fAuth.getCurrentUser().getUid();
        userId = "pEBsWzh8NORvASzAskxRiyusl5Z2";
        DocumentReference documentReference = foodBee.collection("userProfile").document(userId);
        DocumentSnapshot documentSnapshot = null;
        documentReference.addSnapshotListener((Executor) this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                textViewUserName = documentSnapshot.getString("fullName");
                textViewUserAddress = documentSnapshot.getString("address");
                ProfileModel profilepModel = new ProfileModel(textViewUserName, textViewUserAddress);
                if(textViewUserName != " "){
                    profileView.onProfileReloadSuccess(textViewUserName, textViewUserAddress);

                    rootNode = FirebaseDatabase.getInstance();
                    reference = rootNode.getReference("userProfile");

                    reference.setValue("");

                    foodBee.collection("FoodBee").document("userProfile").set(profilepModel);


                }
                else{
                    profileView.onProfileReloadError("Log in Please ...");
                }

            }
        });
    }
}
