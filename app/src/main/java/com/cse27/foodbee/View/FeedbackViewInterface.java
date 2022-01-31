package com.cse27.foodbee.View;


import android.widget.RatingBar;

public interface FeedbackViewInterface {
    void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser);
}
