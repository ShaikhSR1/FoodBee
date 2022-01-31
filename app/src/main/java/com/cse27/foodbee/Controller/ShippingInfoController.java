package com.cse27.foodbee.Controller;

import androidx.annotation.NonNull;

import com.cse27.foodbee.Model.ShippingInfoModel;
import com.cse27.foodbee.Model.SignUpModel;
import com.cse27.foodbee.ShippingInfo;
import com.cse27.foodbee.View.ShippingInfoViewInterface;
import com.cse27.foodbee.View.SignUPViewInterface;
import com.cse27.foodbee.View.UpdateProfileViewInterface;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.FirebaseFirestore;

/**
 * The type Shipping info controller.
 */
public class ShippingInfoController implements ShippingInfoControllerInterface{

    String orderID;

    public String getOrderID() {
        return orderID;
    }

    /**
     * Instantiates a new Shipping info controller.
     */
    public ShippingInfoController() {
    }

    /**
     * The Shipping info view.
     */
    ShippingInfoViewInterface shippingInfoView;
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
    private FirebaseAuth shippingInfoAuth;

    /**
     * Instantiates a new Shipping info controller.
     *
     * @param shippingInfoView the sign up view
     */
    public ShippingInfoController(ShippingInfoViewInterface shippingInfoView) {
        this.shippingInfoView = shippingInfoView;
    }

    /**
     * this function will be activated when the Next button will be pressed
     */

    @Override
    public void onSubmitShippingInfo(String fullName, String email, String phoneNumber, String address, String optionalNote) {
        ShippingInfoModel shippingInfoModel = new ShippingInfoModel(fullName, email,phoneNumber,address,optionalNote);
        int shippingInfoCode = shippingInfoModel.isShippingInfoValid();
        if(shippingInfoCode == 0){
            shippingInfoView.onSubmitShippingInfoError("Please Enter Full Name");

        }else if(shippingInfoCode == 1){
            shippingInfoView.onSubmitShippingInfoError("Please Enter Email");

        }else if(shippingInfoCode == 2){
            shippingInfoView.onSubmitShippingInfoError("Please Enter Valid Email");

        }else if(shippingInfoCode == 3){
            shippingInfoView.onSubmitShippingInfoError("Please Enter Phone Number");

        }else if(shippingInfoCode == 4){
            shippingInfoView.onSubmitShippingInfoError("Please Enter Valid Phone Number");

        }else if(shippingInfoCode == 5){
            shippingInfoView.onSubmitShippingInfoError("Please Enter Shipping Address");

        }else{
            rootNode = FirebaseDatabase.getInstance();
            reference = rootNode.getReference("shippingInfo");
            shippingInfoAuth = FirebaseAuth.getInstance();

            reference.setValue("");
            shippingInfoView.onSubmitShippingInfoSuccess("Shipping Info Successfully Received");

            /*shippingInfoAuth.createUserWithEmailAndPassword(shippingInfoModel.getEmail(),shippingInfoModel.getAddress())
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isComplete()) {
                                String userId = shippingInfoAuth.getCurrentUser().getUid();

                                if(userId!=null) {
                                    foodBee.collection("shippingInfo").document(String.valueOf(userId)).set(shippingInfoModel).addOnCompleteListener(new OnCompleteListener<Void>() {
                                        @Override
                                        public void onComplete(@NonNull Task<Void> task) {
                                            if(task.isComplete()) {
                                                shippingInfoView.onSubmitShippingInfoSuccess("Shipping Info Successfully Received");

                                            }
                                            else {
                                                shippingInfoView.onSubmitShippingInfoError("Please Try Again");
                                            }

                                        }
                                    });
                                }
                            }
                        }
                    });*/


            }

        }
}
