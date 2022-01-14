package com.cse27.foodbee;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.cse27.foodbee.Controller.SignUpController;
import com.cse27.foodbee.Controller.SignUpControllerInterface;
import com.cse27.foodbee.Controller.UpdateProfileController;
import com.cse27.foodbee.Controller.UpdateProfileControllerInterface;
import com.cse27.foodbee.View.UpdateProfileViewInterface;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

/**
 * this Update Profile Screen will show a page with Profile Info which are editable
 */
public class UpdateProfile extends AppCompatActivity implements UpdateProfileViewInterface {

    /**
     * The Update user name.
     */
    EditText updateUserName, /**
     * The Update user email.
     */
    updateUserEmail, /**
     * The Update user address.
     */
    updateUserAddress, /**
     * The Update user phone number.
     */
    updateUserPhoneNumber, /**
     * The Update user password.
     */
    updateUserPassword;
    /**
     * The Update profile button.
     */
    Button updateProfileButton;
    /**
     * The Image view cross.
     */
    ImageView imageViewCross;
    private String fullName, email, phoneNo, address, password;
    private String userId;
    /**
     * The Root node.
     */
    FirebaseDatabase rootNode;
    /**
     * The Reference.
     */
    DatabaseReference reference;
    /**
     * The Food bee.
     */
    FirebaseFirestore foodBee = FirebaseFirestore.getInstance();
    private FirebaseAuth profileAuth;


    /**
     * The Update profile controller.
     */
    UpdateProfileControllerInterface updateProfileController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_profile);


        updateProfileController = new UpdateProfileController(this);
        updateUserName = (EditText) findViewById(R.id.updateUserName);
        updateUserEmail = (EditText) findViewById(R.id.updateUserEmail);
        updateUserPhoneNumber = (EditText) findViewById(R.id.updateUserMobileNo);
        updateUserAddress = (EditText) findViewById(R.id.updateUserAddress);
        updateUserPassword = (EditText) findViewById(R.id.updateUserPassword);
        updateProfileButton = (Button) findViewById(R.id.updateProfileButton);

        rootNode = FirebaseDatabase.getInstance();
        profileAuth = FirebaseAuth.getInstance();

        //userId = "pEBsWzh8NORvASzAskxRiyusl5Z2";
        userId = profileAuth.getCurrentUser().getUid();
        reference = rootNode.getReference("userProfile");

        /**
         * Here profile information are being fetched.
         */

        DocumentReference documentReference = foodBee.collection("userProfile").document(userId);
        documentReference.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException error) {
                updateUserName.setText(documentSnapshot.getString("fullName"));
                updateUserEmail.setText(documentSnapshot.getString("email"));
                updateUserPhoneNumber.setText(documentSnapshot.getString("phoneNumber"));
                updateUserAddress.setText(documentSnapshot.getString("address"));
                updateUserPassword.setText(documentSnapshot.getString("password"));
            }
        });


        /**
         * After clicking the button, data will be updated in the userProfile table in firebase.
         */
        updateProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateProfileController.onUpdateProfile(updateUserName.getText().toString().trim(),updateUserEmail.getText().toString().trim(),updateUserPhoneNumber.getText().toString().trim(),updateUserAddress.getText().toString().trim(),updateUserPassword.getText().toString().trim());
            }
        });
    }

    /**
     * After successfully updating user will navigate to profile  page
     * and there will be a Toast message.
     * @param message
     */
    @Override
    public void onUpdateProfileSuccess(String message) {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
        Intent intent= new Intent(this, Profile.class );
        startActivity(intent);
    }

    @Override
    public void onUpdateProfileError(String message) {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }
}