package com.cse27.foodbee.Controller;

import com.cse27.foodbee.Model.CancelOrderModel;
import com.cse27.foodbee.View.CancelOrderViewInterface;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.FirebaseFirestore;

public class CancelOrderController implements CancelOrderControllerInterface{

    CancelOrderViewInterface cancelOrderView;
    FirebaseDatabase rootNode;
    DatabaseReference reference;
    FirebaseFirestore foodBee = FirebaseFirestore.getInstance();

    public CancelOrderController(CancelOrderViewInterface cancelOrderView){
        this.cancelOrderView=cancelOrderView;
    }


    /**
     * performs action when confirm cancel button is pressed
     *
     * @param orderNumber
     * @param choice
     * @param feedback
     */
    @Override
    public void onCancelOrder(String orderNumber, String choice, String feedback) {
        CancelOrderModel cancelOrderModel= new CancelOrderModel(orderNumber,choice,feedback);
        int cancelCode=cancelOrderModel.isCancelOredrComplete();
        if (cancelCode==0){
            cancelOrderView.onCancelOtderFailure("Please select a choice");
        }else if(cancelCode==1){
            cancelOrderView.onCancelOtderFailure("Please add a Feedback");
        }else {
            rootNode = FirebaseDatabase.getInstance();
            reference = rootNode.getReference("feedback");
            reference.setValue("");
            foodBee.collection("feedback").document(String.valueOf(orderNumber)).set(cancelOrderModel);


            cancelOrderView.onCancelOrderSuccess("Order Cancelation Successful");
        }



    }
}
