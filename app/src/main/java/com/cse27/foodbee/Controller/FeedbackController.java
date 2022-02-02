package com.cse27.foodbee.Controller;

import android.widget.RatingBar;
import android.widget.TextView;


import androidx.annotation.NonNull;

import com.cse27.foodbee.Model.FeedbackModel;
import com.cse27.foodbee.View.FeedbackViewInterface;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.FirebaseFirestore;

/**
 * The type Feedback controller.
 */
public class FeedbackController implements FeedbackControllerInterface{
    /**
     * this feedview,rootnode,reference variable are used for storing data on firebase
     */
    FeedbackViewInterface feedView;
    /**
     * The Tv feedback.
     */
    TextView tvFeedback;
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
    private FirebaseAuth feedAuth;
    private String userId;

    /**
     * feedbackcontroller is a constructor for this class.
     *
     * @param feedView the feed view
     */
    public FeedbackController(FeedbackViewInterface feedView) {
        this.feedView = feedView;
    }


    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        if (rating == 0)
        {
            tvFeedback.setText("Very Dissatisfied");
        }
        else if (rating == 1)
        {
            tvFeedback.setText("Dissatisfied");
        }
        else if (rating == 2 || rating == 3)
        {
            tvFeedback.setText("Ok");
        }
        else if (rating == 4)
        {
            tvFeedback.setText("Satisfied");
        }
        else if (rating == 5)
        {
            tvFeedback.setText("Very Satisfied");
        }
        /**
         * Feedback taken from data users and saving it to our firebase database
         *
         */
        else{
            rootNode = FirebaseDatabase.getInstance();
            userId = "";
            reference = rootNode.getReference("userProfile").child(userId);
            feedAuth = FirebaseAuth.getInstance();
            reference.setValue("");

           /* feedAuth.createUserWithEmailAndPassword(FeedbackModel.getFeedback(),FeedbackModel.getFoodRating())
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        private Object FeedbackModel;

                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isComplete()) {
                                userId = feedAuth.getCurrentUser().getUid();
                                if(userId!=null) {
                                    foodBee.collection("userProfile").document(String.valueOf(userId)).set(FeedbackModel).addOnCompleteListener(new OnCompleteListener<Void>() {
                                        @Override
                                        public void onComplete(@NonNull Task<Void> task) {
                                            if(task.isComplete()) {
                                                feedView.onFeedbackSuccess("Feedback is given Successfully");

                                            }
                                            else {
                                                feedView.onFeedbackError("Please Try Again");
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
