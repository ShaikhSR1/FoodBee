package com.cse27.foodbee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;
import android.widget.TextView;


import com.cse27.foodbee.Controller.FeedbackController;
import com.cse27.foodbee.Controller.FeedbackControllerInterface;
import com.cse27.foodbee.View.FeedbackViewInterface;

public class FeedBack extends AppCompatActivity {
    /**
     * This is an Feedback view file. Where we will implement a feedback page where customer can review about
     * their likeable or dislikeable food.
     */
    EditText edtFeed;
    TextView tvFeedback;
    RatingBar rbStars;
    @Override

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        edtFeed = findViewById(R.id.edtFeedback);
        tvFeedback = findViewById(R.id.tvFeedback);
        rbStars = findViewById(R.id.rbStars);
        /**
         * onRatingChanged is a class where we will show which number is customer gave to the food he/she taken.
         * It will rate the food in floating number and customer will see the result.
         */
        rbStars.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
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
                else{

                }
            }
        });
    }

}
